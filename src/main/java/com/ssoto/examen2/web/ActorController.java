package com.ssoto.examen2.web;

import java.text.ParseException;

import com.ssoto.examen2.domain.Actor;
import com.ssoto.examen2.service.ActorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ActorController
 */
@Controller
public class ActorController {

    @Autowired
    ActorService actorService;

    @GetMapping("actor")
    public String index(Model model) throws ParseException {
        model.addAttribute("actores", actorService.findAll());
        return "actor";
    }

    @PostMapping("actor/reg")
    public String submitForm(@ModelAttribute Actor actor) {
        actorService.save(actor);
        return "redirect:/home";
    }

    @GetMapping("actor/reg")
    public String getForm(Model model) {
        model.addAttribute("actor", new Actor());
        return "reg_actor";
    }

    @GetMapping("actor/find-by-nombre")
    public String getByNombre(@RequestParam(value = "nombre") String nombre, Model model) {
        model.addAttribute("actores", actorService.findByNombre(nombre));
        return "actor";
    }

}
