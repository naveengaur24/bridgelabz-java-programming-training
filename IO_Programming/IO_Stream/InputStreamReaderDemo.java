package IO_Programming.IO_Stream;
import java.io.InputStreamReader;
import java.io.IOException;



// inputstreamreader is used to read the data from the input stream and convert it into characters. It is a bridge between byte streams and character streams. It reads bytes and decodes them into characters using a specified charset. The charset can be specified by name or can be given explicitly, or the platform's default charset can be used.
class InputStreamReaderDemo{
    public static void main(String[] args) {
        try(InputStreamReader isr= new InputStreamReader(System.in)) {
            System.out.println("Enter a string: ");
            int letters=isr.read();

            while(isr.ready()){
                System.out.println((char)letters);
                letters=isr.read();
            }
            System.out.println();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
