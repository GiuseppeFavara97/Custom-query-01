package com.example.customQueries_1.entities.enumerated;

public enum StatusEnum {
    //created event status
    ONTIME ("Flight ontime"),
    DELAYED ("Flight delayed"),
    CANCELLED ("Flight canceled");

    private final String description;

    StatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

