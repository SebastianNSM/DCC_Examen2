package com.ssoto.examen2.loader;

import java.text.ParseException;

import com.ssoto.examen2.domain.Guion;
import com.ssoto.examen2.domain.Guionista;
import com.ssoto.examen2.service.ActorService;
import com.ssoto.examen2.service.GuionService;
import com.ssoto.examen2.service.GuionistaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
class GuionLoader implements CommandLineRunner {

    @Autowired
    private GuionistaService guionistaService;

    @Autowired
    private ActorService actorService;

    @Autowired
    private GuionService guionService;

    private final Logger logger = LoggerFactory.getLogger(GuionLoader.class);

    @Override
    public void run(String... args) throws Exception {
        regGuiones();
        // addActors(1, 1, 2);
        // showGuionInfo((long) 1);
    }

    private void addActors(int idGuion, int idActor1, int idActor2) {
        var g = guionService.findById((long) idGuion);
        var a1 = actorService.findById((long) idActor1);
        var a2 = actorService.findById((long) idActor2);
        g.actores.add(a1);
        g.actores.add(a1);
        g.toggleProduccion();
        guionService.save(g);
    }

    private void showGuionInfo(Long id) {
        Guion g = guionService.findById(id);
        logger.info(g.toString());
    }

    private void regGuiones() throws ParseException {
        Guionista g8 = new Guionista("Guionista8", "Direccion8", "email8@ejemplo.com", "03/17/2007");
        guionistaService.save(g8);
        guionService.save(new Guion("Guion1", "drama", "ic", g8));
        logger.info("GUION REGISTRADO");
    }

    private void agregarProduccion(Long idGuion) {
        Guion g = guionService.findById(idGuion);
        g.toggleProduccion();
        guionService.save(g);
    }

    private void showGuionProduccion() {
        guionService.findProduccion().stream().forEach(g -> logger.info(g.getNombre()));
    }
}
