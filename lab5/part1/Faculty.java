package part1;
public class Faculty extends Employee{
    private String department;
    private String hours;
    private String rank;

    public Faculty(){
        this.department = "";
        this.hours = "";
        this.rank = "";
        System.out.println("class faculty");
    }

    public Faculty(Faculty f){
        super();
        if(f != null){
            this.department = new String(f.department);
            this.hours = new String(f.hours);
            this.rank = new String (f.rank);          
        }
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.hours = department;
    }
    public String getHours(){
        return hours;
    }
    public void setHours(String hours){
        this.hours = hours;
    }
    public String getRank(){
        return rank;
    }
    public void setRank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString(){
        String s = "";
        s += ("class faculty employee\n-------------");
        s += ("faculty employee name : " + this.name);
        return s;
    }

    @Override 
    public boolean equals(Object object){ 
    if (this == object)
        return true;
    if (!super.equals(object))
        return false;
    if (!(object instanceof Faculty)) 
        return false;
    Faculty other = (Faculty) object; 
    if (!department.equals(other.department)) 
        return false;
    if (!hours.equals(other.hours)) 
        return false;
    if (!rank.equals(other.rank)) 
        return false;
    return true;
}
}
