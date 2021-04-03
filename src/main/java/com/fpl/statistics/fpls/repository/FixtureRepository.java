package com.fpl.statistics.fpls.repository;

import com.fpl.statistics.fpls.entity.Fixture;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FixtureRepository extends MongoRepository<Fixture, String> {
}
