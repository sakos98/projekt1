package com.company;

public class Chicken extends Animal {
    private Double breedChance = 0.3D;
    private final boolean eggs = true;
    private final Double efficiency = 2.0D;

    public boolean isEggs() {
        return true;
    }

    public Double getEfficiency() {
        return this.efficiency;
    }

    public Double getBreedChance() {
        return this.breedChance;
    }

    public void setBreedChance(Double breedChance) {
        this.breedChance = breedChance;
    }



    public Chicken (Double weight,Double foodQuantity){
        this.setWeight(weight);
        this.setFoodQuantity(foodQuantity);
        setTypeOfBuilding(TypeOfBuilding.chickenCoop);
        setValue(50.0);
    }
}
