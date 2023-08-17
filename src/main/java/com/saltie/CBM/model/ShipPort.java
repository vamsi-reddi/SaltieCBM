package com.saltie.CBM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Node(labels = {"shipPort"})
public class ShipPort {

    @Id
    private Long shipPortCode;

    private String location;

    private String Name;

}
