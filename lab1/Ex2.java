import java.util.Scanner;
class Ex2 {
// a java program begins with a call to main()
public static void main(String args[]){
    Scanner scanner= new Scanner(System.in);
    System.out.print("hi, enter the first number: ");
    int  number1=scanner.nextInt();
    System.out.print("hi, enter the second number: ");
    int  number2=scanner.nextInt();
    System.out.print("hi, enter the third number: ");
    int  number3=scanner.nextInt();
    double avg = (number1+number2+number3) /3;
    int greatest = Math.max(Math.max(number1,number2),number3);
    int smallest = Math.min(Math.min(number1,number2),number3);


System.out.println("the avg is : "+avg);
System.out.println("the greatest number is  "+greatest);
System.out.println("the greatest number is  "+smallest);
}
}