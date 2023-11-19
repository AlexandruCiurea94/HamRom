package com.example.HamRom.mappers;

import com.example.HamRom.dto.ClientDto;
import com.example.HamRom.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel ="spring")
public interface IClientMappers {

    @Mapping(target = "clientId", source = "client.id")
    ClientDto sourceToDestination(Client client);


    @Mapping(target = "id", source = "clientDto.clientId")
    Client destinationToSource(ClientDto clientDto);



}
