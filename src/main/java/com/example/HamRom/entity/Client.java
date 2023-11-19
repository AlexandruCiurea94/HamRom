package com.example.HamRom.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.List;
import java.util.UUID;

import static jakarta.persistence.EnumType.STRING;


@Entity
@Table(name = "client" ,schema = "magazin")
public class Client {

   @Id
   @GeneratedValue(generator = "system-uuid",strategy = GenerationType.IDENTITY)
   @GenericGenerator(name = "system-uuid", strategy = "uuid2")
   @Column(name = "id")
    private UUID id;
    @Column(name = "firt_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String eMail;
    @Column(name = "numar")
    private Double numar;
    @Column(name = "adresa")
    private String adresa;
    @Enumerated(STRING)
    @Column(name = "type")
    private ClientType type;



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
