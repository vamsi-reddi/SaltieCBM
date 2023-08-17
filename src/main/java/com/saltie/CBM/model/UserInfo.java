package com.saltie.CBM.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Node(labels = {"user"})
public class UserInfo {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String mail;

    private String password;

    private String roles;

}
