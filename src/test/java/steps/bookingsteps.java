package steps;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.io.File;

import org.testng.Assert;
public class bookingsteps {
	RequestSpecification res;
	Response responsel;
	@Given("create useing paylaod")
	public void create_useing_paylaod() {
		res=given()
		.header("Content-Type","application/json")
		
		        .body(new File("src\\test\\resources\\json\\newbooking.json"));
	}
                                                                                  
	@When("adding resource for post methods")
	public void adding_resource_for_post_methods() {
		
		responsel=	res.when().post("https://restful-booker.herokuapp.com/booking");
	}

	@Then("verfy status code and id")
	public void verfy_status_code_and_id() {
		responsel.then().statusCode(200).log().all();
		Assert.assertEquals(responsel.statusCode(), 200);
		System.out.println(responsel);
	}

	

}
