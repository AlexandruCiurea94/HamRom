package com.example.HamRom.service;

import com.example.HamRom.dto.ClientDto;
import com.example.HamRom.entity.Client;

import java.util.List;
import java.util.UUID;

public interface ClientStore {

Client save (ClientDto clientDto);
List<Client> saveAll(List<ClientDto> clientDto);
ClientDto getClient(UUID uuid);
Boolean clientExists(String clientDto);
ClientDto update(ClientDto clientDto);
void deleteClient(UUID uuid);
List<ClientDto> getAllClients();

}
