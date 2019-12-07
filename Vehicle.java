
public interface Vehicle {
    public void setType(String type); //Различие между авто и мото
    public String getType();
    
    public void setName(String name);
    public String getName();
    
    public void setYear(int year);
    public int getYear();
    
    public void setModel(String model); // будет меняться
    public String getModel();
    
    public void setManufacturer(String manufacturer);
    public String getManufacturer();
    
    public void setPetrolType(String petrolType);
    public String getPetrolType();
    
    public void setTankCapacity(double capacity);
    public double getTankCapacity();
    
    public void setCost(double cost);
    public double getCost();
}
