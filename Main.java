import java.util.Scanner;

public class Main{
    public static void main(String []args){
    	Vehicle tmp;
    	Shop shop=new Shop("Autoshop", "13 Baker st.");
    	Scanner s=new Scanner(System.in);
    	int ans;
    	
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
				
				break;
			case 9:
				s.close();
				System.out.println("---end---");
				return;
			default:
				System.out.println("---Uncorrect input---");
				break;
			}
		}
    	
    }
    public static Vehicle choose(int ans, Scanner s) {
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
			default:
				System.out.println("---Uncorrect input---");
				continue;
			}
    		break;
		}
		
    	return v;
	} 

}
