package com.ssoto.examen2.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "t_actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "genero")
    private String genero;

    @Column(name = "estatura")
    private int estatura;

    @Column(name = "color_ojos")
    private String colorOjos;

    @Column(name = "color_pelo")
    private String colorPelo;

    @Column(name = "complexion_corporal")
    private String complexionCorporal;

    @Column(name = "fecha_nacimiento")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Column(name = "edad")
    private int edad;

    public String getCreatedAsShort() {
        return format.format(this.fechaNacimiento);
    }

    public Actor(String nombre, String genero, int estatura, String colorOjos, String colorPelo,
            String complexionCorporal, String fechaNacimiento) throws ParseException {
        this.nombre = nombre;
        this.genero = genero;
        this.estatura = estatura;
        this.colorOjos = colorOjos;
        this.colorPelo = colorPelo;
        this.complexionCorporal = complexionCorporal;
        this.fechaNacimiento = format.parse(fechaNacimiento);
        LocalDate d = this.fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.edad = Period.between(d, LocalDate.now()).getYears();
    }

    public Actor() {
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

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getComplexionCorporal() {
        return complexionCorporal;
    }

    public void setComplexionCorporal(String complexionCorporal) {
        this.complexionCorporal = complexionCorporal;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Actor [colorOjos=" + colorOjos + ", colorPelo=" + colorPelo + ", complexionCorporal="
                + complexionCorporal + ", estatura=" + estatura + ", fechaNacimiento=" + this.getCreatedAsShort()
                + ", edad=" + this.getEdad() + ", genero=" + genero + ", id=" + id + ", nombre=" + nombre + "]";
    }
}
