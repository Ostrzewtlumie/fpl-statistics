package com.fpl.statistics.fpls.entity.classes;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class PlayerFixtures {
    @Field(value = "history")
    private List<PlayerHistoryFixture> playerHistoryFixtureList;

    @Field(value = "fixtures")
    private List<PlayerRemainingFixture> playerRemainingFixtures;
}
