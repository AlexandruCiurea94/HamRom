package com.example.HamRom.controller;


import com.example.HamRom.dto.ProdusDto;
import com.example.HamRom.entity.Client;
import com.example.HamRom.entity.Produs;
import  com.example.HamRom.repository.ProdusRepository;
import com.example.HamRom.service.ProdusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/produs")
public class ProdusController {


        @Autowired
        public ProdusService produsService;
        @Autowired
        public ProdusRepository produsRepository;

        @PostMapping("/addProdus")
        public Produs addProdus(@RequestBody ProdusDto produs) {
            return produsService.saveProdus(produs);

        }
        @PostMapping("/addProduse")
        public List<Produs> addProdus(@RequestBody List<ProdusDto>produse){
            return produsService.saveProduse(produse);
        }

        @GetMapping("/allProdus")
        public List<ProdusDto> allProduse(){
            return produsService.getAllProduse();
        }

        @GetMapping("/{id}")
        public ProdusDto getOne(@PathVariable("id") UUID id){
            return produsService.getProdusById(id);
        }

        @PutMapping("/{id}")
        public ProdusDto update(@PathVariable("id")UUID id, @RequestBody ProdusDto produsDto){
            return produsService.update(produsDto);
        }

        @DeleteMapping("/{id}")
        public void deleteProdus(@PathVariable("id")UUID id){
            produsService.deleteProdus(id);
        }



    }



