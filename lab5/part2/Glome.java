package part2;

public class Glome extends Circle {
    protected double radius;

    public Glome(double raduis){
        super(raduis);
        this.name = "Glome";  
    }
    
    public double volume() {
        return (2.0/3.0) * Math.PI * radius * radius * radius * radius;
    }
    
    public void draw() {
        System.out.println("Drawing a Glome");
    }
}

