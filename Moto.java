
public class Moto extends Vehicle{
	
	Moto(){
		type=Type.MOTO;
		name="Some_bike";
		year=2000;
		model.name="any_model";
		model.num=3;
		//manufacturer="Cars&Motos";
		petrolType="oil";		
		capacity=1000;
		cost=20000;
	}
	Moto(String name, int year, Model model, String petrolType, double capacity, double cost){
		type=Type.MOTO;
		this.name=name;
		this.year=year;
		this.model.name=model.name;
		this.model.num=model.num;
		//this.manufacturer=manufacturer;
		this.petrolType=petrolType;
		this.capacity=capacity;
		this.cost=cost;
	}
}
