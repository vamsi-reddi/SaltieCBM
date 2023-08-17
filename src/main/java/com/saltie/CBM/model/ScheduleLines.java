package com.saltie.CBM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node(labels = {"scheduleLines"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleLines {

    @Id
    @GeneratedValue
    private Long id;

    @Relationship(type = "SCHEDULE_OF", direction = Relationship.Direction.OUTGOING)
    private Cruise cruise;

    private String startName;

    private String endName;

    private String date;

    private String startTime;

    private String endTime;
}
