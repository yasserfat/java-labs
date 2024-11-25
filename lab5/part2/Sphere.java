package part2;

public class Sphere extends Circle{
    protected double radius;

    public Sphere(double raduis){
        super(raduis);
        this.name = "Sphere";  
    }
    
    public double volume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing a Sphere");
    }
    
}
