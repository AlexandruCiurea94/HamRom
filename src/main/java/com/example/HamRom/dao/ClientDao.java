package com.example.HamRom.dao;


import com.example.HamRom.dto.ClientDto;
import com.example.HamRom.entity.Client;
import com.example.HamRom.mappers.IClientMappers;
import com.example.HamRom.repository.ClientRepository;
import com.example.HamRom.service.ClientStore;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@Transactional
public class ClientDao implements ClientStore {

    private IClientMappers iClientMappers;
    private ClientRepository clientRepository;

    public ClientDao(IClientMappers iClientMappers, ClientRepository clientRepository) {
        this.iClientMappers = iClientMappers;
        this.clientRepository = clientRepository;
    }

    @Override
    public Client save(ClientDto client) {
       return clientRepository.save(iClientMappers.destinationToSource(client));
    }

    @Override
    public List<Client> saveAll(List<ClientDto> clientDtos) {
        List<Client> clients = clientDtos.stream()
                .map(iClientMappers::destinationToSource)
                .collect(Collectors.toList());

        return clientRepository.saveAll(clients);
    }

    @Override
    public ClientDto getClient(UUID id) {
        return iClientMappers.sourceToDestination(clientRepository.getOne(id));
    }

    @Override
    public Boolean clientExists(String clientDto) {
        return clientRepository.existsById(UUID.fromString(clientDto));
    }

    @Override
    public ClientDto update(ClientDto clientDto) {
        Optional<Client> client = clientRepository.findById(UUID.fromString((clientDto.getClientId())));
        Client clientEnitity = null;
        if (client.isPresent()){
            clientEnitity = client.get();
            clientEnitity.setFirstName(clientDto.getFirstName());
            clientEnitity.setLastName(clientDto.getLastName());
            clientEnitity.seteMail(clientDto.geteMail());
            clientEnitity.setNumar(clientDto.getNumar());
            clientEnitity.setAdresa(clientDto.getAdresa());
            clientRepository.save(clientEnitity);
        }

        return iClientMappers.sourceToDestination(clientEnitity);
    }

    @Override
    public void deleteClient(UUID id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<ClientDto> getAllClients(){
        List<Client> clients = clientRepository.findAll();
        return clients.stream()
                .map(iClientMappers::sourceToDestination)
                .collect(Collectors.toList());
    }


}
