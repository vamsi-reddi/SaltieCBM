package com.saltie.CBM.controller;

import com.saltie.CBM.model.Cruise;
import com.saltie.CBM.model.CruiseStaff;
import com.saltie.CBM.service.CruiseStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cruiseStaff")
public class CruiseStaffController {

    @Autowired
    CruiseStaffService cruiseStaffService;

    @GetMapping("/view")
    public List<CruiseStaff> viewCruiseStaff() {
        return cruiseStaffService.viewCruiseStaff();
    }

    @GetMapping("/viewById/{id}")
    public CruiseStaff viewCruiseStaffById(@PathVariable("id") Long id) {
        return cruiseStaffService.viewCruiseStaffById(id);
    }

    @PostMapping("/create")
    public CruiseStaff addCruiseStaff(@RequestBody CruiseStaff cruiseStaff) {
        return cruiseStaffService.addCruiseStaff(cruiseStaff);
    }

    @PutMapping("/update")
    public CruiseStaff updateCruiseStaff(@RequestBody CruiseStaff cruiseStaff) {
        return cruiseStaffService.updateCruiseStaff(cruiseStaff);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCruiseStaff(Long id) {
        return cruiseStaffService.removeCruiseStaff(id);
    }

    @GetMapping("viewMyCruises/{id}")
    public List<Cruise> viewMyCruises(Long cruiseStaffId) {
        return cruiseStaffService.viewMyCruises(cruiseStaffId);
    }

}
