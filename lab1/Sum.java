import java.util.Scanner;
class Sum {
// a java program begins with a call to main()
public static void main(String args[]){
    Scanner scanner= new Scanner(System.in);
    System.out.print("hi, enter the first number: ");
    int  number1=scanner.nextInt();
    int sum =0;


while(number1 !=0) {
    int module = number1 % 10;
    sum +=module;
    number1 /=10;
}
System.out.println(" the sum is  " + sum);


}
}