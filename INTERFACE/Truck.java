package INTERFACE;

class Truck extends AbstractVehicle {
    public Truck(String name, int speed) {
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
        System.out.println("This is a Truck.");
    }
}