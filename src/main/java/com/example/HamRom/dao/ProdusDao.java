package com.example.HamRom.dao;

import com.example.HamRom.dto.ProdusDto;
import com.example.HamRom.entity.Produs;
import com.example.HamRom.mappers.IProdusMappers;
import com.example.HamRom.repository.ProdusRepository;
import com.example.HamRom.service.ProdusStore;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
@Repository
@Component
@Transactional
public class ProdusDao implements ProdusStore {

        private IProdusMappers iProdusMappers;
        private ProdusRepository produsRepository;

    public ProdusDao(IProdusMappers iProdusMappers, ProdusRepository produsRepository) {
        this.iProdusMappers = iProdusMappers;
        this.produsRepository = produsRepository;
    }


    @Override
        public Produs save(ProdusDto produs) {
            return produsRepository.save(iProdusMappers.destinationToSource(produs));
        }

        @Override
        public List<Produs> saveAll(List<ProdusDto> produsDtos) {
            List<Produs> produse = produsDtos.stream()
                    .map(iProdusMappers::destinationToSource)
                    .collect(Collectors.toList());

            return produsRepository.saveAll(produse);
        }



        @Override
        public ProdusDto getProdus(UUID id) {
            return iProdusMappers.sourceToDestination(produsRepository.getOne(id));
        }

        @Override
        public Boolean produsExists(String produsDto) {
            return produsRepository.existsById(UUID.fromString(produsDto));
        }

        @Override
        public ProdusDto update(ProdusDto produsDto) {
            Optional<Produs> produs = produsRepository.findById(UUID.fromString((produsDto.getProdusId())));
            Produs produsEnitity = null;
            if (produs.isPresent()){
                produsEnitity = produs.get();
                produsEnitity.setGreutate(produsDto.getGreutate());
                produsEnitity.setDimensiune(produsDto.getDimensiune());
                produsEnitity.setCalitate(produsDto.getCalitate());

                produsRepository.save(produsEnitity);
            }

            return iProdusMappers.sourceToDestination(produsEnitity);
        }

        @Override
        public void deleteProdus(UUID id) {
            produsRepository.deleteById(id);
        }

        @Override
        public List<ProdusDto> getAllProduse(){
            List<Produs> produse = produsRepository.findAll();
            return produse.stream()
                    .map(iProdusMappers::sourceToDestination)
                    .collect(Collectors.toList());
        }
}
