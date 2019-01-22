package com.example.a16alfonsofa.listapersonalizada2;

/**
 * Created by a16alfonsofa on 17/01/2019.
 */

public class Animal {
    private String nombre;
    private String desc;
    private int img;

    public Animal(String nombre, String desc, int img) {
        this.nombre = nombre;
        this.desc = desc;
        this.img = img;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
