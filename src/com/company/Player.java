package com.company;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player {
    private Double money;
    private String name;
    private String surname;
    List<Animal> Animals = new ArrayList(0);
    List<Plants> Warehouse = new ArrayList(0);
    List<Farm> Farms = new ArrayList(0);

    public Double getMoney() {
        return this.money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Player(Double money, String name, String surname) {
        this.money = money;
        this.name = name;
        this.surname = surname;
    }

    public void BuyFarm(Farm farm) {
        if (this.money >= farm.getValue()) {
            this.Farms.add(farm);
            this.setMoney(this.getMoney() - farm.getValue());
            System.out.println("You have successfully bought this farm for " + farm.getValue());
        } else {
            System.out.println("you don't have enough money");
        }

    }

    public void BuyField(Farm farm, Field field) {
        if (this.money >= field.getValue()) {
            farm.getField().setSizeFree(farm.getField().getSizeFree() + field.getSizeFree());
            System.out.println("You have bought new field to the farm");
        } else {
            System.out.println("You don't have enough money to enlarge farm");
        }

    }

    public void BuyBuilding(Farm farm, Building building) {
        if (this.money >= building.getValue()) {
            farm.buildings.add(building);
            System.out.println("You have successfully bought new building");
        } else {
            System.out.println("You don't have money to buy that building");
        }

    }

    public void BuyPlants(Plants plants) {
        if (this.money >= plants.getValue()) {
            this.Warehouse.add(plants);
            System.out.println("You have bought " + plants.getType());
        } else {
            System.out.println("You don't have enough money");
        }

    }

    public void SetPlantation(Farm farm, Plants plant, Double field) {
        for(int i = 0; i < this.Warehouse.size(); ++i) {
            if (plant == this.Warehouse.get(i)) {
                if (farm.getField().getSizeFree() > field) {
                    farm.getField().plantsList.add(plant);
                    farm.getField().plantSize.add(field);
                    farm.getField().setSizeFull(farm.getField().getSizeFull() + field);
                    farm.getField().setSizeFree(farm.getField().getSizeFree() - field);
                    this.setMoney(this.getMoney() - plant.getPrepareCost());
                    this.Warehouse.remove(i);
                    PrintStream var10000 = System.out;
                    TypeOfPlant var10001 = plant.getType();
                    var10000.println(var10001 + " is now planted on " + farm.getField().plantSize.get(farm.getField().plantsList.indexOf(plant)));
                } else {
                    System.out.println("You need " + (field - farm.getField().getSizeFree()) + " more free space");
                }
            } else {
                System.out.println("You don't have that plant in warehouse");
            }
        }

    }

    public void Harvest(Farm farm, Plants plant) {
        if (farm.getField().plantsList.contains(plant)) {
            this.setMoney(this.getMoney() - ((Plants)farm.getField().plantsList.get(farm.getField().plantsList.indexOf(plant))).getHarvestCost());
            this.setMoney(this.getMoney() + (Double)farm.getField().plantSize.get(farm.getField().plantsList.indexOf(plant)) * ((Plants)farm.getField().plantsList.get(farm.getField().plantsList.indexOf(plant))).getSellValue() * ((Plants)farm.getField().plantsList.get(farm.getField().plantsList.indexOf(plant))).getEfficiency());
            farm.getField().setSizeFree(farm.getField().getSizeFree() + (Double)farm.getField().plantSize.get(farm.getField().plantsList.indexOf(plant)));
            farm.getField().setSizeFull(farm.getField().getSizeFull() - (Double)farm.getField().plantSize.get(farm.getField().plantsList.indexOf(plant)));
            farm.getField().plantSize.remove(farm.getField().plantsList.indexOf(plant));
            farm.getField().plantsList.remove(farm.getField().plantsList.indexOf(plant));
        }

    }

    public void Feed(Animal animal, Double portion) {
        animal.setWeight(animal.getWeight() + portion);
        System.out.println("Weight of that animal is now " + animal.getWeight());
        if (animal.getFoodQuantity() >= portion) {
            System.out.println("And is full now :D");
        } else {
            System.out.println("Still needs " + (animal.getFoodQuantity() - portion) + " to be full");
        }

    }

    public void growChickens(Farm farm, Building building, Chicken chicken) {
        if (farm.buildings.contains(building)) {
            if (this.Animals.contains(chicken)) {
                Building vbuilding = (Building)farm.buildings.get(farm.buildings.indexOf(building));
                vbuilding.Animals.add(chicken);
                this.Animals.remove(chicken);
            } else {
                System.out.println("You don;t have this animal");
            }
        } else {
            System.out.println("You have to buy Chickencoop first");
        }

    }

    public void BuyAnimal(Animal animal) {
        if (this.getMoney() >= animal.getValue()) {
            this.Animals.add(animal);
            System.out.println("You have bought a new animal");
        } else {
            System.out.println("You don't have money for that");
        }

    }

    public void SellAnimal(Farm farm, Building building, Animal animal) {
        if (farm.buildings.contains(building)) {
            Building vbuilding = (Building)farm.buildings.get(farm.buildings.indexOf(building));
            vbuilding.Animals.remove(animal);
            this.setMoney(this.getMoney() + animal.getValue() * 0.8D);
            System.out.println("Animal sold");
        } else if (this.Animals.contains(animal)) {
            this.setMoney(this.getMoney() + animal.getValue() * 0.8D);
        } else {
            System.out.println("But you don't have this animal anywhere");
        }

    }

    public void CheckPlantWarehouse() {
        System.out.println("Your plant warehouse list: ");
        Iterator var1 = this.Warehouse.iterator();

        while(var1.hasNext()) {
            Plants plant = (Plants)var1.next();
            System.out.println(plant.getType());
        }

    }
}