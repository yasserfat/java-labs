// ***********************************************************
// ParseInts.java
// Reads a line of text and prints the integers in the line.
//************************************************************
/*import java.util.Scanner;
public class ParseInts { 
    public static void main(String[] args){ 
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        while (scanLine.hasNext()){
            val = Integer.parseInt(scanLine.next());
            sum += val;
        }
        System.out.println("The sum of the integers on this line is " + sum);
    }
} */

//Wrap the loop with the catch bloc
import java.util.Scanner;
public class ParseInts { 
    public static void main(String[] args){ 
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text");
        try {
            Scanner scanLine = new Scanner(scan.nextLine());
            while (scanLine.hasNext()){
                val = Integer.parseInt(scanLine.next());
                sum += val;
        }
        System.out.println("The sum of the integers on this line is " + sum); 
    } catch (NumberFormatException e){
        System.err.println("Error: non integer value detected");
        }
    }
}



//Make the catch bloc inside the loop
/* import java.util.Scanner;
public class ParseInts { 
    public static void main(String[] args){ 
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        while (scanLine.hasNext()){
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;  
            }
            catch (NumberFormatException e) {
                System.err.println("skipping non integer value");
            }  
        }
        System.out.println("The sum of the integers on this line is " + sum);
    }
}  */