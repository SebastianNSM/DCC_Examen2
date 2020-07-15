package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Guionista;
import com.ssoto.examen2.repository.GuionistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * GuionistaServiceImpl
 */
@Service
public class GuionistaServiceImpl implements GuionistaService {

    @Autowired
    GuionistaRepository guionRepository;

    @Override
    public void save(Guionista newGuionista) {
        guionRepository.save(newGuionista);

    }

    @Override
    public List<Guionista> findAll() {
        return guionRepository.findAll();
    }

    @Override
    public Guionista findById(Long id) {
        return guionRepository.findById(id).orElse(null);
    }

}
