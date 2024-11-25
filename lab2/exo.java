
public class exo {

    public static void main(String[] args) {
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y);
        String z = " Hello World".trim();
        System.out.println(x == z);
        x = new String("Hello World");
        System.out.println(x == y);
        System.out.println(x.equals(z));
    }
}
