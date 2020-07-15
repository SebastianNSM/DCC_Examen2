package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Guion;
import com.ssoto.examen2.repository.GuionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuionServiceImpl implements GuionService {

    @Autowired
    GuionRepository guionRepository;

    @Override
    public void save(Guion newGuion) {
        guionRepository.save(newGuion);

    }

    @Override
    public List<Guion> findAll() {
        return guionRepository.findAll();
    }

    @Override
    public Guion findById(Long id) {
        return guionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Guion> findByNombre(String nombre) {
        return guionRepository.findByNombreContainingIgnoreCase(nombre);
    }

    @Override
    public List<Guion> findByGenero(String genero) {
        return guionRepository.findByGeneroContainingIgnoreCase(genero);
    }

    @Override
    public List<Guion> findProduccion() {
        return guionRepository.findByProduccionTrue();
    }
}
