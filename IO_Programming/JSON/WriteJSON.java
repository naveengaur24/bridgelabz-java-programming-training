package IO_Programming.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class WriteJSON {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User("Naveen", 22, "Bangalore");

        String path = System.getProperty("user.dir")+ "\\IO_Programming\\JSON\\user.json";

        mapper.writeValue(new File(path), user);

        System.out.println("JSON written successfully");
    }
}