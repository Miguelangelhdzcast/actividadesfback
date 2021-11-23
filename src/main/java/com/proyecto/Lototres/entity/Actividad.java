package com.proyecto.Lototres.entity;

import org.springframework.context.annotation.ComponentScan;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Blob;
@ComponentScan(basePackages ={"com.proyecto.Lototres.service.ActividadService"})

@Entity
@Table (name = "actividad")
public class Actividad implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_act")
    private Long id_act;
    @Column(name = "nombre_act")
    private String nombre_act;
    @Column(name = "fecha_act")
    private String fecha_act;
    @Column (name = "horario_Act")
    private String horario_act;
    @Column(name = "info_principal")
    private String info_principal;
    @Column (name = "imagen")
    private Blob imagen;

    public Actividad() {

    }

    public Actividad(long id_act, String nombre_act, String fecha_act, String horario_act, String info_principal, Blob imagen) {
        this.id_act = id_act;
        this.nombre_act = nombre_act;
        this.fecha_act = fecha_act;
        this.horario_act = horario_act;
        this.info_principal = info_principal;
        this.imagen = imagen;
    }

    public Actividad(String nom_act) {

    }


    public long getId_act() {
        return id_act;
    }

    public void setId_act(long id_act) {
        this.id_act = id_act;
    }

    public String getNombre_act() {
        return nombre_act;
    }

    public void setNombre_act(String nombre_act) {
        this.nombre_act = nombre_act;
    }

    public String getFecha_act() {
        return fecha_act;
    }

    public void setFecha_act(String fecha_act) {
        this.fecha_act = fecha_act;
    }

    public String getHorario_act() {
        return horario_act;
    }

    public void setHorario_act(String horario_act) {
        this.horario_act = horario_act;
    }

    public String getInfo_principal() {
        return info_principal;
    }

    public void setInfo_principal(String info_principal) {
        this.info_principal = info_principal;
    }

    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }
}
