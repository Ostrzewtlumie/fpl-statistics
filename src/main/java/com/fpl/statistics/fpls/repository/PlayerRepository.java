package com.fpl.statistics.fpls.repository;

import com.fpl.statistics.fpls.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {
}
