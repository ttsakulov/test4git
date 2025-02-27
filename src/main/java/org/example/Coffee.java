package org.example;

import java.util.Objects;

public class Coffee {
    private String name = "";
    private boolean isBitter = false;
    private boolean isSour = false;
    private int temperature = 70;
    private int cost = 100;

    public Coffee(boolean isBitter, boolean isSour, int temperature, int cost) {
        this.isBitter = isBitter;
        this.isSour = isSour;
        this.temperature = temperature;
        this.cost = cost;
    }

    public boolean isBitter() {
        return isBitter;
    }

    public void setBitter(boolean bitter) {
        isBitter = bitter;
    }

    public boolean isSour() {
        return isSour;
    }

    public void setSour(boolean sour) {
        isSour = sour;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coffee coffee)) return false;
        return isBitter == coffee.isBitter && isSour == coffee.isSour && temperature == coffee.temperature && cost == coffee.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBitter, isSour, temperature, cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
