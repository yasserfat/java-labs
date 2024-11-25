package part2;

public class Main2 {

        public static void main(String[] args) {
            Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Cube(3),
                new Sphere(2),
                new Cylinder(3, 5),
                new Glome(1)
            };
    
            for (Shape shape : shapes) {
                System.out.println("Shape: " + shape.getName() + ", Area: " + shape.area() + ", Volume: " + shape.volume());
                shape.draw();
            }
        }
    }
    
    

