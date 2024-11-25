package part2;
public class Circle extends Shape {
    protected double radius;

    public Circle(double raduis){
        this.name = "Circle";  
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle");
    }


}
