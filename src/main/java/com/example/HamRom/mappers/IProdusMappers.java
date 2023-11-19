package com.example.HamRom.mappers;


import com.example.HamRom.dto.ProdusDto;
import com.example.HamRom.entity.Produs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel ="spring")
public interface IProdusMappers {

    @Mapping(target = "produsId", source = "produs.id")
    ProdusDto sourceToDestination(Produs produs);


    @Mapping(target = "id", source = "produsDto.produsId")
    Produs destinationToSource(ProdusDto produsDto);

}
