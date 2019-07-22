package eg.eg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class package2 {
	public static WebDriver driver;
	public static WebDriverWait wait;
	@Given("I want to type the url")
	public void i_want_to_type_the_url() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\ARCHANA\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.40.4:8083/TestMeApp1/fetchcat.htm");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	}

	@Then("Click on Sign in")
	public void click_on_Sign_in() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.partialLinkText("SignIn")).click();
		
	}
		
	   	
		
		@Then("I enter the {string} and {string}")
		public void i_enter_the_and(String string, String string2) {
			driver.findElement(By.name("userName")).sendKeys(string);
			driver.findElement(By.name("password")).sendKeys(string2);
			
		}
		
		@Then("I click on Login")
		public void i_click_on_Login() {
			driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
			 driver.close();  
		
		}
			


}
