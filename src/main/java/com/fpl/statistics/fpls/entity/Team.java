package com.fpl.statistics.fpls.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("teams")
public class Team {
    @Field("id")
    private String id;

    private String name;

    @Field("short_name")
    private String shortName;

    private int draw;

    private int win;

    private int loss;

    private int played;

    private int strength;

    @Field(value = "strength_overall_home")
    private int strengthHome;

    @Field(value = "strength_overall_away")
    private int strengthAway;

    @Field(value = "strength_attack_home")
    private int strengthAttackHome;

    @Field(value = "strength_attack_away")
    private int strengthAttackAway;

    @Field(value = "strength_defence_home")
    private int strengthDefenceHome;

    @Field(value = "strength_defence_away")
    private int strengthDefenceAway;

    private int scoredGoals;

    private int lostGoals;

    public String getId() {
        return id;
    }
}
