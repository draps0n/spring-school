package com.drapson.languageschool.domain.model;

public class Course {
    private Long id;
    private int availableSeats;
    private String description;

    public Course(Long id, int availableSeats, String description) {
        this.id = id;
        this.availableSeats = availableSeats;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public String getDescription() {
        return description;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}
