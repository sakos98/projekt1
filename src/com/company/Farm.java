package com.company;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private Field field;
    private Double value;
    List<Building> buildings = new ArrayList(0);

    public Field getField() {
        return this.field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Farm(Field field, Double value) {
        this.field = field;
        this.value = value;
    }
}
