package com.ssoto.examen2.web;

import java.text.ParseException;

import com.ssoto.examen2.domain.Guion;
import com.ssoto.examen2.domain.Guionista;
import com.ssoto.examen2.service.GuionService;
import com.ssoto.examen2.service.GuionistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * GuionController
 */
@Controller
public class GuionController {

    @Autowired
    GuionService guionService;

    @Autowired
    GuionistaService guionistaService;

    @GetMapping("guion")
    public String index(Model model) throws ParseException {
        model.addAttribute("guiones", guionService.findAll());
        return "guion";
    }

    @PostMapping("guion/reg")
    public String submitForm(@ModelAttribute Guion guion) {
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

    @GetMapping("guion/reg")
    public String getForm(Model model) {
        model.addAttribute("guionistas", guionistaService.findAll());
        model.addAttribute("guion", new Guion());
        return "reg_guion";
    }

}
