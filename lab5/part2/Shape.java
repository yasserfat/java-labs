package part2;

public class Shape {
        protected String name;

    public String getName(){
        return this.name;
    }   

    public void draw(){
        System.out.println("drawing a shape: ");
    }

    public double area() {
        return 0.0;   
    }

    public double volume() {
        return 0.0;       
    }
    
    
}
