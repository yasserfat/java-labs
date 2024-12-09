package part5;

public class Mainn {
    
    private static void throwParent() throws ParentException{
        throw new ParentException();
    }

    private static void throwChild() throws ChildException{
        throw new ChildException();
    }

    public static void main(String[] args) {
        System.out.println("****** parents *******");

        try {
            throwParent();   
        } catch (ChildException ce) {
            System.out.println("child exception");
        } //catch(ParentException pe) {
            //System.out.println("PARENT exception");
        //}
        System.out.println("****** children ******");

        try {
            throwChild();   
        } catch (ChildException ce) {
            System.out.println("child exception");
        }// catch(ParentException pe) {
           // System.out.println("PARENT exception");
       // }
    }
}
