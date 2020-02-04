package NewCucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Examplee
{
static
{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\ChromeDriver\\chromedriver.exe");
}
WebDriver driver = new ChromeDriver();
	@Given("User is on the Login Page")
	public void user_is_on_the_Login_Page() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	}
	    
	

	@When("user enters {string} and {string} and clicks submit button")
	public void user_enters_and_and_clicks_submit_button(String string, String string2) {
		WebElement Signin= driver.findElement(By.linkText("SignIn"));
		Signin.click();
		WebElement Uname=driver.findElement(By.xpath("//div[contains(@class,'col-md-12')]/input[1]"));
		Uname.click();
		Uname.sendKeys(string);
		WebElement Password=driver.findElement(By.xpath("//div[contains(@class,'row')][2]/div[contains(@class,'col-md-12')]/input"));
		Password.click();
		Password.sendKeys(string2);		
		WebElement Login=driver.findElement(By.name("Login"));
		Login.click();
	}
	    
	

	@Then("User does Successful Login")
	public void user_does_Successful_Login() {
		WebElement SO=driver.findElement(By.linkText("SignOut"));	
		SO.click();
	}
	    


}
