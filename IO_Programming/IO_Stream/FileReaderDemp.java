package IO_Programming.IO_Stream;
import java.io.*;
import java.io.InputStreamReader;
public class FileReaderDemp {
    public static void main(String[] args) {
        try(FileReader fr= new FileReader("notes.txt")) {
            int letters=fr.read();

            while(fr.ready()){
                System.out.println((char)letters);
                letters=fr.read();
            }
            System.out.println();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}


// FileReader is a class in Java that is used to read the data from a file. It is a subclass of InputStreamReader and it is used to read the data from a file in the form of characters. It is a character stream class and it is used to read the data from a file in the form of characters. It is a bridge between byte streams and character streams. It reads bytes and decodes them into characters using a specified charset. The charset can be specified by name or can be given explicitly, or the platform's default charset can be used.
