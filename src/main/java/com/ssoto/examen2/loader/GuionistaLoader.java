package com.ssoto.examen2.loader;

import java.text.ParseException;

import com.ssoto.examen2.domain.Guionista;
import com.ssoto.examen2.service.GuionistaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
class GuionistaLoader implements CommandLineRunner {

    @Autowired
    private GuionistaService guionistaService;

    private final Logger logger = LoggerFactory.getLogger(GuionLoader.class);

    @Override
    public void run(String... args) throws Exception {
        regGuionistas();
    }

    private void regGuionistas() throws ParseException {
        guionistaService.save(new Guionista("Guionista1", "Direccion1", "email1@ejemplo.com", "03/00/2000"));
        guionistaService.save(new Guionista("Guionista2", "Direccion2", "email2@ejemplo.com", "03/11/2001"));
        guionistaService.save(new Guionista("Guionista3", "Direccion3", "email3@ejemplo.com", "03/12/2002"));
        guionistaService.save(new Guionista("Guionista4", "Direccion4", "email4@ejemplo.com", "03/13/2003"));
        guionistaService.save(new Guionista("Guionista5", "Direccion5", "email5@ejemplo.com", "03/14/2004"));
        guionistaService.save(new Guionista("Guionista6", "Direccion6", "email6@ejemplo.com", "03/15/2005"));
        guionistaService.save(new Guionista("Guionista7", "Direccion7", "email7@ejemplo.com", "03/16/2006"));
        logger.info("GUIONISTA REGISTRADO #7");
    }

}
