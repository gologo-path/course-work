
public class Auto extends Vehicle{
    Auto(){
    this.type = Type.AVTO;
    };
    
    Auto(String name, int year,Model model,String petrolType,double capacity, double cost){
        this.name = name;
        this.type = Type.AVTO;
        this.year = year;
        this.capacity = capacity;
        this.cost = cost;
        this.model = model;
        this.petrolType = petrolType;
    };
}
