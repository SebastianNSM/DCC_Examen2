package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Actor;

/**
 * ActorService
 */
public interface ActorService {

    public void save(Actor newActor);

    public List<Actor> findAll();

    public Actor findById(Long id);

    public List<Actor> findByNombre(String nombre);

    public List<Actor> findByEdadMenorIgual(int edad);
}
