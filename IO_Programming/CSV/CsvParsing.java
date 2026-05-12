package IO_Programming.CSV;
import java.io.FileReader;
import java.io.BufferedReader;


// parsing means - Raw data ko todkar samajhna aur useful format me convert karna.
public class CsvParsing {
    public static void main(String[] args) throws Exception {

        String filePath = System.getProperty("user.dir") + "\\IO_Programming\\CSV\\data.csv";

        FileReader file1 = new FileReader(filePath);
        BufferedReader br = new BufferedReader(file1);

        String line;

        // Skip krenge header ko beacause usme data nahi hota
        line = br.readLine();  

        while((line = br.readLine()) != null){

            // parsing krenge line ko comma ke basis pe split karke
            String[] data = line.split(",");

            // trimming krenge data ko taaki extra spaces remove ho jaye
            for(int i = 0; i < data.length; i++){
                data[i] = data[i].trim();
            }
            // ab data ko variables me store krenge
            String name = data[0];
            String age = data[1];
            String city = data[2];

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("------");
        }
        br.close();
    }
}