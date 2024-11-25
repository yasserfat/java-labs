import java.util.Arrays;
import java.util.Scanner;

public class exo2 {

    public static int[] getArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("Array elements: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static boolean areTheSame(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();

        int[] array1 = getArray(n1);

        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();

        int[] array2 = getArray(n2);

        System.out.println("First array:");
        printArray(array1);
        System.out.println("Second array:");
        printArray(array2);

        boolean same = areTheSame(array1, array2);
        if (same) {
            System.out.println("The arrays are the same.");
        } else {
            System.out.println("The arrays are not the same.");
        }
    }
}
