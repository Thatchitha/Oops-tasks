package org.example;

public class Patron {
    private String patronId;
    private String name;

    public Patron(String patronId, String name) {
        this.patronId = patronId;
        this.name = name;
    }

    public Patron() {
    }

    public String getPatronId() {
        return patronId;
    }

    public String getName() {
        return name;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
