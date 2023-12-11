package API;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class countryapi {
	private static String Base_Url = "https://restcountries.com/v3.1";
	
	@Test
	public void postivetest1()
	{
		given().baseUri(Base_Url).basePath("/name/india").queryParam("fullText", "true")
		.when().get()
		.then().statusCode(200).log().all();
	}



@Test
public void nagitivetest1()
{
	given().baseUri(Base_Url).basePath("/name/dummycountry").queryParam("fullText", "true")
	.when().get()
	.then().statusCode(404).log().all();
}
}