package stepDefinitionsswab;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages1.Swablab_login;

public class Swablab_test {
	
	WebDriver driver;
	
   Swablab_login obj=new Swablab_login(driver);
	
   
	
	@Given("swablab page is open")
	public void swablab_page_is_open() {
		obj.setuptest();
	    
	}

	@When("enter username {string} and password {string}")
	public void enter_userid_and_password(String user, String pass) {
	    obj.enterUsername(user);
	    obj.enterPassword(pass);
	}


	@When("click on login button")
	public void click_on_login_button() {
	    obj.clickLogin();
	}

	@Then("display home page")
	public void display_home_page() {
	    
	}

	@Then("the product list page displays")
	public void the_product_list_page_displays() {
	   
	}

	@When("user select the product")
	public void user_select_the_product() {
	    
	}

	@When("clicks on add to cart button")
	public void clicks_on_add_to_cart_button() {
	    
	}

	@Then("cart button displays item added to cart")
	public void cart_button_displays_item_added_to_cart() {
	   
	}




}
