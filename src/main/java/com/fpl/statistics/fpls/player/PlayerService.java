package com.fpl.statistics.fpls.player;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebInputException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {
    private static final List<String> acceptableSortOptions = Arrays.asList("form", "value_form", "total_points", "points_per_game");

    private final PlayerRepository playerRepository;

    private MongoTemplate mongoTemplate;

    public PlayerService(PlayerRepository playerRepository, MongoTemplate mongoTemplate) {
        this.playerRepository = playerRepository;
        this.mongoTemplate = mongoTemplate;
    }

    public List<Player> getAvailablePlayers()
    {
        return playerRepository.findAllAvailable();
    }

    public List<Player> getUnavailablePlayers()
    {
        return playerRepository.findAllUnavailable();
    }

    public List<Player> getByPosition(String positionName, final String sortOption) {

        final List<String> positions = getPositionsNames();
        if (!positions.contains(positionName) || !acceptableSortOptions.contains(sortOption))
        {
           throw new ServerWebInputException(String.format("Not supported position : %s or sort option : %s provided.",
                   positionName,
                   sortOption));
        }
        return playerRepository.findAllByPosition(positionName,
                Sort.by(Sort.Direction.DESC, "player." + sortOption));
    }

    private List<String> getPositionsNames()
    {
        final List<String> positions = new ArrayList<>();
        final MongoCollection<Document> collection = mongoTemplate.getCollection("players");
        final var iterable= collection.distinct("playerDetails.shortName", String.class);
        final var iterable2= collection.distinct("playerDetails.positionName", String.class);
        iterable.forEach(positions::add);
        iterable2.forEach(positions::add);
        return positions;
    }
}
