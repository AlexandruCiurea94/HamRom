package com.example.HamRom.controller;

import com.example.HamRom.entity.Client;
import com.example.HamRom.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")

public class ClientController {

    @Autowired
    public ClientService clientService;

    @PostMapping("/addClient")
    public Client addclient(@RequestBody Client client) {
        return clientService.saveClient(client);

    }

    @PostMapping("/addClients")
    public List<Client> addClients(@RequestBody List<Client> clients) {
        return clientService.saveClients(clients);
    }




}
