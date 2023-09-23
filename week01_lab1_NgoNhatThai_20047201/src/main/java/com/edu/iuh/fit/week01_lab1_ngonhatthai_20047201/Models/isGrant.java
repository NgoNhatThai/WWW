package com.edu.iuh.fit.week01_lab1_ngonhatthai_20047201.Models;

public enum isGrant {
    GRANTED(1),
    DENIED(0),
    PENDING(-1);

    private final int value;

    private isGrant(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
