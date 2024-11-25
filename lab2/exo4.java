
import java.util.Scanner;

public class exo4 {

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

    public static int getIndexMinValue(int[] array, int i) {
        if (i < 0 || i >= array.length) {
            throw new IllegalArgumentException("Invalid index");
        }

        int minIndex = i;

        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = getArray(n);

        printArray(array);

        System.out.print("Enter the starting index i: ");
        int i = scanner.nextInt();

        int minIndex = getIndexMinValue(array, i);
        System.out.println("The index of the minimum value starting from index " + i + " is: " + minIndex);
    }
}
