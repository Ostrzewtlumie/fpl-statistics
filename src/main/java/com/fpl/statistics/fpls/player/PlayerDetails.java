package com.fpl.statistics.fpls.player;

import org.springframework.data.mongodb.core.mapping.Field;

public class PlayerDetails {
    int id;

    @Field(value = "first_name")
    private String firstName;

    @Field(value = "second_name")
    private String secondName;

    @Field(value = "total_points")
    private int points;

    @Field(value = "chance_of_playing_next_round")
    private int chanceOfPlayingNext;

    @Field(value = "chance_of_playing_this_round")
    private int chanceOfPlayingThisRound;

    @Field(value = "element_type")
    private int position;

    @Field(value = "event_points")
    private int pointsGameWeek;

    private String form;

    @Field(value = "new_cost")
    private String cost;

    @Field(value = "points_per_game")
    private String pointsPerGame;

    @Field(value = "selected_by_percent")
    private String selectedByPercent;

    private String status;

    private int team;

    @Field(value = "value_season")
    private String seasonValue;

    @Field(value = "value_form")
    private String formValue;

    private int minutes;

    @Field(value = "goals_scored")
    private int goals;

    private int assists;

    @Field(value = "clean_sheets")
    private int cleanSheets;

    @Field(value = "goals_conceded")
    private int goalsConceded;

    @Field(value = "own_goals")
    private int ownGoals;

    @Field(value = "penalties_saved")
    private int penaltiesSaved;

    @Field(value = "penalties_missed")
    private int penaltiesMissed;

    @Field(value = "yellow_cards")
    private int yellowCards;

    @Field(value = "red_cards")
    private int redCards;

    private int saves;

    private int bonus;

    private String influence;

    private String creativity;

    private String threat;

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getPoints() {
        return points;
    }

    public int getChanceOfPlayingNext() {
        return chanceOfPlayingNext;
    }

    public int getChanceOfPlayingThisRound() {
        return chanceOfPlayingThisRound;
    }

    public int getPosition() {
        return position;
    }

    public int getPointsGameWeek() {
        return pointsGameWeek;
    }

    public String getForm() {
        return form;
    }

    public String getCost() {
        return cost;
    }

    public String getPointsPerGame() {
        return pointsPerGame;
    }

    public String getSelectedByPercent() {
        return selectedByPercent;
    }

    public int getTeam() {
        return team;
    }

    public String getSeasonValue() {
        return seasonValue;
    }

    public String getFormValue() {
        return formValue;
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

    public int getCleanSheets() {
        return cleanSheets;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public int getOwnGoals() {
        return ownGoals;
    }

    public int getPenaltiesSaved() {
        return penaltiesSaved;
    }

    public int getPenaltiesMissed() {
        return penaltiesMissed;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public int getSaves() {
        return saves;
    }

    public int getBonus() {
        return bonus;
    }

    public String getInfluence() {
        return influence;
    }

    public String getCreativity() {
        return creativity;
    }

    public String getThreat() {
        return threat;
    }
}
