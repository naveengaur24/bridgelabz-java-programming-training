package IO_Programming.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;


// Deserialization -> JSON data ko Java object me convert
public class ReadJSON {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();  // objectMapper ek class hai iska use [ JSON ↔ Java Object conversion ke liye.]

        String path = System.getProperty("user.dir")+ "\\IO_Programming\\JSON\\user.json";

        User user = mapper.readValue(new File(path), User.class);

        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
        System.out.println("City: " + user.city);
    }
}