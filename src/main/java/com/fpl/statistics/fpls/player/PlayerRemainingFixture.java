package com.fpl.statistics.fpls.player;

import org.springframework.data.mongodb.core.mapping.Field;

public class PlayerRemainingFixture {
    @Field("team_h")
    private int homeTeam;

    @Field("team_a")
    private int teamAway;

    @Field("team_a_score")
    private int teamAwayScore;

    @Field("team_h_score")
    private int teamHomeScore;

    @Field("finished")
    private boolean finished;

    @Field("difficulty")
    private int difficulty;

    @Field("is_home")
    private boolean home;

    public int getHomeTeam() {
        return homeTeam;
    }

    public int getTeamAway() {
        return teamAway;
    }

    public int getTeamAwayScore() {
        return teamAwayScore;
    }

    public int getTeamHomeScore() {
        return teamHomeScore;
    }

    public boolean isFinished() {
        return finished;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public boolean isHome() {
        return home;
    }
}
