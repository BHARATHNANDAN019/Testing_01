package testscript;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
	WebDriver driver;
	

@Given("user open chrome browser")
public void user_open_chrome_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Nandan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
   
}

@Given("navigates to newtours")
public void navigates_to_newtours() {
	driver.get("https://demo.guru99.com/test/newtours/");
   
}

@When("user enters valid username")
public void user_enters_valid_username() {
	driver.findElement(By.name("userName")).sendKeys("mercury");
    
}

@When("user enters valid password")
public void user_enters_valid_password() {
	driver.findElement(By.name("password")).sendKeys("mercury");
   
}

@When("user clicks on submit")
public void user_clicks_on_submit() {
	driver.findElement(By.name("submit")).click();
   
}

@Then("verify login success")
public void verify_login_success() {
	//Assert.assertTrue(driver.getTitle().contains("Login"));
	if(driver.getTitle().contains("Login")){
		System.out.println("Credentials are valid");
	}else{
		System.out.println("Credentials are invalid");
	}
   
}

@Then("close the browser")
public void close_the_browser() {
	driver.close();   
}


@Given("user clicks on Register link")
public void user_clicks_on_register_link() {
	 driver.findElement(By.linkText("REGISTER")).click();
}

@When("user enter the username")
public void user_enter_the_username() {
	driver.findElement(By.name("email")).sendKeys("charlie0004@gmail.com");
}

@When("user enter password")
public void user_enter_password() {
	driver.findElement(By.name("password")).sendKeys("Charlie0004");
   
}

@When("user enter confirm password")
public void user_enter_confirm_password() {
	driver.findElement(By.name("confirmPassword")).sendKeys("Charlie0004");
  
}

@When("user clicks on Register button")
public void user_clicks_on_register_button() {
	driver.findElement(By.name("submit")).click();
   
}

@Then("verify Registration is success")
public void verify_registration_is_success() {
	//String rgstr =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td")).getText();
	//Assert.assertEquals("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td", rgstr);
	Assert.assertTrue(driver.getTitle().contains("Register: Mercury Tours"));
	
	System.out.println("Registration is success");  
   
}


@Given("enter username as {string}")
public void enter_username_as(String un) {
	driver.findElement(By.name("userName")).sendKeys(un);
   
}

@Given("enter password as {string}")
public void enter_password_as(String psd) {
	driver.findElement(By.name("password")).sendKeys(psd);
}





}
