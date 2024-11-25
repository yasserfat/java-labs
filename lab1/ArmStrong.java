import java.util.Scanner;
class ArmStrong {
// a java program begins with a call to main()
public static void main(String args[]){
    Scanner scanner= new Scanner(System.in);
    System.out.print("hi, enter the first number: ");
    int  number1=scanner.nextInt();
    int origenal = number1;
    int sum=0;

    while(number1>0) {
        int module = number1 % 10;
        sum += Math.pow(module,3);
        number1/=10;
    }
    System.out.print(sum);
    if(sum ==origenal ) {

        System.out.print("the number is arm strong");
    }else {
        System.out.print("the number is not arm strong");
    }


}
}