package com.saltie.CBM.controller;

import com.saltie.CBM.model.ShipPort;
import com.saltie.CBM.service.ShipPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipPort")
public class ShipPortController {

    @Autowired
    ShipPortService shipPortService;

    @GetMapping("/viewById/{id}")
    public ShipPort viewShipPort(@PathVariable("id") Long id) {
        return shipPortService.viewShipPort(id);
    }

    @GetMapping("/view")
    public List<ShipPort> viewShipPorts() {
        return shipPortService.viewShipPorts();
    }

    @PostMapping("/create")
    public ShipPort createShipPort(@RequestBody ShipPort shipPort) {
        return shipPortService.addShipPort(shipPort);
    }

    @PutMapping("/update")
    public ShipPort updateShipPort(ShipPort shipPort) {
        return shipPortService.updateShipPort(shipPort);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteShipPort(@PathVariable("id") Long id) {
        return shipPortService.removeShipPort(id);
    }
}
