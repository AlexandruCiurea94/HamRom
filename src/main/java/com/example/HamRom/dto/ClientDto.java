package com.example.HamRom.dto;

import com.example.HamRom.entity.ClientType;

public class ClientDto {

    private String clientId;
    private String firstName;
    private String lastName;
    private String eMail;
    private Double numar;
    private String adresa;
    private ClientType type;


    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Double getNumar() {
        return numar;
    }

    public void setNumar(Double numar) {
        this.numar = numar;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }
}
