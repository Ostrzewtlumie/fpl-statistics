package com.fpl.statistics.fpls.fixture;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class MatchStats {

    private String identifier;

    @Field(value = "a")
    private List<Stat> awayStats;

    @Field(value = "h")
    private List<Stat> homeStats;
}
