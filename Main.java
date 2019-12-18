import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String []args){
    	Shop shop=new Shop("Autoshop", "13 Baker st.");
    	Scanner s=new Scanner(System.in);
    	Map<Client, Vehicle> Sells = new HashMap<>();
    	int ans=0;
//    	Avto a = new Avto();
//    	Avto b = new Avto();
//    	System.out.println(a.equals(b));
    	
    	while (true) {
    		System.out.println("1. ������ ������������ ���� �� ������");
    		System.out.println("2. �������� ������������ ���� �� ������");
    		System.out.println("3. �������� ������ ��� ������������ ������, �� �������� � �����");
    		System.out.println("4. �������� ������ ��� ������������ ������, ��� ������ ���� ������� ��������");
    		System.out.println("5. ������� ������ ���� �������� ��������, ��� ����� ������������ ����	����������� �� ������ �� ���������� ���� �������");
    		System.out.println("6. ������������ ���� ������� �� ������");
    		System.out.println("7. �������� ����� �� ������� (��������� ����)");
    		System.out.println("8. �������� ����� �� ������� (���������� �����)");
    		System.out.println("9. �����");
    		ans=s.nextInt();
    		switch (ans) {
			case 1:
				shop.add(temp_vehicle());
				break;
			case 2:
				shop.delete(temp_vehicle());
				break;
			case 3:
				
				for (Vehicle v : shop.getRegistry()) {
					System.out.println(v.getType().name()+" "+v.getName()+" "+v.getModel().name+"-"+v.getModel().num+" "+v.getYear()+" "+v.getManufacturer()+" "+v.getPetrolType().name()+" "+v.getTankCapacity()+" "+v.getCost());
				}
				break;
			case 4:
				PetrolType temp;
				while (true) {
					System.out.println("������ ��� ������: \n1. ������ \n2. ������ \n3. ���������� \n4. �������");    		
		    		ans=s.nextInt();
		    		switch (ans) {
					case 1:
						temp=PetrolType.GAS;
						break;
					case 2:
						temp=PetrolType.DIEZEL;
						break;
					case 3:
						temp=PetrolType.ELECTRIC;
						break;
					case 4:
						temp=PetrolType.NUCLEAR;
						break;
					default:
						System.out.println("---Uncorrect input---");
						continue;
					}
		    		break;
				}
				for (Vehicle v : shop.getPetrolRegistry(temp)) {
					System.out.println(v.getType().name()+" "+v.getName()+" "+v.getModel().name+v.getModel().num+" "+v.getYear()+" "+v.getManufacturer()+" "+v.getPetrolType().name()+" "+v.getTankCapacity()+" "+v.getCost());
				}
				break;
			case 5:
				Client client = new Client();
				System.out.print("������ ��� �������: \n��'�:");
				client.setName(s.next());
				System.out.print("�������: ");
				client.setSurname(s.next());
				System.out.println("г� ����������: ");
				client.setYear(s.nextInt());
				System.out.println("���������������� ���: ");
				client.setID(s.nextLong());
				System.out.println("������� ������������ ����, ���� ���� ��������: ");
				Vehicle purchase = shop.sellVehicle(temp_vehicle());
				
				if(purchase!=null) {
					Sells.put(client, purchase);
					System.out.println("������ �������!");
				}
				else {
					System.out.println("�� ����, ������������� ������, ���� ���� ��������, �� ������� � �����");
				}
				break;
			case 6: 
				for (Client c : Sells.keySet()) {
					System.out.println(c.getName()+": "+Sells.get(c).getName()+" "+Sells.get(c).getCost());
				}
				System.out.println("�������� �� ����: "+shop.getBank()); 
				break;
			case 7:
				try {
					shop.upload();
					System.out.println("��� ��������� �� �������!");
				} catch (IOException e) {
					System.out.println("���� �� ��������!");
				}
				break;
			case 8:
				try {
					shop.download();
					System.out.println("��� ��������� � �������!");
				} catch (IOException e) {
					System.out.println("���� �� ��������!");
				}
				break;
			case 9:
				try {
					shop.upload();
					System.out.println("��� ��������� �� �������!");
				} catch (IOException e) {
					System.out.println("���� �� ��������!");
				}
				s.close();
				System.out.println("---end---");
				return;
			default:
				System.out.println("---Uncorrect input---");
				break;
			}
		}
    	
    }
  //������� ������ ����������. ������ � ��� �� "��������" ������, � ������� ����� ��������
    //���� �� ��������, ����������, �����. ���������� ��������� ���
    public static Vehicle temp_vehicle() { 		
    	int ans; 
    	Scanner s=new Scanner(System.in);
    	Vehicle v;		
		
    	while (true) {
			System.out.println("������ ��� ������������� ������: 1. ��������� 2. ��������");    		
    		ans=s.nextInt();
    		switch (ans) {
			case 1:
				v=new Avto();
				break;
			case 2:
				v=new Moto();
				break;
			default:
				System.out.println("---Uncorrect input---");
				continue;
			}
    		break;
		}
		System.out.print("������ ����� ������������� ������: ");    		
		v.setName(s.next());
		System.out.print("������ ������ ������������� ������: ");    		
		String tmp=s.next();
		System.out.print("	����� �����: ");    		
		v.setModel(new Model(tmp, s.nextInt()));
		System.out.print("������ �� ����������� ������������� ������: ");    		
		v.setYear(s.nextInt());
		System.out.print("������ ���������: ");    		
		v.setManufacturer((s.next()));
		while (true) {
			System.out.println("������ ��� ������: \n1. ������ \n2. ������ \n3. ���������� \n4. �������");    		
    		ans=s.nextInt();
    		switch (ans) {
			case 1:
				v.setPetrolType(PetrolType.GAS);
				break;
			case 2:
				v.setPetrolType(PetrolType.DIEZEL);
				break;
			case 3:
				v.setPetrolType(PetrolType.ELECTRIC);
				break;
			case 4:
				v.setPetrolType(PetrolType.NUCLEAR);
				break;
			default:
				System.out.println("---Uncorrect input---");
				continue;
			}
    		break;
		}
		System.out.print("������ ������ ��������� �������: ");    		
		v.setTankCapacity(s.nextDouble());
		System.out.print("������ ����: ");    		
		v.setCost(s.nextDouble());
		//s.close();
    	return v;
	} 

}
