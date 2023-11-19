package com.example.HamRom.service;

import com.example.HamRom.dao.ClientDao;
import com.example.HamRom.dto.ClientDto;
import com.example.HamRom.entity.Client;
import com.example.HamRom.repository.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {

    public ClientDao clientDao;

    public ClientStore clientStore;

    public ClientRepository repository;

    public ClientService(ClientDao clientDao, ClientStore clientStore, ClientRepository repository) {
        this.clientDao = clientDao;
        this.clientStore = clientStore;
        this.repository = repository;
    }

    public Client saveClient(ClientDto clientDto) {
        return clientStore.save(clientDto);
    }

    public List<Client> saveClients(List<ClientDto> clients) {
        return clientStore.saveAll(clients);
    }

    public List<ClientDto> getAllClients() {
        return clientStore.getAllClients();
    }

    public ClientDto getClientById(UUID id) {
        return clientStore.getClient(id);
    }

    public ClientDto update(ClientDto clientDto){
        if (!clientExist(clientDto.getClientId())){
            throw new IllegalArgumentException("Clientul nu este gasit");
        }
        return clientStore.update(clientDto);
    }

    public Boolean clientExist(String clientDto){
        return clientStore.clientExists(clientDto);
    }

    public void deleteClient(UUID id) {
        clientStore.deleteClient(id);
    }

}
