

class Main1 {
    private int currentFloore ;
    private int nbtOfFloore;
    private int currentPassagers ;
    private int maxPassangers;

    public Main1(int nbtOfFloore , int maxPassangers) {
        this.nbtOfFloore = nbtOfFloore;
        this.maxPassangers = maxPassangers;
        this.currentPassagers = 0;
        this.nbtOfFloore = -4; 

    }
    public void Up() {
        if(currentFloore < maxPassangers){
             currentFloore++;
        }
    }
    public  void  Down() {
        if(currentFloore >-4){
             currentFloore--;
        }
    }
    public void setNumberOfPassangers(int currentPassagers ) {
        if(currentPassagers < maxPassangers) {

            this.currentPassagers = currentPassagers;
        }
    }
    public void dropPassangers (int dropped) {
        this.nbtOfFloore -= dropped;
    }
    public void tellWithFloore () {
        System.out.println("the current floore is " + currentFloore);
    }
    

    public static void main(String[] args) {
        Main1 elevator = new Main1(1,22);
        elevator.tellWithFloore();
        int a = 5;
int b =  ++a + a++;
System.out.println(b);
    }
}