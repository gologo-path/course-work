import java.io.IOException;
import java.util.ArrayList;

public class Shop {
    private String name;
    private String adr;
    private ArrayList<Vehicle> reg;
    
    Shop(){
    	name="some_shop";
    	adr="any_adress";
    	reg = new ArrayList<>();
    	try {
    		download();
		} catch (IOException e) {
			System.out.println("Не удалось подгрузить  регистр!!!");
		}
    }
    Shop(String name, String adr){
    	this.name=name;
    	this.adr=adr;
    	try {
    		download();
		} catch (IOException e) {
			System.out.println("Не удалось подгрузить  регистр!!!");
		}
    }
    Shop(String name, String adr, Vehicle[] reg_arr){
    	this.name=name;
    	this.adr=adr;
    	reg = new ArrayList<>();
    	for (int i = 0; i < reg_arr.length; i++) {
			reg.add(reg_arr[i]);
		}
    }
    
    
    public void download() throws IOException{
    	//ф-я подкачки из файла, вызов автоматически при создании объекта
        CSV f = new CSV();
        reg = f.get_list();
    }
    public void upload() throws IOException{
    	//ф-я загрузки в файл, перед завершением программы нужно дополнительно вызвать извне.
        CSV f = new CSV();
        f.write(reg);
    }
    
    public void add(Vehicle v) { //добавление
    	reg.add(v);
    }
    public void delete(Vehicle v) {			//удаление
    	for (int i = 0; i < reg.size(); i++) {
			if(reg.get(i)==v) {
				for (int j = i; j < reg.size()-1; j++) {	//смещение 
					reg.set(j, reg.get(j+1));
				}
				reg.remove(reg.size()-1);
				break;
			}
		}
    }
    public Vehicle[] getAvtoRegistry(){
    	Vehicle[] reg_arr=new Vehicle[reg.size()];
    	for (int i = 0; i < reg_arr.length; i++) {
    		if(reg.get(i).type==Type.AVTO)
    			reg_arr[i]=reg.get(i);
		}
    	return reg_arr;
    }
    public Vehicle[] getMotoRegistry(){
    	Vehicle[] reg_arr=new Vehicle[reg.size()];
    	for (int i = 0; i < reg_arr.length; i++) {
    		if(reg.get(i).type==Type.MOTO)
    			reg_arr[i]=reg.get(i);
		}
    	return reg_arr;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    public String getName(){
    	return name;
    }
    public void setAdr(String adr){
    	this.adr = adr;
    }
    public String getAdr(){
    	return adr;
    }
    public void setRegistry(Vehicle[] reg_arr){
    	reg = new ArrayList<>();
    	for (int i = 0; i < reg_arr.length; i++) {
			reg.add(reg_arr[i]);
		}
    }
    public Vehicle[] getRegistry(){
    	Vehicle[] reg_arr=new Vehicle[reg.size()];
    	for (int i = 0; i < reg_arr.length; i++) {
			reg_arr[i]=reg.get(i);
		}
    	return reg_arr;
    }
}
