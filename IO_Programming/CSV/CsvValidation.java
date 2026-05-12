package IO_Programming.CSV;
import java.io.FileReader;
import java.io.BufferedReader;

public class CsvValidation {
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

            // Validation krenge data ki length check karke taaki column mismatch na ho
            if(data.length != 3){
                System.out.println("Invalid row (column mismatch): " + line);
                continue;
            }

            // trimming krenge data ko taaki extra spaces remove ho jaye
            for(int i = 0; i < data.length; i++){
                data[i] = data[i].trim();
            }

            // ab data ko variables me store krenge
            String name = data[0];
            String ageStr = data[1];
            String city = data[2];

            // validation krenge age ko number me convert karke taaki non-numeric age ko handle kar sake
            int age;
            try {
                age = Integer.parseInt(ageStr);
            } catch(NumberFormatException e){
                System.out.println("Invalid row -- age not a number " + line);
                continue;
            }

            // 🔹 Validation 4: age range check
            if(age < 0 || age > 120){
                System.out.println("Invalid row -- age out of range " + line);
                continue;
            }
            System.out.println("Valid Data:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("------");
        }
        br.close();
    }
}

