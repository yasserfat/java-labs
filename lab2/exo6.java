public class exo6 {

    public static void manipulateString(String input) {
        String upperCase = input.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        String lowerCase = input.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        int length = input.length();
        System.out.println("Length of the string: " + length);

        int indexOfAdvanced = input.indexOf("Advanced");
        System.out.println("Index of 'Advanced': " + indexOfAdvanced);
    }

    public static void main(String[] args) {
        String input = "This is Lab #2 of EE423 Advanced Programming Course";
        manipulateString(input);
    }
}
