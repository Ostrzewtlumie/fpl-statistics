package com.fpl.statistics.fpls.repository;

import com.fpl.statistics.fpls.entity.Position;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PositionRepository extends MongoRepository<Position, String> {
}
