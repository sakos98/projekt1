package com.company;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private Double sizeFree;
    private Double sizeFull;
    private Double value;
    private Plants plants;
    List<Plants> plantsList = new ArrayList(0);
    List<Double> plantSize = new ArrayList(0);

    public Double getSizeFull() {
        return this.sizeFull;
    }

    public void setSizeFull(Double sizeFull) {
        this.sizeFull = sizeFull;
    }

    public Double getSizeFree() {
        return this.sizeFree;
    }

    public void setSizeFree(Double size) {
        this.sizeFree = size;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Field(Double size, Double value) {
        this.sizeFree = size;
        this.value = value;
        this.sizeFull = 0.0D;
    }
}

