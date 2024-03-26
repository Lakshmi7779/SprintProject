package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationLogin {
	WebDriver driver;
	String ExpectedURL = "https://www.99acres.com/";
	
	@After
	public void t2() {
		driver.quit();
	}

	@Given("I am on login page")
	public void i_am_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.99acres.com/");
        String url=driver.getCurrentUrl();
		//System.out.println(url);
		Assert.assertEquals(url,ExpectedURL);
		//for icon path
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[5]")).click();
		Thread.sleep(2000);
		//login/register path
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[5]/div/div")).click();
		Thread.sleep(2000);
		//login with email credentials
		driver.findElement(By.xpath("//span[text()='Continue with Email/Username']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[8]/div[2]/div[1]/div/div[6]/div/input")).sendKeys("dolalakshmi.m7779@gmail.com");
		//for continue path
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div[7]/button/span")).click();
		
		

	}

	@When("I enter mobile number")
	public void i_enter_mobile_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[5]/div/div")).click();
		//driver.findElement(By.xpath("//span[text()='Continue with Email/Username']")).click();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[8]/div[2]/div[1]/div/div[5]/div/div/input")).sendKeys("9989456998");
		//Thread.sleep(2000);
		
		
	   
	}

	@When("click on continue")
	public void click_on_continue() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div[2]/div[1]/div/div[6]")).click();
		Thread.sleep(1000);
	}

	
}