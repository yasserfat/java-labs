import java.util.Scanner;
class Ex3 {
// a java program begins with a call to main()
public static void main(String args[]){
    Scanner scanner= new Scanner(System.in);
    System.out.print("hi, enter the first number: ");
    int  number1=scanner.nextInt();
  int module =  number1%2;
  


System.out.println(module==1?"odd":"even");


}
}