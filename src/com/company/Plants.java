package com.company;

public class Plants {
    private Double prepareCost;
    private Double secureCost;
    private Double efficiency;
    private Double harvestCost;
    private Double sellValue;
    private Double value;
    private TypeOfPlant type;
    private boolean readyToHarvest;

    public boolean isReadyToHarvest() {
        return this.readyToHarvest;
    }

    public void setReadyToHarvest(boolean readyToHarvest) {
        this.readyToHarvest = readyToHarvest;
    }

    public TypeOfPlant getType() {
        return this.type;
    }

    public void setType(TypeOfPlant type) {
        this.type = type;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getPrepareCost() {
        return this.prepareCost;
    }

    public void setPrepareCost(Double prepareCost) {
        this.prepareCost = prepareCost;
    }

    public Double getSecureCost() {
        return this.secureCost;
    }

    public void setSecureCost(Double secureCost) {
        this.secureCost = secureCost;
    }

    public Double getEfficiency() {
        return this.efficiency;
    }

    public void setEfficiency(Double efficiency) {
        this.efficiency = efficiency;
    }

    public Double getHarvestCost() {
        return this.harvestCost;
    }

    public void setHarvestCost(Double harvestCost) {
        this.harvestCost = harvestCost;
    }

    public Double getSellValue() {
        return this.sellValue;
    }

    public void setSellValue(Double sellValue) {
        this.sellValue = sellValue;
    }

    public Plants(TypeOfPlant type) {
        if (type == TypeOfPlant.appleTree) {
            this.efficiency = 0.8D;
            this.harvestCost = 10000.0D;
            this.prepareCost = 50000.0D;
            this.secureCost = 15000.0D;
            this.sellValue = 300000.0D;
            this.value = 100000.0D;
            this.type = TypeOfPlant.appleTree;
            this.readyToHarvest = false;
        }

        if (type == TypeOfPlant.grain) {
            this.efficiency = 0.8D;
            this.harvestCost = 1000.0D;
            this.prepareCost = 2000.0D;
            this.secureCost = 1000.0D;
            this.sellValue = 80000.0D;
            this.value = 20000.0D;
            this.type = TypeOfPlant.grain;
            this.readyToHarvest = false;
        }

    }
}
