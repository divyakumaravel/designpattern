package com.example.designpatterns.creationalPatterns.builderPattern.home;

public class MyHomeDTO implements HomeDTO {

    String walls;
    String door;
    String window;
    String pool;

    public MyHomeDTO(String walls, String door, String window, String pool) {
        this.walls = walls;
        this.door = door;
        this.window = window;
        this.pool = pool;
    }

    @Override
    public String getWalls() {
        return null;
    }

    @Override
    public String getDoor() {
        return null;
    }

    @Override
    public String getWindow() {
        return null;
    }

    @Override
    public String getGarage() {
        return null;
    }

    @Override
    public String getPool() {
        return null;
    }

    @Override
    public String getGym() {
        return null;
    }

    @Override
    public String toString() {
        return "MyHomeDTO {" +
                "walls='" + walls + '\'' +
                ", door='" + door + '\'' +
                ", window='" + window + '\'' +
                ", pool='" + pool + '\'' +
                '}';
    }
}
