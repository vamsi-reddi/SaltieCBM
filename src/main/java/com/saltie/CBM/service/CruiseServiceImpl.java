package com.saltie.CBM.service;

import com.saltie.CBM.exceptions.RecordAlreadyExistsException;
import com.saltie.CBM.exceptions.RecordNotFoundException;
import com.saltie.CBM.model.Cruise;
import com.saltie.CBM.repository.CruiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CruiseServiceImpl implements CruiseService{

    @Autowired
    CruiseRepository cruiseRepository;
    @Override
    public Cruise viewCruise(Long cruiseId) {
        if(cruiseRepository.findById(cruiseId).isPresent()){
            return cruiseRepository.findById(cruiseId).get();
        }

        throw new RecordNotFoundException("no record found with this Id " + cruiseId);
    }

    @Override
    public List<Cruise> viewCruises() {
        return cruiseRepository.findAll();
    }

    @Override
    public Cruise addCruise(Cruise cruise) {
        if(cruiseRepository.findById(cruise.getCruiseId()).isEmpty()){
            return cruiseRepository.save(cruise);
        }
        throw new RecordAlreadyExistsException("record already exists with this Id " + cruise.getCruiseId());
    }

    @Override
    public Cruise updateCruise(Cruise cruise) {
        if(cruiseRepository.findById(cruise.getCruiseId()).isPresent()){
            Cruise temp = cruiseRepository.findById(cruise.getCruiseId()).get();
            temp.setFreeSeats(cruise.getFreeSeats());
            temp.setSeatCapacity(cruise.getSeatCapacity());
            temp.setCruiseName(cruise.getCruiseName());
            return cruiseRepository.save(temp);
        }

        throw new RecordNotFoundException("no record found with this Id " + cruise.getCruiseId());
    }

    @Override
    public String removeCruise(Long id) {
        if(cruiseRepository.findById(id).isPresent()){
            cruiseRepository.deleteById(id);
            return "successfully";
        }
        return "cruise doesn't exist";
    }

    @Override
    public List<Cruise> viewCruiseByname(String cruiseName) {
        return cruiseRepository.findAllByCruiseName(cruiseName);
    }
}
