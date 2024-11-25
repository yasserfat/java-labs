abstract class Shape {
    public String getName() {
        return this.getClass().getSimpleName();
    }

    public void draw() {
        System.out.println("Drawing a " + getName());
    }
}

// Circle class
class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Sphere class (3D Circle)
class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

// Cylinder class (3D Circle)
class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

// Glome class (4D Circle)
class Glome extends Circle {
    public Glome(double radius) {
        super(radius);
    }

    public double volume() {
        return (1.0 / 2.0) * Math.pow(Math.PI, 2) * Math.pow(radius, 4);
    }
}

// Square class
class Square extends Shape {
    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return Math.pow(sideLength, 2);
    }
}

// Cube class (3D Square)
class Cube extends Square {
    public Cube(double sideLength) {
        super(sideLength);
    }

    public double volume() {
        return Math.pow(sideLength, 3);
    }
}

// Main class to demonstrate functionality
public class ShapesDemo {
    public static void main(String[] args) {
        // Creating objects
        Circle circle = new Circle(5);
        Sphere sphere = new Sphere(5);
        Cylinder cylinder = new Cylinder(5, 10);
        Square square = new Square(4);
        Cube cube = new Cube(4);
        Glome glome = new Glome(3);

        // Drawing shapes
        Shape[] arrayOfShaoes = {circle,sphere,cylinder,sphere,cube,glome};
        
        circle.draw();
        sphere.draw();
        cylinder.draw();
        square.draw();
        cube.draw();
        glome.draw();

        // Calculating areas and volumes
        System.out.println("Circle area: " + circle.area());
        System.out.println("Sphere volume: " + sphere.volume());
        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Square area: " + square.area());
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Glome volume: " + glome.volume());
    }
}

