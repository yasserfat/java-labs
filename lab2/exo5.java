import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sumOfCubes = 0;

        while (number != 0) {
            int digit = number % 10;
            sumOfCubes += digit * digit * digit;
            number /= 10;
        }

        if (originalNumber == sumOfCubes) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
