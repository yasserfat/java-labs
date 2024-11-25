public class Student {
    public long id;
    public String name;
    public String major;
    public String department;
    public String[] courses;

    public Student(long id, String name, String major, String department, String[] courses) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.department = department;
        this.courses = courses;
        System.out.println("Constructor with 5 parameters called.");
    }

    public Student(long id, String name, String major, String department) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.department = department;
        System.out.println("Constructor with 4 parameters called.");
    }

    public Student(long id, String name, String major) {
        this(id, name, major, null);
        System.out.println("Constructor with 3 parameters called.");
    }

    public Student(long id, String name) {
        this(id, name, null);
        System.out.println("Constructor with 2 parameters called.");
    }
    
    

    public static void main(String[] args) {

        Student student1 = new Student(1, "Alice", "Math", "Science", new String[]{"Calculus", "Algebra"});
        Student student2 = new Student(2, "Bob", "History", "Humanities");
        Student student3 = new Student(3, "Carol", "Physics");
        Student student4 = new Student(4, "Dave");
    }
}
