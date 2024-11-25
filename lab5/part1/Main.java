package part1;
public class Main {
        public static void main(String[] args) {
            // Instantiate objects using default constructors
            System.out.println(" Instantiating a Person");
            Person person = new Person();
            System.out.println("-------------");
           
            System.out.println(" Instantiating a student");
            Student student = new Student();
            System.out.println("-------------");

            System.out.println(" Instantiating an employee");
            Employee employee = new Employee();
            System.out.println("-------------");

            System.out.println(" Instantiating a faculty employee");
            Faculty faculty = new Faculty();
            System.out.println("-------------");

            System.out.println(" Instantiating a staff employee");
            Staff staff = new Staff();
            System.out.println("-------------new----------------");

            Person p = new Person();
            Employee pe = new Employee();
            Student ps = new Student();
            Faculty pf = new Faculty();
            Staff pt = new Staff();
            System.out.println("-------------tostring---------------");

            // Calling toString on each object
            System.out.println(p);
            System.out.println(pe);
            System.out.println(ps);
            System.out.println(pf);
            System.out.println(pt); 
            System.out.println("--------------equls--------------");

             // Testing equality
            System.out.println("person equals employee: " + p.equals(pe));
            System.out.println("person equals student: " + p.equals(ps));
            System.out.println("person equals faculty member: " + p.equals(pf));
            System.out.println("person equals staff member: " + p.equals(pt));
            System.out.println("--------------array--------------");

            Person[] persons = {pe, ps, pf, pt};
            for (Person person2 : persons) {
            System.out.println(person2);
            }

            // Using instanceof
            System.out.println("p is Person: " + (p instanceof Person));
            System.out.println("pe is Employee: " + (pe instanceof Employee));
            System.out.println("ps is Student: " + (ps instanceof Student));
            System.out.println("pf is Faculty: " + (pf instanceof Faculty));
            System.out.println("pt is Staff: " + (pt instanceof Staff));

        
        }
    }
       
   














    
    /* public static void main(String[] args) {
        // Instantiating objects
        Person p = new Person();
        Employee pe = new Employee();
        Student ps = new Student();
        Faculty pf = new Faculty();
        Staff pt = new Staff();

        // Calling toString on each object
        System.out.println(p);
        System.out.println(pe);
        System.out.println(ps);
        System.out.println(pf);
        System.out.println(pt); 

        // Testing equality
        System.out.println(p.equals(pe)); // false
        System.out.println(p.equals(ps)); // false
        System.out.println(p.equals(pf)); // false
        System.out.println(p.equals(pt)); // false

        // Assigning objects
        Person[] persons = {pe, ps, pf, pt};
        for (Person person : persons) {
            System.out.println(person);
        }

        // Using instanceof
        System.out.println("p is Person: " + (p instanceof Person));
        System.out.println("pe is Employee: " + (pe instanceof Employee));
        System.out.println("ps is Student: " + (ps instanceof Student));
        System.out.println("pf is Faculty: " + (pf instanceof Faculty));
        System.out.println("pt is Staff: " + (pt instanceof Staff));
    }
}  */