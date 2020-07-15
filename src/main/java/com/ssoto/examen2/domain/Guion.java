package com.ssoto.examen2.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_guion")
public class Guion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "genero")
    private String genero;

    @Column(name = "idea_central")
    private String ideaCentral;

    @ManyToMany(fetch = FetchType.EAGER)
    public List<Actor> actores;

    @ManyToOne
    @JoinColumn(name = "id_guionista")
    public Guionista guionista;

    @Column(name = "produccion")
    public boolean produccion;

    public Guion(String nombre, String genero, String ideaCentral, Guionista guionista) {
        this.nombre = nombre;
        this.genero = genero;
        this.ideaCentral = ideaCentral;
        this.guionista = guionista;
        this.produccion = false;
        this.actores = new ArrayList<Actor>();
    }

    public Guion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdeaCentral() {
        return ideaCentral;
    }

    public void setIdeaCentral(String ideaCentral) {
        this.ideaCentral = ideaCentral;
    }

    public Guionista getGuionista() {
        return guionista;
    }

    public void setGuionista(Guionista guionista) {
        this.guionista = guionista;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    public boolean isProduccion() {
        return produccion;
    }

    public void setProduccion(boolean produccion) {
        this.produccion = produccion;
    }

    public void toggleProduccion() {
        this.produccion = !this.produccion;
    }

    @Override
    public String toString() {
        return "Guion [actores=" + actores + ", genero=" + genero + ", guionista=" + guionista.getNombre() + ", id="
                + id + ", ideaCentral=" + ideaCentral + ", nombre=" + nombre + ", produccion=" + produccion + "]";
    }

}
