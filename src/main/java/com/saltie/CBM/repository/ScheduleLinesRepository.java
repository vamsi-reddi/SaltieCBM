package com.saltie.CBM.repository;

import com.saltie.CBM.model.ScheduleLines;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleLinesRepository extends Neo4jRepository<ScheduleLines, Long> {

    List<ScheduleLines> findAllByCruiseCruiseId(Long cruiseId);

    List<ScheduleLines> findAllByStartNameAndEndNameAndDate(String startPort, String endPort, String date);

}
