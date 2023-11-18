package com.example.HamRom.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "produs", schema ="magazin" )
public class Produs {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id")
    private UUID id;
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
