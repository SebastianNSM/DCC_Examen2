package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Guion;
import com.ssoto.examen2.repository.GuionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * GuionServiceImpl
 */
@Service
public class GuionServiceImpl implements GuionService {

    @Autowired
    GuionRepository guionRepository;

    @Override
    public void save(Guion newGuion) {
        guionRepository.save(newGuion);

    }

    @Override
    public List<Guion> getAll() {
        return guionRepository.findAll();
    }

    @Override
    public Guion getById(Long id) {
        return guionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Guion> getByNombre(String nombre) {
        return guionRepository.findByNombreContainingIgnoreCase(nombre);
    }

    @Override
    public List<Guion> getByGenero(String genero) {
        return guionRepository.findByGeneroContainingIgnoreCase(genero);
    }
}
