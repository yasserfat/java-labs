import java.util.Scanner;
class MyFirstApp {
// a java program begins with a call to main()
public static void main(String args[]){
    Scanner scanner= new Scanner(System.in);
    System.out.print("hi, enter the daimiter: ");
    double D=scanner.nextDouble();
    double pi= 3.14;
    double area = pi*D*D;
    double cir = 2*pi*D;

System.out.println("the area is: "+D);
System.out.println("the cir is: "+cir);
}
}