package com.saltie.CBM.service;

import com.saltie.CBM.model.ShipPort;
import com.saltie.CBM.repository.ShipPortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipPortServiceImpl implements  ShipPortService{

    @Autowired
    ShipPortRepository shipPortRepository;

    @Override
    public ShipPort viewShipPort(Long id) {
        return shipPortRepository.findById(id).get();
    }

    @Override
    public List<ShipPort> viewShipPorts() {
        return shipPortRepository.findAll();
    }

    @Override
    public ShipPort addShipPort(ShipPort shipPort) {
        return shipPortRepository.save(shipPort);
    }

    @Override
    public ShipPort updateShipPort(ShipPort shipPort) {
        if(shipPortRepository.findById(shipPort.getShipPortCode()).isPresent()) {
            ShipPort temp = shipPortRepository.findById(shipPort.getShipPortCode()).get();
            temp.setLocation(shipPort.getLocation());
            temp.setName(shipPort.getName());
            return shipPortRepository.save(temp);
        }
        return null;
    }

    @Override
    public String removeShipPort(Long id) {
        if(shipPortRepository.findById(id).isPresent()) {
            shipPortRepository.deleteById(id);
            return "removed successfully";
        }
        return "shipPort not exist in db";
    }
}
