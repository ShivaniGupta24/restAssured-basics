package postServiceTests;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodType;

public class PostServiceTest1 {

    @Test
    void getCustomerDetailsForRegistration(){
        RestAssured.baseURI = "http://restapi.demoqa.com/customer/register";
        RequestSpecification httpRequest = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("FirstName", "FirstName");
        requestParams.put("LastName", "LastName");
        requestParams.put("UserName", "UserName");
        requestParams.put("Password", "Password");
        requestParams.put("Email", "Email");

        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(requestParams.toJSONString());

        Response httpResponse = httpRequest.request(Method.POST, "register");

        int restResponseStatusCode = httpResponse.getStatusCode();
        Assert.assertEquals(200, restResponseStatusCode);


    }
}
