
public abstract class Vehicle {
	protected Type type;
	protected String name;
	protected int year;
	protected Model model;
	protected String manufacturer;
	protected PetrolType petrolType;
	protected double capacity;
	protected double cost;
	
	/*
	public void setType(Type type) {
    	this.type=type;
    }*/
    public Type getType() {
    	return type;
    }    
    public void setName(String name) {
    	this.name=name;
    }
    public String getName() {
    	return name;
    }    
    public void setYear(int year) {
    	this.year=year;
    }
    public int getYear() {
    	return year;
    }    
    public void setModel(Model model) {
    	this.model=model;
    }
    public Model getModel() {
    	return model;
    }
    
    public void setManufacturer(String manufacturer) {
    	this.manufacturer=manufacturer;
    }
    public String getManufacturer() {
    	return manufacturer;
    }   
    public void setPetrolType(PetrolType petrolType) {
    	this.petrolType=petrolType;
    }
    public PetrolType getPetrolType() {
    	return petrolType;
    }
    public void setTankCapacity(double capacity) {
    	this.capacity=capacity;
    }
    public double getTankCapacity() {
    	return capacity;
    }    
    public void setCost(double cost) {
    	this.cost=cost;
    }
    public double getCost() {
    	return cost;
    }
}
