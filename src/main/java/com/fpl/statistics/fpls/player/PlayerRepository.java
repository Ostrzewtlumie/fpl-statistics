package com.fpl.statistics.fpls.player;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
    @Query("{ 'player.status' : {$ne : u }}")
    List<Player> findAllAvailable();

    @Query("{ 'player.status' : u }")
    List<Player> findAllUnavailable();
}
