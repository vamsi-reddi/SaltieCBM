package com.saltie.CBM.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Node(labels = {"CruiseStaff"})
public class CruiseStaff {

    @Id
    @GeneratedValue
    private Long id;

    @Relationship(type = "CONTROLS", direction = Relationship.Direction.OUTGOING)
    private List<Cruise> cruiseList;

    private String name;

    private Integer age;

    private String email;

}
