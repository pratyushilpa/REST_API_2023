package airlines;

import utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class Base {
    public static Map<String,Object> dataFromJsonFile;
    static {
        System.out.println("Executing on the Environment :" + System.getProperty("env"));
        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        try {
            dataFromJsonFile = JsonUtils.getJsonDataAsMap("airlines/" + env + "/airlinesApiData.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
