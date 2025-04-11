package org.gerdoc.model;

public class Municipio
{
    private Integer id;
    private String nombre;
private Estado estado;
    public Municipio() {
    }

    public Integer getId() {
        return id;
    }

    public Municipio(Integer id, String nombre, Estado estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
