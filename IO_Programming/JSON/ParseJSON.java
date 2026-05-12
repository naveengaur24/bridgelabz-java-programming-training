package IO_Programming.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ParseJSON {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("user.json"));  // it converts JSON to a tree structure and we can access the values using the keys

        String name = root.get("name").asText();  
        int age = root.get("age").asInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}