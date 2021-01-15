package com.company;

public class Cow extends Animal {
    private final Boolean milk = true;
    private final Double efficiency = 1.0D;
    private Double breedChance = 0.15D;

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

    public Cow(Double weight, Double foodQuantity) {
        super(weight, foodQuantity);
        this.setValue(3000.0D);
    }

    public void weightUp() {
        this.setWeight(this.getWeight() + 1.0D);
    }
}
