package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Actor;

/**
 * ActorService
 */
public interface ActorService {

    public void save(Actor newActor);

    public List<Actor> getAll();

    public Actor getById(Long id);

    public List<Actor> getByNombre(String nombre);
}
