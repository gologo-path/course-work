
public class Shop {
    private String name;
    private String adr;
    private Vehicle reg[];
    
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    
    public void setAdr(String adr){this.adr = adr;}
    public String getAdr(){return adr;}
    //енененен
    public void setAutoRegistry(Vehicle[] reg){this.reg = reg;}
    public Vehicle[] getAutoRegistry(){return reg;}
}
