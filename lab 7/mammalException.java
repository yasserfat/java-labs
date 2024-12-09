package part4;

public class mammalException extends animalException{
    protected mammalException(){
        this("A mammal exception occurred instead of Mammal");
    }
    
    protected mammalException(String errorMsg){
        super(errorMsg);
    }

    
    public String getMessage(){
        return this.errorMsg + " Exception occured ";
    }
}
