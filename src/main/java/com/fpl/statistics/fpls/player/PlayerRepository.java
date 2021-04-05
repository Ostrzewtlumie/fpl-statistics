package com.fpl.statistics.fpls.player;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
    @Query("{ 'playerDetails.status' : {$ne : u }}")
    List<Player> findAllAvailable();

    @Query("{ 'playerDetails.status' : u }")
    List<Player> findAllUnavailable();

    @Query("{ 'playerDetails.shortName' : ?0 }")
    List<Player> findAllByPosition(String position, Sort sort);
}
