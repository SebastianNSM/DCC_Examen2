package com.ssoto.examen2.loader;

import java.text.ParseException;

import com.ssoto.examen2.domain.Actor;
import com.ssoto.examen2.service.ActorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
class ActorLoader implements CommandLineRunner {

    @Autowired
    private ActorService actorService;

    private final Logger logger = LoggerFactory.getLogger(GuionLoader.class);

    @Override
    public void run(String... args) throws Exception {
        regActores();
        // showActorInfo();
        // actoresMenores(13);
    }

    public void showActorInfo() {
        logger.info(actorService.findById((long) 1).toString());
    }

    public void actoresMenores(int edad) {
        logger.info("Actores de edad menor o igual a:\t" + edad);
        actorService.findByEdadMenorIgual(edad).forEach(a -> logger.info(a.getNombre() + "\t" + a.getEdad()));
        ;
    }

    private void regActores() throws ParseException {
        actorService.save(new Actor("Actor1", "mujer", 182, "ColorOjos1", "ColorPelo1", "promedio", "03/00/2000"));
        actorService.save(new Actor("Actor2", "hombre", 182, "ColorOjos2", "ColorPelo2", "promedio", "03/11/2001"));
        actorService.save(new Actor("Actor3", "mujer", 182, "ColorOjos3", "ColorPelo3", "promedio", "03/12/2012"));
        actorService.save(new Actor("Actor4", "hombre", 182, "ColorOjos4", "ColorPelo4", "promedio", "03/13/2013"));
        actorService.save(new Actor("Actor5", "mujer", 182, "ColorOjos5", "ColorPelo5", "promedio", "03/14/2004"));
        actorService.save(new Actor("Actor6", "hombre", 182, "ColorOjos6", "ColorPelo6", "promedio", "03/15/2005"));
        actorService.save(new Actor("Actor7", "mujer", 182, "ColorOjos7", "ColorPelo7", "promedio", "03/16/2016"));
        actorService.save(new Actor("Actor8", "hombre", 182, "ColorOjos8", "ColorPelo8", "promedio", "03/17/2007"));
        logger.info("ACTOR REGISTRADO #8");
    }

}
