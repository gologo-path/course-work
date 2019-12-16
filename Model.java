
public class Model {
    private String name;
    private int num;
    
    Model(String name, int num){
        this.name = name;
        this.num = num;
    }
    
    public String getName(){
    	return name;
    }
    public int getNum(){
    	return num;
    }    
}
