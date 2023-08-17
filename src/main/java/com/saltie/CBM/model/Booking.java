package com.saltie.CBM.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Node(labels = {"Booking"})
public class Booking {

    @Id
    @GeneratedValue
    private Long bookingId;

    private String bookingDate;

//    private Long customerId;

//    private String cruiseName;
//
//    private Long cruiseId;

    @Relationship(type = "BELONGS_TO", direction = Relationship.Direction.OUTGOING)
    private Customer customer;

    @Relationship(type = "GOING_BY", direction = Relationship.Direction.OUTGOING)
    private Cruise cruise;

//    private Long cruiseId;
//
//    private String cruiseName;

    private int noOfPassengers;

    private String startLocation;

    private String endLocation;

}
