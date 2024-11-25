package part1;
public class Student extends Person {
    private String status;

    public Student(){
        this.status = "";
        System.out.println("class student");
    }

    public Student(Student s){
        super();
        if (s != null){
            this.status = new String(s.status);
        }
    }

    @Override
    public String toString(){
        String s = "";
        s += ("class student\n-------------");
        s += ("student name : " + this.name);
        return s;
    }

    @Override 
    public boolean equals(Object object){ 
        if (this == object) 
           return true;
        if (!super.equals(object))
           return false;
        if (!(object instanceof Student)) 
           return false;
        Student other = (Student) object; 
        if (!status.equals(other.status)) 
           return false;
        return true;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
