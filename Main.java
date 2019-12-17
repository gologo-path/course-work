import java.util.Scanner;

public class Main{
    public static void main(String []args){
    	Vehicle tmp;
    	Shop shop=new Shop("Autoshop", "13 Baker st.");
    	Scanner s=new Scanner(System.in);
    	int ans;
    	
    	while (true) {
    		System.out.println("1. Додати транспортний засіб до реєстру");
    		System.out.println("2. Видалити транспортний засіб із реєстру");
    		System.out.println("3. Отримати список усіх транспортних засобів, що містяться у реєстрі");
    		System.out.println("4. Отримати список усіх транспортних засобів, тип палива яких відповідає заданому");
    		System.out.println("5. Продати обране авто покупцеві магазину, при цьому транспортний засіб	видаляється із реєстру та записується ціна продажу");
    		System.out.println("6. Роздрукувати суму продажів за «день»");
    		System.out.println("7. Зберегти реєстр до сховища (текстовий файл)");
    		System.out.println("8. Отримати реєстр із сховища (текстового файлу)");
    		System.out.println("9. Вихід");
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
			System.out.println("Оберіть тип транспортного засобу: 1. Автомобіль 2. Мотоцикл");    		
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
