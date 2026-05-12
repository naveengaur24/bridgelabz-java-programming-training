package IO_Programming.IO_Stream;

import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {

        OutputStreamWriter osw=new OutputStreamWriter(System.out);
        osw.write("Hello world..");
        osw.write(97);
        osw.write(10);
        osw.write('A');
        osw.write('\n');

        char[]arr="Hello world".toCharArray();
        osw.write(arr);   // write method ka use karne ke baad flush karna jaruri hai, nahi to output nahi aayega. write method se data buffer me chala jata hai, aur flush karne ke baad hi output aayega.

        osw.flush();  // flush ka mtlab hota hai print karna, jab tak flush nahi karenge tab tak output nahi aayega. flush karne ke baad hi output aayega.

    }
}
