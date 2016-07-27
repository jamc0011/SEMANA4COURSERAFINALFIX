package com.jamc0011.courserasemana3.pojo;

public class Perro {

    private String nombre;
    private String favorito;
    private int foto;

    public Perro(String nombre, String favorito, int foto) {
        this.nombre = nombre;
        this.favorito = favorito;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}