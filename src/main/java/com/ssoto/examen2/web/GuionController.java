package com.ssoto.examen2.web;

import java.text.ParseException;

import com.ssoto.examen2.domain.Actor;
import com.ssoto.examen2.domain.Guion;
import com.ssoto.examen2.domain.Guionista;
import com.ssoto.examen2.service.ActorService;
import com.ssoto.examen2.service.GuionService;
import com.ssoto.examen2.service.GuionistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * GuionController
 */
@Controller
public class GuionController {

    @Autowired
    ActorService actorService;

    @Autowired
    GuionService guionService;

    @Autowired
    GuionistaService guionistaService;

    @GetMapping("guion")
    public String index(Model model) throws ParseException {
        model.addAttribute("guiones", guionService.findAll());
        return "guion";
    }

    // pone guion en produccion true
    @PostMapping("guion/set-produccion/{id}")
    public String getByNombre(@PathVariable(name = "id") Long id, Model model) {
        Guion guion = guionService.findById(id);
        guion.setProduccion(true);
        guionService.save(guion);
        return "redirect:/guion";
    }

    // muestra solo guiones en produccion
    @GetMapping("guion/prod/lst")
    public String showProduccion(Model model) {
        model.addAttribute("guiones", guionService.findProduccion());
        return "guion_prod_lst";
    }

    // muestra formulario para asociar actores
    @GetMapping("guion/produccion/{id}")
    public String getAsociarActoresForm(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("guionId", id);
        model.addAttribute("hombres", actorService.findByGeneroContainingIgnoreCase("hombre"));
        model.addAttribute("mujeres", actorService.findByGeneroContainingIgnoreCase("mujer"));
        return "prod_guion";
    }

    // asocia actores a guion
    @PostMapping("guion/produccion")
    public String toggleProduccion(@RequestParam(value = "gId") long id, @RequestParam(value = "a1") long a1,
            @RequestParam(value = "a2") long a2, Model model) {
        Guion guion = guionService.findById(id);
        Actor actor1 = actorService.findById(a1);
        Actor actor2 = actorService.findById(a2);
        guion.getActores().add(actor1);
        guion.getActores().add(actor2);
        guionService.save(guion);
        return "redirect:/guion";
    }

    @GetMapping("guion/reg")
    public String getForm(Model model) {
        model.addAttribute("guionistas", guionistaService.findAll());
        model.addAttribute("guion", new Guion());
        model.addAttribute("guionista", new Guionista());
        return "reg_guion";
    }

    @PostMapping("guion/reg")
    public String submitForm(@ModelAttribute("guion") Guion guion, @ModelAttribute("guionista") Guionista guionista,
            BindingResult result) {
        guion.setGuionista(guionista);
        guionService.save(guion);
        return "redirect:/home";
    }

    @GetMapping("guion/find-by-genero")
    public String getByGenero(@RequestParam(value = "genero") String genero, Model model) {
        model.addAttribute("guiones", guionService.findByGenero(genero));
        return "guion";
    }

    @GetMapping("guion/find-by-nombre")
    public String getByNombre(@RequestParam(value = "nombre") String nombre, Model model) {
        model.addAttribute("guiones", guionService.findByNombre(nombre));
        return "guion";
    }

}
