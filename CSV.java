import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class CSV {
    String file_name = "database.csv";
    ArrayList <Vehicle> list = new ArrayList();
    
    public void read() throws FileNotFoundException{
        Scanner fin = new Scanner(new File(file_name)); 
        fin.useDelimiter(",");
        Vehicle v = null;
        int comma_counter =0;
        while (fin.hasNext()){
            
            String tmp = fin.next();
            
            System.out.println(tmp);
            
            
            
            switch(comma_counter){
                case 1:
                    v.setName(tmp);
                    comma_counter +=1;
                break;
                
                case 2:
                    char[] s = tmp.toCharArray();
                    int letters = 0;
                    while(s[letters]<='0' && s[letters]>='9'){letters +=1;}
                    String str = null;
                    int n = 0;
                    for(int i=0;i<letters;i+=1){ str+=s[i]; }
                    for(int i=letters;i<tmp.length();i+=1){ n+=s[i]-'0'; }
                    v.setModel(new Model(str,n));
                break;
                
                case 3:
                    v.setYear(Integer.parseInt(tmp));
                break;
                
                case 4:
                    v.setPetrolType(tmp);
                break;
                
                case 5:
                    v.setTankCapacity(Integer.parseInt(tmp));
                break;
                
                case 6:
                    v.setCost(Integer.parseInt(tmp));
                break;
            }
            
            if("AVTO".equals(tmp)){
                list.add(v);
                System.out.println("Auto");
                
                v = new Auto();
                comma_counter =1;
            }
            
            if("MOTO".equals(tmp)){
                list.add(v);
                System.out.println("Moto");
                
                v = new Moto();
                comma_counter =1;
            }
            
        }
        fin.close();
    }
    
    public ArrayList get_list() throws FileNotFoundException{
        read();
        return list;}
    
    public void write(ArrayList ls) throws IOException{
        FileWriter fout = new FileWriter(file_name);
        for(int i=0;i<ls.size();i+=1){
            Vehicle v = (Vehicle) ls.get(i);
            String tmp = v.getType() + "," + v.getName()+ "," + v.getModel().getName()+v.getModel().getNum() + "," + v.getYear() + "," +  v.getPetrolType()+ "," + v.getTankCapacity()+ "," + v.getCost()+"\n";
            fout.write(tmp);
            
        }
        fout.close();
    }
}
    