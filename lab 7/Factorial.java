import java.util.Scanner;
public class Factorial {
    public static int fact(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Argument passed is negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        while (true) {
            try {
                String s = sc.next(); //reads string
                int n = Integer.parseInt(s); //convert to integer
                System.out.println("factorial of " + n + " is " + fact(n)); //computes the facturial
                sc.close(); //closes scanner
                return; //exits the loop
            }
            // if input does not match an integer
            catch (NumberFormatException e) {
                System.out.print("enter a valid number: ");
            }
            // if input is negative
            catch (IllegalArgumentException e) {
                System.out.print("enter a positive number: ");
            }
        }
    }
}
