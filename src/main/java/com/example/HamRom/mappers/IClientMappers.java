package com.example.HamRom.mappers;

import com.example.HamRom.dto.ClientDto;
import com.example.HamRom.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Mapper(componentModel ="spring")
public interface IClientMappers {

    @Mapping(target = "clientId", source = "client.id")
    @Mapping(target = "firstName", source = "client.firstName")
    @Mapping(target = "lastName", source = "client.lastName")
    @Mapping(target = "eMail", source = "client.eMail")
    @Mapping(target = "numar", source = "client.numar")
    @Mapping(target = "adresa", source = "client.adresa")
    ClientDto sourceToDestination(Client client);


    @Mapping(target = "id", source = "clientDto.clientId")
    @Mapping(target = "firstName", source = "clientDto.firstName")
    @Mapping(target = "lastName", source = "clientDto.lastName")
    @Mapping(target = "eMail", source = "clientDto.eMail")
    @Mapping(target = "numar", source = "clientDto.numar")
    @Mapping(target = "adresa", source = "clientDto.adresa")
    Client destinationToSource(ClientDto clientDto);



}
