package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Actor;
import com.ssoto.examen2.repository.ActorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ActorServiceImpl
 */
@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    ActorRepository actorRepository;

    @Override
    public void save(Actor newActor) {
        actorRepository.save(newActor);

    }

    @Override
    public List<Actor> getAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor getById(Long id) {
        return actorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Actor> getByNombre(String nombre) {
        return actorRepository.findByNombreContainingIgnoreCase(nombre);
    }

}
