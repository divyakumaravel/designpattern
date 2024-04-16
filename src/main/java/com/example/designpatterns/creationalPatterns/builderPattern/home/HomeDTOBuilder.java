package com.example.designpatterns.creationalPatterns.builderPattern.home;

public interface HomeDTOBuilder {
    HomeDTOBuilder buildWalls(String walls);

    HomeDTOBuilder buildDoor(String door);

    HomeDTOBuilder buildWindow(String window);

    HomeDTOBuilder buildGarage(String garage);

    HomeDTOBuilder buildPool(String pool);

    HomeDTOBuilder buildGym(String gym);

    HomeDTO build();
}
