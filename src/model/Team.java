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

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Team.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", players=" + players +
                '}';
    }
}