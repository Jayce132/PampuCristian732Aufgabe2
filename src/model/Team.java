package model;

import java.util.List;

public class Team {
    private static int idCounter = 1;

    private int id;
    private String name;
    private String city;
    private List<Player> players;

    public Team(String name, String city, List<Player> players) {
        this.id = idCounter++;
        this.name = name;
        this.city = city;
        this.players = players;
    }
}