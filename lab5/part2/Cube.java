package part2;
public class Cube extends Square {
    protected double sideLength;
    
    public Cube(double sideLength){
        super(sideLength);
        this.name = "Cube";  
    }
    
    public double area() {
        return sideLength * sideLength * sideLength;
    }

    public void draw() {
        System.out.println("Drawing a Cube");
    }

    
}