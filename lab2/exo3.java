import java.util.Scanner;

public class exo3 {

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

    public static boolean areSorted(int[] array) {
        if (array.length <= 1) {
            return true;
        }

        boolean isIncremental = true;
        boolean isDecremental = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isIncremental = false;
            }
            if (array[i] > array[i - 1]) {
                isDecremental = false;
            }
        }

        return isIncremental || isDecremental;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = getArray(n);

        printArray(array);

        boolean sorted = areSorted(array);

        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
