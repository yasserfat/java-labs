package part2;
public class Square extends Shape {
    protected double sideLength;
    
    public Square(double sideLength){
        this.name = "Square";  
    }
    
    public double area() {
        return sideLength * sideLength;
    }

    public void draw() {
        System.out.println("Drawing a Square");
    }
}