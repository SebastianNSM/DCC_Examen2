package com.ssoto.examen2.repository;

import java.util.List;

import com.ssoto.examen2.domain.Guion;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GuionRepository
 */
public interface GuionRepository extends JpaRepository<Guion, Long> {
    List<Guion> findByNombreContainingIgnoreCase(String nombre);

    List<Guion> findByGeneroContainingIgnoreCase(String genero);
}
