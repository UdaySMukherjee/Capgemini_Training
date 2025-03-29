package INTERFACE;

abstract class AbstractVehicle implements Vehicle {
    protected String name;
    protected int speed;

    public AbstractVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
    }

    @Override
    public void accelerate(int increment) {
        speed += increment;
    }

    @Override
    public void brake(int decrement) {
        speed -= decrement;
    }

    @Override
    public int getCurrentSpeed() {
        return speed;
    }
}