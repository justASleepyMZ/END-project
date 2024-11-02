package main;

public abstract class Room {
    protected java.lang.String type;
    protected double price;

    public abstract void book();

    public java.lang.String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
