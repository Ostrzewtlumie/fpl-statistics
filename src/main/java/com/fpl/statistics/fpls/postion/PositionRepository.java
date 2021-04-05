package com.fpl.statistics.fpls.postion;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PositionRepository extends MongoRepository<Position, String> {
    Optional<Position> getByPluralName(String pluralName);
}
