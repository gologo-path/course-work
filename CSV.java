import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class CSV {
    String file_name = "database.csv";
    ArrayList list = new ArrayList();
    
  /*  public void read() throws FileNotFoundException{
        Scanner fin = new Scanner(new File(file_name)); 
        fin.useDelimiter(",");
        while (fin.hasNext()){
            if(fin.next()){}
        }
    }
    */
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
    