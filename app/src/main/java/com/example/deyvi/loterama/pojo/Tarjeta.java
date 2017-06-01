package com.example.deyvi.loterama.pojo;

/**
 * Created by deyvi on 30/05/2017.
 */

public class Tarjeta {
    String name ;
    int    numero;
    int    image;

    public Tarjeta(String name, int numero, int image) {
        this.name = name;
        this.numero = numero;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
