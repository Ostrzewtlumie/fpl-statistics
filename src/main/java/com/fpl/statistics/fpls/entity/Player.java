package com.fpl.statistics.fpls.entity;

import com.fpl.statistics.fpls.entity.classes.PlayerDetails;
import com.fpl.statistics.fpls.entity.classes.PlayerFixtures;
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
}
