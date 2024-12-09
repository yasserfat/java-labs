package part4;

public class animalException extends Exception {
    protected String errorMsg;
    
    protected animalException(){
        this("An animal exception occurred instead of Animal");
    }
    
    protected animalException(String errorMsg){
        this.errorMsg = errorMsg;
    }

    public String getMessage(){
        return this.errorMsg + " Exception occured ";
    }
}
