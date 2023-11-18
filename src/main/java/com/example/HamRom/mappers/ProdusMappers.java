package com.example.HamRom.mappers;

import com.example.HamRom.dto.ProdusDto;
import com.example.HamRom.entity.Produs;
import org.mapstruct.Mapper;

@Mapper
public interface ProdusMappers {

ProdusDto sourcetoDestination(Produs produs);
Produs destinationToSource(ProdusDto produsDto);



}
