package Master.Cart;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zipy_elements.*;

public class Cart_addProduct_withLoggedUser extends Cart_MAIN {
	
			
	//Test - adding a product while unlogged, and then logging in and checking for the product in the cart
	@Test		
	public  void Tests_cart_addProduct_logginAfterAdding() throws Exception {
		System.out.println("Running test for adding product to the cart while the user unlogged, and then logging in");		
		

		//get to the required product page
		driver.get(ElementsBuying.Product_noVariations);
	
		//make sure there is no 400 error
		Functions.validate_error404(driver);

		//save its name
		String ProductTitle = act.elementAttText(ElementsBuying.Product_titleFromPicture, "alt", driver);

		//add to the cart
		Functions.addToCart(driver);

		//back to main page and connect to the user
		driver.get(ElementsWebsites.Zipy_il);
		Functions.logIn(driver);
				
		WebElement cartFrame = Functions.openCart(driver);

		// if we managed to add the product, its title is found in the cart:
		Assert.assertTrue(cartFrame.getText().contains(ProductTitle));
		
		//empty the cart and disconnect from the user for the next tests
		Functions.openAndEmptyCart(driver);
		Functions.unLogIn(driver);				
		}
	
	
	//Test - adding a product for logged user, then disconnecting and logging in back, and checking for the product in the cart
	@Test		
	public  void Tests_cart_addProduct_disconnectAndLogInBack() throws Exception {
		System.out.println("Running test for adding product to the cart for logged user,then disconnecting and logging in back");		
		
		//connect to the user
		driver.get(ElementsWebsites.Zipy_il);
		Functions.logIn(driver);
		
		//get to the required product page
		driver.get(ElementsBuying.Product_noVariations);

		//make sure there is no 400 error
		Functions.validate_error404(driver);

		//save its name
		String ProductTitle = act.elementAttText(ElementsBuying.Product_titleFromPicture, "alt", driver);
		
		//add to the cart /
		Functions.addToCart(driver);
		
		//disconnect from the user and then connect back 
		Functions.unLogIn(driver);
		Thread.sleep(1000);

		driver.get(ElementsWebsites.Zipy_il);
		Functions.logIn(driver);
				
		WebElement cartFrame = Functions.openCart(driver);

		// if we managed to add the product, its title is found in the cart:
		Assert.assertTrue(cartFrame.getText().contains(ProductTitle));
		
		//empty the cart and unlogging at the end for the next tests
		Functions.openAndEmptyCart(driver);
		Functions.unLogIn(driver);
		}
	
	
	
}
