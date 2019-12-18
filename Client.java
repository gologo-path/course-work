public class Client {
    private String name;
    private String surname;
    private int year;
    private int ID;
    
    Client(String name, String surname, int year, int ID){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.ID = ID;
    }
    //
    public String getName(){return name;}
    public String getSurname(){return surname;}
    public int getYear(){return year;}
    public int getID(){return ID;}
    
}
