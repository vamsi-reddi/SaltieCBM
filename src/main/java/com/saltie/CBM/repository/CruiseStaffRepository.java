package com.saltie.CBM.repository;

import com.saltie.CBM.model.CruiseStaff;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CruiseStaffRepository extends Neo4jRepository<CruiseStaff, Long> {
}
