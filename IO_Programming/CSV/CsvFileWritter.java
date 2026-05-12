package IO_Programming.CSV;
import java.io.FileWriter;
import java.io.IOException;


public class CsvFileWritter {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\BridgeLabz-Training-Java\\IO_Programming\\CSV\\data.csv";
        FileWriter writer = new FileWriter(filePath);    // creating file writer object
        // writing data to csv file
        writer.append("Name,Age,City\n");
        writer.append("Naveen,30,Bangalore\n");
        writer.append("Ravi,25,Mumbai\n");  
        writer.append("Sachin, 22, Mathura\n");
        writer.append("Rama,22, Mathura\n");
        writer.close();   // closing file writer  and saving data to csv file

        System.out.println("Data written to csv file successfully..");

    }
}
