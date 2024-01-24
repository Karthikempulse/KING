package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tc1_LoginStep {
	static WebDriver driver;

	@Given("user is on the eMsales page")
	public void user_is_on_the_e_msales_page() {
	   
		 driver=new ChromeDriver();
		driver.get("http://192.168.5.147/#/main-page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	@When("user login {string},{string}")
	public void user_login(String username, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	   WebElement login = driver.findElement(By.xpath("//h6[text()=' LogIn ']"));
	   login.click();
		WebElement usrmail = driver.findElement(By.id("Mail"));
		usrmail.sendKeys(username);
		WebElement usrpwd = driver.findElement(By.id("Password"));
		usrpwd.sendKeys(password);
		WebElement login1 = driver.findElement(By.xpath("//button[text()='Login']"));
		login1.click();
	}
	@Then("user should verify sucess message after login {string}")
	public void user_should_verify_sucess_message_after_login(String string) throws InterruptedException {
		Thread.sleep(8000);
	   WebElement element = driver.findElement(By.xpath("(//span[text()='Welcome'])[1]"));
	  String text= element.getText();
	  System.out.println(text);
	  boolean b=text.contains("Welcome");
	  Thread.sleep(3000);
	  Assert.assertEquals("Welcome", b, true); 
	   
	 
		
	}

	
	@When("user login {string},{string} with Enter Key")
	public void user_login_with_enter_key(String username, String password) throws InterruptedException {
	   
		
	       Thread.sleep(3000);
		   WebElement login = driver.findElement(By.xpath("//h6[text()=' LogIn ']"));
		   login.click();
			WebElement usrmail = driver.findElement(By.id("Mail"));
			usrmail.sendKeys(username);
			WebElement usrpwd = driver.findElement(By.id("Password"));
			usrpwd.sendKeys(password,Keys.ENTER);
			
	}

	

	@Then("user should verify the error message after login {string}")
	public void user_should_verify_the_error_message_after_login(String string) throws InterruptedException {
	   
		WebElement findElement = driver.findElement(By.xpath("//small[text()=' Password is required. ']"));
		String text = findElement.getText();
		System.out.println(text);
		  boolean b=text.contains("Password is required.");
		  Thread.sleep(3000);
		  Assert.assertEquals("Password is required.", b, true); 
		   
		      
	}






}
