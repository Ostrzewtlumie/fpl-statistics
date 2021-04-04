package com.fpl.statistics.fpls.fixture;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("fixtures")
public class Fixture {
    @Field("id")
    private String id;

    @Field(value = "team_a")
    private int teamAway;

    @Field(value = "team_h")
    private int teamHome;

    @Field(value = "team_a_score")
    private int teamAwayScore;

    @Field(value = "team_h_score")
    private int teamHomeScore;

    private Boolean started;

    @Field(value = "kickoff_time")
    private String startTime;

    @Field(value = "team_a_difficulty")
    private int teamAwayDiff;

    @Field(value = "team_h_difficulty")
    private int teamHomeDiff;

    @Field(value = "stats")
    private List<MatchStats> matchStats;

    public String getId() {
        return id;
    }
}
