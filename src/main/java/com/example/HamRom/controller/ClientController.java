package com.example.HamRom.controller;

import com.example.HamRom.dto.ClientDto;
import com.example.HamRom.entity.Client;
import com.example.HamRom.repository.ClientRepository;
import com.example.HamRom.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/client")

public class ClientController {
    @Autowired
    public ClientService clientService;
    @Autowired
    public ClientRepository clientRepository;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody ClientDto client) {
        return clientService.saveClient(client);

    }
    @PostMapping("/addClients")
    public List<Client>addClients(@RequestBody List<ClientDto>clients){
        return clientService.saveClients(clients);
    }

   @GetMapping("/allClients")
    public List<ClientDto> allClients(){
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public ClientDto getOne(@PathVariable("id")UUID id){
        return clientService.getClientById(id);
    }

    @PutMapping("/{id}")
    public ClientDto update(@PathVariable("id")UUID id, @RequestBody ClientDto clientDto){
        return clientService.update(clientDto);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable("id")UUID id){
        clientService.deleteClient(id);
    }



}
