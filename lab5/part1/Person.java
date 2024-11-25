package part1;
public class Person{
    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public Person(){ //constructor with default values
        this.name = "";
        this.address = "";
        this.phone = "";
        this.email = "";
        System.out.println("class person");
        //name.
    }

    public Person(Person p){  // copy constructor that makes deep copy of each field
        super();
        if(p != null){
            this.name = new String(p.name);
            this.address = new String (p.address);
            this.phone = new String (p.phone);
            this.email = new String (p.email);
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        String s = "";
        s += ("class person\n-------------");
        s += ("person name : " + this.name);
        return s;
    }

    @Override 
    public boolean equals(Object object){ //overriding equals to check if 2objs r equal
        if (this == object) //if they point to same object in mem heap
           return true;
        if (object == null)
           return false;
        if (!(object instanceof Person)) //objects cant be equal if they arnt same type
           return false;
        Person other = (Person) object; //casting for further comparison
        if (!name.equals(other.name)) //if they are the same name
           return false;
        if (!address.equals(other.address))
           return false;
        if (!phone.equals(other.phone))
           return false;
        if (!email.equals(other.email))
           return false;
        return true; 
    }
}
