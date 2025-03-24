package PlayingWithObjects;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle diameter() {
        double diameter = 2 * radius;
        System.out.println("Diameter: " + diameter);
        return this;  
    }

    public Circle area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
        return this;
    }

    public Circle circumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
        return this; 
    }

    
}
