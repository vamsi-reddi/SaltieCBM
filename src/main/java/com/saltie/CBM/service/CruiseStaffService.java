package com.saltie.CBM.service;

import com.saltie.CBM.model.Cruise;
import com.saltie.CBM.model.CruiseStaff;

import java.util.List;

public interface CruiseStaffService {

    CruiseStaff viewCruiseStaffById(Long id);

    List<Cruise> viewMyCruises(Long cruiseStaffId);

    List<CruiseStaff> viewCruiseStaff();

    CruiseStaff addCruiseStaff(CruiseStaff cruiseStaff);

    CruiseStaff updateCruiseStaff(CruiseStaff cruiseStaff);

    String removeCruiseStaff(Long id);
}
