package IO_Programming.IO_Stream;
import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw= new FileWriter("notes.txt");
            fw.write("Hello, this is a file writer demo.");
            fw.write("\nThis is the second line.");
            fw.write("\nThis is the third line.");
            fw.write("\nHello, this is a file writer demo.");
            fw.write("\nNaveen");
            System.out.println("Data written to the file successfully.");
            fw.flush();
    }
}
