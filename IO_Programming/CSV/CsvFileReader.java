package IO_Programming.CSV;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class CsvFileReader {
    public static void main(String[] args) throws Exception {

        //  Approach 1: using Scanner class
        // String filePath = System.getProperty("user.dir") + "\\IO_Programming\\CSV\\data.csv";  // getting file path
        // FileReader file = new FileReader(filePath);  // creating file object

        // Scanner sc=new Scanner(file);  // creating scanner object

        // sc.useDelimiter(",");  // setting delimiter to comma 
        // while(sc.hasNext()){  // reading data from csv file
        //     System.out.print(sc.next() + "\t");  // printing data
        // }
        // sc.close();  // closing scanner



        // Approach 2: using java split() method  and BufferedReader class
        String filePath=System.getProperty("user.dir")+"\\Io_Programming\\CSV\\data.csv";  // getting file path
        FileReader file1 = new FileReader(filePath);  // creating file reader object

        BufferedReader br = new BufferedReader(file1);  // creating buffered reader object  for reading data line by line from csv file

        String line; 
        while((line=br.readLine())!=null){  // reading data from csv file
            String[]data = line.split(",");  // splitting data using comma as delimiter
            for(String s:data){  // printing data
                System.out.print(s + "\t");
            }
            System.out.println();  // printing new line after each line of data
        }
        br.close();  // closing buffered reader

    }
}
