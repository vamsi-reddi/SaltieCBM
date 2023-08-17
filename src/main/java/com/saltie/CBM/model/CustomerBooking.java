//package com.saltie.CBM.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Generated;
//import lombok.NoArgsConstructor;
//import org.springframework.data.neo4j.core.schema.GeneratedValue;
//import org.springframework.data.neo4j.core.schema.Id;
//import org.springframework.data.neo4j.core.schema.Node;
//import org.springframework.data.neo4j.core.schema.Relationship;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Node(labels = {"customerBooking"})
//public class CustomerBooking {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Relationship(type = "BELONGS_TO", direction = Relationship.Direction.OUTGOING)
//    private Customer customer;
//
//    @Relationship(type = "BELONGS_TO", direction = Relationship.Direction.OUTGOING)
//    private Booking booking;
//
//    @Relationship(type = "BELONGS_TO", direction = Relationship.Direction.OUTGOING)
//    private Cruise cruise;
//
//}
