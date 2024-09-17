package com.skyscanner;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Search {
    @JsonProperty
    private String city;

    public Search(){

    }

    public Search(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
