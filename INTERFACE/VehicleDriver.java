package INTERFACE;

public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle car = new Car("Ferari",80);
        Vehicle bike = new Bike("Bullet", 50);
        Vehicle truck = new Truck("Mahindra", 40);

        Vehicle[] vehicles = {car, bike, truck};
        for (Vehicle v : vehicles) {
            v.start();
            v.accelerate(50);
            v.displayType();
            System.out.println("Current Speed: " + v.getCurrentSpeed());
            v.brake(10);
            System.out.println("Speed after brake: " + v.getCurrentSpeed());
            v.stop();
            System.out.println();
        }
    }
}