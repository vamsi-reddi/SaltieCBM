package com.saltie.CBM.service;

import com.saltie.CBM.model.Cruise;
import com.saltie.CBM.model.CruiseStaff;
import com.saltie.CBM.repository.CruiseStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CruiseStaffServiceImpl implements CruiseStaffService{

    @Autowired
    CruiseStaffRepository cruiseStaffRepository;

    @Autowired
    CruiseService cruiseService;

    @Override
    public CruiseStaff viewCruiseStaffById(Long id) {
        return cruiseStaffRepository.findById(id).get();
    }

    @Override
    public List<Cruise> viewMyCruises(Long cruiseStaffId) {
        return cruiseStaffRepository.findById(cruiseStaffId).get().getCruiseList();
    }

    @Override
    public List<CruiseStaff> viewCruiseStaff() {
        return cruiseStaffRepository.findAll();
    }

    @Override
    public CruiseStaff addCruiseStaff(CruiseStaff cruiseStaff) {
        List<Cruise> cruiseList = new ArrayList<>();
        for (Cruise temp : cruiseStaff.getCruiseList()) {
            Cruise cruise = cruiseService.viewCruise(temp.getCruiseId());
            cruiseList.add(cruise);
        }
        cruiseStaff.setCruiseList(cruiseList);
        return cruiseStaffRepository.save(cruiseStaff);
    }

    @Override
    public CruiseStaff updateCruiseStaff(CruiseStaff cruiseStaff) {
        if (cruiseStaffRepository.findById(cruiseStaff.getId()).isPresent()) {
            CruiseStaff temp = cruiseStaffRepository.findById(cruiseStaff.getId()).get();
            temp.setAge(cruiseStaff.getAge());
            temp.setEmail(cruiseStaff.getEmail());
            temp.setName(cruiseStaff.getName());
            temp.setCruiseList(cruiseStaff.getCruiseList());
            cruiseStaffRepository.save(temp);
            return cruiseStaffRepository.findById(cruiseStaff.getId()).get();
        }
        return null;
    }

    @Override
    public String removeCruiseStaff(Long id) {
        if(cruiseStaffRepository.findById(id).isPresent()){
            cruiseStaffRepository.deleteById(id);
            return "removed successfully";
        }
        return "cruiseStaff not found";
    }
}
