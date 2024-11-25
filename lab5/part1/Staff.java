package part1;
public class Staff extends Employee {
    private String title;

    public Staff(){
        this.title = "";
        System.out.println("class staff");
    }

    public Staff(Staff t){
        super();
        if(t != null){
            this.title = new String(t.title);               
        }
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

   @Override
   public String toString(){
       String s = "";
       s += ("class staff employee\n-------------");
       s += ("staff employee name : " + this.name);
       return s;
   }

   @Override 
   public boolean equals(Object object){ 
   if (this == object)
       return true;
   if (!super.equals(object))
       return false;
   if (!(object instanceof Staff)) 
       return false;
   Staff other = (Staff) object; 
   if (!title.equals(other.title)) 
       return false;
   return true;
}
}

