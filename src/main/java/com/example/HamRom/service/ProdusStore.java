package com.example.HamRom.service;

import com.example.HamRom.dto.ClientDto;
import com.example.HamRom.dto.ProdusDto;
import com.example.HamRom.entity.Client;
import com.example.HamRom.entity.Produs;

import java.util.List;
import java.util.UUID;

public interface ProdusStore {

    Produs save (ProdusDto produsDto);
    List<Produs> saveAll(List<ProdusDto> produsDto);
    ProdusDto getProdus(UUID uuid);
    Boolean produsExists(String produsDto);
    ProdusDto update(ProdusDto produsDto);
    void deleteProdus(UUID uuid);
    List<ProdusDto> getAllProduse();

}
