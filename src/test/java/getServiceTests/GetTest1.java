package getServiceTests;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class GetTest1 {

    @Test
    void getWeatherDetails(){
        // Full URL http://restapi.demoqa.com/utilities/weather/city/Hyderabad
        RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/";
        RequestSpecification httpRequest = RestAssured.given();

        Response httpResponse = RestAssured.request(Method.GET, "Pune");
    System.out.println(httpResponse.getBody().asString());
    System.out.println("Status code is="+httpResponse.getStatusCode());
        System.out.println("Status line is="+httpResponse.getStatusLine());
    }
}
