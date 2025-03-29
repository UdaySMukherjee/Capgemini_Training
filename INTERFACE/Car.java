package INTERFACE;

class Car extends AbstractVehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " Start");
    }

    @Override
    public void stop() {
        System.out.println(name + " Stop");
    }

    @Override
    public void displayType() {
        System.out.println("This is a Car.");
    }
}
