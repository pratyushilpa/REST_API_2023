package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlineTests extends AirlineAPIs{

    @Test
    public void createAirline() throws IOException {
       /* System.out.println("Executing on the Environment :" + System.getProperty("env"));
        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        Map<String,Object> data = JsonUtils.getJsonDataAsMap("airlines/" + env + "/airlinesApiData.json");
        String endPoint =data.get("createAirlineEndPoint");*/
        Map<String,Object> payload = Payloads.getCreateAirlinePayloadFromMap("12925","Sri Lankan Airways","Sri Lanka","ABC","From Sri Lanka",
                "Katunayake, Sri Lanka","www.srilankaairways.com","1990");

       Response response= createAirline(payload);
        Assert.assertEquals(response.statusCode(),200);
    }
}
