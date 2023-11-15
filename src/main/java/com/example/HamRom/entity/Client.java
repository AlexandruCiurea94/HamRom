package com.example.HamRom.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;


@Entity
@Table


public class Client {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")


    private int id;
    @Column(name = "firt_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String eMail;



}
