package com.saltie.CBM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Node(labels = {"Cruise"})
public class Cruise {

    @Id
    private Long cruiseId;

    private String cruiseName;

    private int seatCapacity;

    private int freeSeats;
}
