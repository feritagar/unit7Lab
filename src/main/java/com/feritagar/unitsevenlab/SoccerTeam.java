package com.feritagar.unitsevenlab;

public class SoccerTeam {

    private String teamName;
    private String city;
    private int points;

    public SoccerTeam(String teamName, String city, int points) {
        this.teamName = teamName;
        this.city = city;
        this.points = points;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
