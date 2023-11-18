package com.example.HamRom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Produs {
    @Column(name = "calitate")
    private String calitate;
    @Column(name = "dimensiune")
    private int dimensiune;
    @Column(name = "greutate")
    private int greutate;


    public Produs() {
        this.calitate = calitate;
        this.dimensiune = dimensiune;
        this.greutate = greutate;
    }

    public String getCalitate() {
        return calitate;
    }

    public void setCalitate(String calitate) {
        this.calitate = calitate;
    }

    public int getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
}
