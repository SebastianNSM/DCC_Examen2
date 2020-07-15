package com.ssoto.examen2.web;

import java.text.ParseException;

import com.ssoto.examen2.domain.Guionista;
import com.ssoto.examen2.service.GuionistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * GuionistaController
 */
@Controller
public class GuionistaController {

    @Autowired
    GuionistaService guionistaService;

    @GetMapping("guionista")
    public String index(Model model) throws ParseException {
        model.addAttribute("guionistas", guionistaService.findAll());
        return "guionista";
    }

    @PostMapping("guionista/reg")
    public String submitForm(@ModelAttribute Guionista guionista) {
        guionistaService.save(guionista);
        return "redirect:/home";
    }

    @GetMapping("guionista/reg")
    public String getForm(Model model) {
        model.addAttribute("guionista", new Guionista());
        return "reg_guionista";
    }

}
