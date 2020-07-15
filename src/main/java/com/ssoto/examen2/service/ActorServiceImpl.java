package com.ssoto.examen2.service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor findById(Long id) {
        return actorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Actor> findByNombre(String nombre) {
        return actorRepository.findByNombreContainingIgnoreCase(nombre);
    }

    @Override
    public List<Actor> findByEdadMenorIgual(int edad) {
        // List<Actor> lst = actorRepository.findAll();
        List<Actor> lst = actorRepository.findByEdadLessThanEqual(edad);
        return lst.stream().filter(a -> a.getEdad() <= edad).collect(Collectors.toList());
    }

}
