package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Guionista;

/**
 * GuionistaService
 */
public interface GuionistaService {

    public void save(Guionista newGuionista);

    public List<Guionista> getAll();

    public Guionista getById(Long id);
}
