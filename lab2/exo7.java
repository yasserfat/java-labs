import java.util.Scanner;

public class exo7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        String password = generatePassword(firstName, lastName, age);
        System.out.println("Generated Password: " + password);
    }
    
    public static String generatePassword(String firstName, String lastName, int age) {
        int lastDigitOfAge = age % 10;
        
        char firstCharOfFirstName = firstName.charAt(0);
        char lastCharOfFirstName = firstName.charAt(firstName.length() - 1);
        
        int middleIndex = lastName.length() / 2;
        String middleCharsOfLastName;
        if (lastName.length() >= 2) {
            middleCharsOfLastName = lastName.substring(middleIndex - 1, middleIndex + 1);
        } else {
            middleCharsOfLastName = lastName;
        }
        
        int firstDigitOfAge = Integer.parseInt(Integer.toString(age).substring(0, 1));
        
        return lastDigitOfAge + "" + firstCharOfFirstName + lastCharOfFirstName + middleCharsOfLastName + firstDigitOfAge;
    }
}

