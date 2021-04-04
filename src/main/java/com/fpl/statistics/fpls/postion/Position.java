package com.fpl.statistics.fpls.postion;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("positions")
public class Position {
    @Field("id")
    private String id;

    @Field(value = "plural_name")
    private String pluralName;

    public String getId() {
        return id;
    }
}
