
public class RegularPolygon1 {
    private int numberOfSides;
    private double side;
    private double X;
    private double Y;

    public RegularPolygon1 () {
        this.numberOfSides =3;
        this.side='1';
        this.X = '0';
        this.Y = '0';
    }
    public RegularPolygon1(int numberOfSides, double side) {
        this.numberOfSides = numberOfSides;
        this.side = side;
        this.X='0';
        this.Y='0';

    }
    public RegularPolygon1(int numberOfSides, double side , double X, double Y) {
        this.numberOfSides = numberOfSides;
        this.side = side;
        this.X=X;
        this.Y='Y';
        System.out.println("heloo");

    }
    public int getNumberOfSides(int numberOfSides) {
        return numberOfSides;
    }
    public double getSide(double side) {
        return side;
    }
    public double getX(double X) {
        return X;
    }
    public double getY(double Y) {
        return Y;
    }
    public double getPerimeter(){
        return  side * numberOfSides;
    }
    public double getArea() {
        return (numberOfSides*Math.sqrt(side))/(4*Math.tan(Math.PI/numberOfSides));

    }
    public static void main(String[] args) {
        RegularPolygon1 reg1 = new RegularPolygon1();

        RegularPolygon1 reg2 = new RegularPolygon1(10,4);
        RegularPolygon1 reg3 = new RegularPolygon1(10,4,5.6,7.8);
        System.out.println("Polygon 1 - Perimeter: " + Math.round(reg1.getPerimeter()) + ", Area: " + reg1.getArea());
        System.out.println("Polygon c2 - Perimeter: " + reg2.getPerimeter() + ", Area: " + reg2.getArea());
        System.out.println("Polygon 3 - Perimeter: " + reg3.getPerimeter() + ", Area: " + reg3.getArea());
    } 

}
