package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utility.DriverSetup;

public class sign_up {
	WebDriver driver;
	public List <List<String>> input;


	@Given("^User is on the application page$")
	public void user_is_on_the_application_page() {

		driver = DriverSetup.getWebDriver("chrome");
		driver.get("https://www.phptravels.net/home");
		driver.manage().window().maximize();
	}

	@When("^Application page title is \"([^\"]*)\"$")
	public void application_page_title_is(String expectedTitle){

		Assert.assertEquals(expectedTitle, driver.getTitle());

	}

	@Then("^navigate to SignUp page$")
	public void navigate_to_SignUp_page() {
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@class='dropdown-item tr']")).click();

	}

	@Then("^fill the sign up form$")
	public void fill_the_sign_up_form(DataTable Data)  {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		input = Data.raw();
		driver.findElement(By.name("firstname")).sendKeys(input.get(0).get(0));
		driver.findElement(By.name("lastname")).sendKeys(input.get(0).get(1));
		driver.findElement(By.name("phone")).sendKeys(input.get(0).get(2));
		driver.findElement(By.name("email")).sendKeys(input.get(0).get(3));
		driver.findElement(By.name("password")).sendKeys(input.get(0).get(4));
		driver.findElement(By.name("confirmpassword")).sendKeys(input.get(0).get(5));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^validate correct inputs are displayed$")
	public void validate_correct_inputs_are_displayed(){
		Assert.assertEquals(input.get(0).get(0) , driver.findElement(By.name("firstname")).getAttribute("value") );
		Assert.assertEquals(input.get(0).get(1) , driver.findElement(By.name("lastname")).getAttribute("value") );
		Assert.assertEquals(input.get(0).get(2) , driver.findElement(By.name("phone")).getAttribute("value") );
		Assert.assertEquals(input.get(0).get(3) , driver.findElement(By.name("email")).getAttribute("value") );
		Assert.assertEquals(input.get(0).get(4) , driver.findElement(By.name("password")).getAttribute("value") );
		Assert.assertEquals(input.get(0).get(5) , driver.findElement(By.name("confirmpassword")).getAttribute("value") );
	}

	@And("^submit the signup form$")
	public void submit_the_signup_form(){
		driver.findElement(By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")).click();
		
	}
	
	@Then("^Quit the driver$")
	public void quit_the_driver()  {
	    // Write code here that turns the phrase above into concrete actions
	   DriverSetup.exitDriver();
	}


}
