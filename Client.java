public class Client {
    private String name;
    private String surname;
    private int year;
    private int ID;
    private Vehicle vehicle=null;
    
    Client(){
    	name="somebody";
    	surname="any";
    	year=2000;
    	ID=00000000;
    }
    Client(String name, String surname, int year, int ID){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.ID = ID;
    }
    public void buyVehicle(Vehicle vehicle) {
    	this.vehicle=vehicle;
    }
    public String getName(){
    	return name;
    }
    public String getSurname(){
    	return surname;
    }
    public int getYear(){
    	return year;
    }
    public int getID(){
    	return ID;
    }
    
}
