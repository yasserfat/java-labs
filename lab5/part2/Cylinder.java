package part2;
public class Cylinder extends Circle {
    protected double radius;

    public Cylinder(double raduis, double height){
        super(raduis);
        this.name = "Cylinder";  
    }
    
    public double area() {
        return area() * radius;
    }

    public void draw() {
        System.out.println("Drawing a Cylinder");
    }

    
    
}
