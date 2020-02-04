package NewCucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logn {
	static{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\ChromeDriver\\chromedriver.exe");
	}
	WebDriver driver = new ChromeDriver();
	
	
	@Given("User is in the Login Page")
	public void user_is_in_the_Login_Page() {
		
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
		
	}

	@When("User enters valid credentials")
	public void user_enters_valid_credentials() {	    
		WebElement Signin= driver.findElement(By.linkText("SignIn"));
		Signin.click();
		WebElement Uname=driver.findElement(By.xpath("//div[contains(@class,'col-md-12')]/input[1]"));
		Uname.click();
		Uname.sendKeys("lalitha");
		WebElement Password=driver.findElement(By.xpath("//div[contains(@class,'row')][2]/div[contains(@class,'col-md-12')]/input"));
		Password.click();
		Password.sendKeys("Password123");		
		WebElement Login=driver.findElement(By.name("Login"));
		Login.click();
	}

	@Then("User should navigate to dashboard")
	public void user_should_navigate_to_dashboard() {
		WebElement SO=driver.findElement(By.linkText("SignOut"));	
		SO.click();
		//Assert.assertEquals(SO,"SignOut");   
		
	}
	@When("User enters invalid credentials")
	public void user_enters_invalid_credentials() {
		WebElement Signin= driver.findElement(By.linkText("SignIn"));
		Signin.click();
		WebElement Uname=driver.findElement(By.xpath("//div[contains(@class,'col-md-12')]/input[1]"));
		Uname.click();
		Uname.sendKeys("lalitha");
		WebElement Password=driver.findElement(By.xpath("//div[contains(@class,'row')][2]/div[contains(@class,'col-md-12')]/input"));
		Password.click();
		Password.sendKeys("Password12");		
		WebElement Login=driver.findElement(By.name("Login"));
		Login.click();	   
	}

	@Then("User gets an error message")
	public void user_gets_an_error_message() {
		WebElement a=driver.findElement(By.xpath("//fieldset/div[6]"));
		//Assert.assertEquals(a,"Username or Password is wrong here!!!");
		
		
	}




}
