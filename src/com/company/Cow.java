package com.company;

public class Cow extends Animal {
    private final Boolean milk = true;
    private final Double efficiency = 1.0;
    private Double breedChance = 0.15;

    public Double getBreedChance() {
        return this.breedChance;
    }

    public void setBreedChance(Double breedChance) {
        this.breedChance = breedChance;
    }

    public Boolean getMilk() {
        return this.milk;
    }

    public Double getEfficiency() {
        return this.efficiency;
    }

    public void weightUp() {
        this.setWeight(this.getWeight() + 1.0);
    }

    public Cow (Double weight, Double foodQuantity){
        this.setWeight(weight);
        this.setFoodQuantity(10.0);
        setValue(3000.0);
    }
}
