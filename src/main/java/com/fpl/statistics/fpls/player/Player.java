package com.fpl.statistics.fpls.player;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("players")
public class Player {
    @Field("id")
    private String id;
    @Field("player")
    private PlayerDetails playerDetails;
    @Field("playerDetails")
    private PlayerFixtures playerFixtures;

    public Player(final PlayerDetails playerDetails, final PlayerFixtures playerFixtures) {
        this.playerDetails = playerDetails;
        this.playerFixtures = playerFixtures;
    }

    public PlayerDetails getPlayer() {
        return playerDetails;
    }

    public String getId() {
        return id;
    }

    public PlayerDetails getPlayerDetails() {
        return playerDetails;
    }

    public PlayerFixtures getPlayerFixtures() {
        return playerFixtures;
    }
}
