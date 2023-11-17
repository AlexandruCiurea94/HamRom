package com.example.HamRom.repository;

import com.example.HamRom.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByFirstName(String firstName);
    Client findByLastName(String lastName);
    Client findByNumar(Integer numar);
    Client findByeMail(String eMail);
    Client findByAdresa(String adresa);






}
