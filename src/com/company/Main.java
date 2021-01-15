package com.company;

import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        Field field = new Field(2.5D, 500000.0D);
        Field field1 = new Field(1.0D, 150000.0D);
        Building building = new Building(150000.0D, TypeOfBuilding.chickenCoop);
        Farm farm = new Farm(field, 1000000.0D);
        Plants plant = new Plants(TypeOfPlant.grain);
        Player player = new Player(2.0E8D, "Patryk", "Dzięcioł");
        player.BuyFarm(farm);
        player.BuyField(farm, field1);
        player.BuyPlants(plant);
        player.BuyBuilding(farm, building);
        player.CheckPlantWarehouse();
        Chicken chicken = new Chicken(3.0D, 1.0D);
        player.BuyAnimal(chicken);
        player.growChickens(farm, building, chicken);
        player.Feed(chicken, 2.0D);
        player.SellAnimal(farm, building, chicken);
    }
}
