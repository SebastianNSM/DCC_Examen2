package com.ssoto.examen2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Guion
 */
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

    public Guion() {
    }

    public Guion(String nombre, String genero, String ideaCentral, Long idGuionista) {
        this.nombre = nombre;
        this.genero = genero;
        this.ideaCentral = ideaCentral;
        this.idGuionista = idGuionista;
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

    public Long getIdGuionista() {
        return idGuionista;
    }

    public void setIdGuionista(Long idGuionista) {
        this.idGuionista = idGuionista;
    }

}
