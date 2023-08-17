package com.saltie.CBM.controller;

import com.saltie.CBM.model.Cruise;
import com.saltie.CBM.service.CruiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cruise")
public class CruiseController {
    @Autowired
    CruiseService cruiseService;
    @GetMapping("/viewById/{id}")
    public Cruise viewCruise(@PathVariable("id") Long id) {
        return cruiseService.viewCruise(id);
    }
    @GetMapping("/view")
    public List<Cruise> viewCruises() {
        return cruiseService.viewCruises();
    }
    @PostMapping("/add")
    public Cruise addCruise(@RequestBody Cruise cruise) {
        return cruiseService.addCruise(cruise);
    }
    @PutMapping("/update")
    public Cruise updateCruise(@RequestBody Cruise cruise) {
        return cruiseService.updateCruise(cruise);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCruise(@PathVariable("id") Long id) {
        return cruiseService.removeCruise(id);
    }
}
