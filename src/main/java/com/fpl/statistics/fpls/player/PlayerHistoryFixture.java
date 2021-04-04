package com.fpl.statistics.fpls.player;

import org.springframework.data.mongodb.core.mapping.Field;

public class PlayerHistoryFixture {
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

    @Field("minutes")
    private int minutes;

    @Field("goals")
    private int goals;

    @Field("assists")
    private int assists;

    @Field("bonus")
    private int bonus;

    @Field("total_points")
    private int totalPoints;

    @Field("opponent_team")
    private int opponentTeam;

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

    public int getMinutes() {
        return minutes;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getBonus() {
        return bonus;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getOpponentTeam() {
        return opponentTeam;
    }
}
