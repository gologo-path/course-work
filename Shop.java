import java.io.IOException;
import java.util.ArrayList;

public class Shop {
    private String name;
    private String adr;
    private ArrayList<Vehicle> reg;
    private double bank;
    
    Shop(){
    	name="some_shop";
    	adr="any_adress";
    	reg = new ArrayList<>();
    	try {
    		download();
		} catch (IOException e) {
			System.out.println("�� ������� ����������  �������!!!");
		}
    }
    Shop(String name, String adr){
    	this.name=name;
    	this.adr=adr;
    	reg = new ArrayList<>();
    	try {
    		download();
		} catch (IOException e) {
			System.out.println("�� ������� ����������  �������!!!");
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
    	//�-� �������� �� �����, ����� ������������� ��� �������� �������
    }
    public void upload() throws IOException{
    	//�-� �������� � ����, ����� ����������� ��������� ����� ������������� ������� �����.
    }
    
    
    public void add(Vehicle v) { //����������
    	reg.add(v);
    }
    public void delete(Vehicle v) {			//��������
    	for (int i = 0; i < reg.size(); i++) {
			if(reg.get(i)==v) {

				for (int j = i; j < reg.size()-1; j++) {	//�������� 
					reg.set(j, reg.get(j+1));
				}
				reg.remove(reg.size()-1);
				break;

			}
		}
    }
    public Vehicle sellVehicle(Vehicle v) {
    	for (int i = 0; i < reg.size(); i++) {
			if(reg.get(i)==v) {
				bank+=reg.get(i).getCost();
				return reg.remove(i);

			}
		}
    	return null;
    }
    public Vehicle[] getPetrolRegistry(PetrolType type){
    	Vehicle[] reg_arr=new Vehicle[reg.size()];
    	for (int i = 0; i < reg_arr.length; i++) {
    		if(reg.get(i).getPetrolType()==type)
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
    public double getBank() {
		return bank;
	}
}
