public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("toString():" + e.toString());
            System.err.println(e.getCause());
            System.err.println(e.getClass());
            System.err.println(e.getStackTrace());
            System.err.println(e.hashCode());    
            System.err.println(e.getLocalizedMessage());
            System.err.println(e.fillInStackTrace());
        
        
}
}
}