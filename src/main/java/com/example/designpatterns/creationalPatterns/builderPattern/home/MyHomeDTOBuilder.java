package com.example.designpatterns.creationalPatterns.builderPattern.home;

public class MyHomeDTOBuilder implements HomeDTOBuilder{

    String walls;
    String door;
    String window;
    String garage;
    String pool;
    String gym;
    @Override
    public HomeDTOBuilder buildWalls(String walls) {
        this.walls = walls;
        return this;
    }

    @Override
    public HomeDTOBuilder buildDoor(String door) {
        this.door = door;
        return this;
    }

    @Override
    public HomeDTOBuilder buildWindow(String window) {
        this.window = window;
        return this;
    }

    @Override
    public HomeDTOBuilder buildGarage(String garage) {
        this.garage = garage;
        return this;
    }

    @Override
    public HomeDTOBuilder buildPool(String pool) {
        this.pool = pool;
        return this;
    }

    @Override
    public HomeDTOBuilder buildGym(String gym) {
        this.gym = gym;
        return null;
    }


    @Override
    public HomeDTO build() {
        return new MyHomeDTO(walls,door,window,pool);
    }
}
