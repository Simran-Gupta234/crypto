package com.jester.crypto.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Time {
    @JsonProperty
    private String updated;
    @JsonProperty
    private String updatedISO;
    @JsonProperty
    private String updateduk;


    // Getter Methods

    public String getUpdated() {
        return updated;
    }

    public String getUpdatedISO() {
        return updatedISO;
    }

    public String getUpdateduk() {
        return updateduk;
    }

    // Setter Methods

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public void setUpdatedISO(String updatedISO) {
        this.updatedISO = updatedISO;
    }

    public void setUpdateduk(String updateduk) {
        this.updateduk = updateduk;
    }
}
