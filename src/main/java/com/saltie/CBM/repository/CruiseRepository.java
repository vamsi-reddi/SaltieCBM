package com.saltie.CBM.repository;

import com.saltie.CBM.model.Cruise;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CruiseRepository extends Neo4jRepository<Cruise, Long> {
//    Cruise findByCruiseName(String cruiseName);

    List<Cruise> findAllByCruiseName(String cruiseName);

//    Cruise findByCruiseId(Long id);

}
