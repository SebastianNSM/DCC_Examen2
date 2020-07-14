package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Guion;

/**
 * GuionService
 */
public interface GuionService {

    public void save(Guion newGuion);

    public List<Guion> getAll();

    public Guion getById(Long id);

    public List<Guion> getByNombre(String nombre);

    public List<Guion> getByGenero(String genero);
}
