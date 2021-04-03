package com.fpl.statistics.fpls.repository;

import com.fpl.statistics.fpls.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {
}
