package part4;
import java.util.Random;

public class Calculations {
    public static void animal() throws animalException {
        Random random = new Random();
        int val = random.nextInt(4); // it can: not throw an exception
        switch(val) {
            case 0: System.out.println("Animal");
                    throw new animalException("Animal");
            case 1: System.out.println("Mammal");
                    throw new mammalException("Mammal");
            case 2: System.out.println("Tiger");
                    throw new tigerException("Tiger");
                }
            }
    public static void main(String[] args) {
    try{
        animal();
    } catch (tigerException te) {
        System.err.println(te.getMessage());
    } catch (mammalException me) {
        System.err.println(me.getMessage());
    } catch (animalException ae) {
        System.err.println(ae.getMessage());
    } finally {
        System.out.println("Finished!"); 
    }
}
}