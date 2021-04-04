package com.fpl.statistics.fpls.fixture;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FixtureRepository extends MongoRepository<Fixture, String> {
}
