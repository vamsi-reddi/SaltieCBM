package com.saltie.CBM.service;

import com.saltie.CBM.model.ShipPort;

import java.util.Date;
import java.util.List;

public interface ShipPortService {

    ShipPort viewShipPort(Long id);

    List<ShipPort> viewShipPorts();

    ShipPort addShipPort(ShipPort shipPort);

    ShipPort updateShipPort(ShipPort shipPort);

    String removeShipPort(Long id);

    List<ShipPort> getByDate(Date date);

    Date getByName(Long shipPortCode        );

}
