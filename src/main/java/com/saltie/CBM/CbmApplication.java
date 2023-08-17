package com.saltie.CBM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com")
@EntityScan("com.saltie.CBM.model")
@EnableNeo4jRepositories("com.saltie.CBM.repository")
public class CbmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbmApplication.class, args);
	}

}
