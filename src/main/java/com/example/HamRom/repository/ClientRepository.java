package com.example.HamRom.repository;

import com.example.HamRom.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ClientRepository extends JpaRepository<Client, UUID>{

}
