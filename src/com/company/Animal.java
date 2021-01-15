package com.company;

public abstract class Animal {
    private TypeOfBuilding type;
    private Double weight;
    private Double value;
    private Double foodQuantity;

    public TypeOfBuilding getTypeOfBuilding() {
        return this.type;
    }

    public void setTypeOfBuilding(TypeOfBuilding type) {
        this.type = type;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getFoodQuantity() {
        return this.foodQuantity;
    }

    public void setFoodQuantity(Double foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public Animal(Double weight, Double foodQuantity) {
    }
}