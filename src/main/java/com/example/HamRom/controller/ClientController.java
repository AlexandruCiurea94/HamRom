package com.example.HamRom.controller;

import com.example.HamRom.entity.Client;
import com.example.HamRom.repository.ClientRepository;
import com.example.HamRom.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")

public class ClientController {

    @Autowired
    public ClientService clientService;

    public ClientController(ClientService service){this.clientService= service;}
    public ClientRepository clientRepository;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return clientRepository.save(client);

    }

   @GetMapping("/{id}")
public List<Client> allClients(){return clientRepository.findAll();}






}
