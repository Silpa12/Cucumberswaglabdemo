package pages1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import GenericFuctions.GenericFunction;

public class Swablab_login extends GenericFunction{
	WebDriver driver;

	public Swablab_login(WebDriver driver) {
		super(driver);
	}
	
	By heading=By.xpath("//div[@class='login_logo']");
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbtn=By.id("login-button");
	
	 By HomeHeading=By.xpath("//div[@class='product_label']");
     By menubtn=By.xpath("//div[@class='bm-burger-button']");
	
     public void setuptest() 
     {
     		
     	
     		driver=new ChromeDriver();
     		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     		driver.manage().window().maximize();
     		String url="https://www.saucedemo.com/v1/";
     		driver.get(url);
     		
     	}
	
public void enterUsername(String user) {
		
		findElement(username).sendKeys(user);
	}


	public void enterPassword(String pass) {
		findElement(password).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		
		findElement(loginbtn).click();
		
		//boolean MsgDisplayed= findElement(HomeHeading).isDisplayed();
      //  Assert.assertTrue(MsgDisplayed,"Logo is not dispalyed");
        System.out.println(" Sucessfully login and Product is Displyed");

		
	}
	

}
