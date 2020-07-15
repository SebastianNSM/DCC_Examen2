package com.ssoto.examen2.service;

import java.util.List;

import com.ssoto.examen2.domain.Guionista;

public interface GuionistaService {

    public void save(Guionista newGuionista);

    public List<Guionista> findAll();

    public Guionista findById(Long id);
}
