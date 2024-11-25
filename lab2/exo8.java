import java.util.Arrays;

public class exo8 {
    public static String[] sortArray(String[] a) {
        String[] sortedArray = Arrays.copyOf(a, a.length);
        
        Arrays.sort(sortedArray);
        
        return sortedArray;
    }

    public static void main(String[] args) {
        String[] originalArray = {"banana", "apple", "orange", "kiwi"};
        String[] sortedArray = sortArray(originalArray);
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
