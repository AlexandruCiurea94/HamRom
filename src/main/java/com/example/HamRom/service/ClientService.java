package com.example.HamRom.service;

import com.example.HamRom.entity.Client;
import com.example.HamRom.repository.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class ClientService {

    @Autowired
    private ClientRepository repository;

    public Client saveClient(Client client) {
        return repository.save(client);
    }

    public List<Client> saveClients(List<Client> clients) {
        return repository.saveAll(clients);
    }

    public List<Client> getClients() {
        return repository.findAll();
    }

    public Optional<Client> getClientById(int id) {
        return repository.findById(id);
    }

    public Client getClientByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    public Client getClientByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    public Client getClientByNumar(Integer numar) {
        return repository.findByNumar(numar);
    }

    public Client getClientByeMail(String eMail) {
        return repository.findByeMail(eMail);
    }

    public Client getByAdresa(String adresa) {
        return repository.findByAdresa(adresa);
    }


    public String deleteClient(int id) {
        repository.deleteById(id);
        return "client sters" + id;
    }


}
