package com.saltie.CBM.service;

import com.saltie.CBM.model.Cruise;

import java.util.List;

public interface CruiseService {

    Cruise viewCruise(Long id);

    List<Cruise> viewCruises();

    Cruise addCruise(Cruise cruise);

    Cruise updateCruise(Cruise cruise);

    String removeCruise(Long id);

    List<Cruise> viewCruiseByname(String cruiseName);
}
