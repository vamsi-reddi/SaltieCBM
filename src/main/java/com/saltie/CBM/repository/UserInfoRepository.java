package com.saltie.CBM.repository;

import com.saltie.CBM.model.UserInfo;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends Neo4jRepository<UserInfo, Long> {
    Optional<UserInfo> findByName(String username);

}
