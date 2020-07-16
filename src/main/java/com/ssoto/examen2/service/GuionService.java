package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Guion;

public interface GuionService {

    public void save(Guion newGuion);

    public List<Guion> findAll();

    public Guion findById(Long id);

    public List<Guion> findByNombre(String nombre);

    public List<Guion> findByGenero(String genero);

    public List<Guion> findProduccion();

}
