package com.example.HamRom.repository;


import com.example.HamRom.entity.Produs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdusRepository   extends JpaRepository<Produs, UUID> {


}
