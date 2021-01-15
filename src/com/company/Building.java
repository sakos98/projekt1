package com.company;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private Double value;
    private TypeOfBuilding typeOfBuilding;
    List<Animal> Animals = new ArrayList(0);

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public TypeOfBuilding getTypeOfBuilding() {
        return this.typeOfBuilding;
    }

    public void setTypeOfBuilding(TypeOfBuilding typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public Building(Double value, TypeOfBuilding type) {
        this.value = value;
        this.typeOfBuilding = type;
    }

}
