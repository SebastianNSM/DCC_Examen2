package com.ssoto.examen2.repository;

import java.util.List;

import com.ssoto.examen2.domain.Actor;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ActorRepository
 */
public interface ActorRepository extends JpaRepository<Actor, Long> {
    List<Actor> findByNombreContainingIgnoreCase(String nombre);
}
