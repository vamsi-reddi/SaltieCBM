package com.saltie.CBM.repository;

import com.saltie.CBM.model.ShipPort;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ShipPortRepository extends Neo4jRepository<ShipPort, Long> {

    @Query("MATCH (n) WHERE n.shipDate >= $fromDate AND n.shipDate <= $toDate RETURN n")
    List<ShipPort> findShipPortByDate(Date fromDate, Date toDate);

    ShipPort findByShipPortCode(Long shipPortCode);

}
