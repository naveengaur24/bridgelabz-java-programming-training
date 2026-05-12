package IO_Programming.IO_Stream;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(BufferedWriter bw= new BufferedWriter(new FileWriter("notes.txt"))) {
            bw.write("Hello, this is a buffered writer demo.");
            bw.newLine();
            bw.write("This is the second line.");
            bw.newLine();
            bw.write("This is the third line.");
            bw.newLine();
            bw.write("Hello, this is a buffered writer demo.");
            bw.newLine();
            bw.write("Naveen");
            System.out.println("Data written to the file successfully.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
