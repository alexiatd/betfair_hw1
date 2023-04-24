package org.example;

final class Car {
    private final Brand brand;
    private final Type name;
    private int seats;
    private boolean gps;
    private String color;

    public Car(Builder builder) {
        this.brand = builder.brand;
        this.name = builder.name;
        this.seats = builder.seats;
        this.gps = builder.gps;
        this.color = builder.color;
    }

    public Brand getBrand() {
        return brand;
    }

    public Type getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean hasGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {

        var sb = new StringBuilder();
        sb.append("This is a ")
                .append(brand)
                .append(" type ")
                .append(name);
        if (gps != false) {
            sb.append(" with gps ");
        }
        if (color != null) {
            sb.append(" with ");
            sb.append(color).append(' ');
        }
        sb.append(seats).append('.');
        return sb.toString();
}


}

public class Builder {

    final Brand brand;
    final Type name;
    int seats;
    boolean gps;
    String color;

    public Builder(Brand brand, Type name) {
        if (brand == null || name == null) {
            throw new IllegalArgumentException("brand and type can not be null");
        }
        this.brand = brand;
        this.name = name;
    }

    public Builder withNrSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public Builder withGPS(boolean gps) {
        this.gps = gps;
        return this;
    }

    public Builder withColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(this);
    }
}

