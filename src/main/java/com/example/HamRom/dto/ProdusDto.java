package com.example.HamRom.dto;

public class ProdusDto {

    private String produsId;
    private String calitate;
    private int dimensiune;
    private int greutate;


    public String getProdusId() {
        return produsId;
    }

    public void setProdusId(String produsId) {
        this.produsId = produsId;
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
