package io.fernandes;

public enum Item {
    APPLE(0.6),
    ORANGE(0.25);

    Item(double price) {
        this.price = price;
    }

    private double price;

    public double getPrice() {
        return this.price;
    }
}
