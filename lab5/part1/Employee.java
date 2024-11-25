package part1;
import java.util.Date;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected Date hireDate;

    public Employee(){
        this.office = "";
        this.salary = 0;
        this.hireDate = new Date();
        System.out.println("class employee");
    }

    public Employee(Employee e){
        super();
        if(e != null){
            this.office = new String(e.office);
            this.salary = e.salary;
            this.hireDate = new Date (e.hireDate.getTime());           
        }
    }

    public String getOffice(){
        return office;
    }
    public void setOffice(String office){
        this.office = office;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double status){
        this.salary = salary;
    }
    public Date getHirDate(){
        return hireDate;
    }
    public void setHireDate(Date hireDate){
        this.hireDate = hireDate;
    }

    @Override
    public String toString(){
        String s = "";
        s += ("class employee\n-------------");
        s += ("employee name : " + this.name);
        return s;
    }

    @Override 
        public boolean equals(Object object){ 
        if (this == object) 
            return true;
        if (!super.equals(object))
            return false;
        if (!(object instanceof Employee)) 
            return false;
        Employee other = (Employee) object; 
        if (!office.equals(other.office)) 
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        if (!hireDate.equals(other.hireDate)) 
            return false;
        return true;
}
}