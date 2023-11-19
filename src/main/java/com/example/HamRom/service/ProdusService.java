package com.example.HamRom.service;

import com.example.HamRom.dao.ClientDao;
import com.example.HamRom.dao.ProdusDao;
import com.example.HamRom.dto.ClientDto;
import com.example.HamRom.dto.ProdusDto;
import com.example.HamRom.entity.Client;
import com.example.HamRom.entity.Produs;
import com.example.HamRom.repository.ClientRepository;
import com.example.HamRom.repository.ProdusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ProdusService {

    public ProdusDao produsDao;

    public ProdusStore produsStore;

    public ProdusRepository repository;

    public ProdusService(ProdusDao produsDao, ProdusStore produsStore, ProdusRepository repository) {
        this.produsDao = produsDao;
        this.produsStore = produsStore;
        this.repository = repository;
    }

    public Produs saveProdus(ProdusDto produsDto) {
        return produsStore.save(produsDto);
    }

    public List<Produs> saveProduse(List<ProdusDto> produse) {
        return produsStore.saveAll(produse);
    }

    public List<ProdusDto> getAllProduse() {
        return produsStore.getAllProduse();
    }

    public ProdusDto getProdusById(UUID id) {
        return produsStore.getProdus(id);
    }

    public ProdusDto update(ProdusDto produsDto){
        if (!produsExist(produsDto.getProdusId())){
            throw new IllegalArgumentException("Produsul nu este gasit");
        }
        return produsStore.update(produsDto);
    }

    public Boolean produsExist(String produsDto){
        return produsStore.produsExists(produsDto);
    }

    public void deleteProdus(UUID id) {
        produsStore.deleteProdus(id);
    }

}
