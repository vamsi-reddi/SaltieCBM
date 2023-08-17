package com.saltie.CBM.repository;

import com.saltie.CBM.model.ShipPort;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipPortRepository extends Neo4jRepository<ShipPort, Long> {
}
