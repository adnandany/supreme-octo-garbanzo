package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;
import cucumber.api.java.en.Then;

public class AccountTaskdropDown extends BaseClass {
	@Then("I should see the type dropdown")
	public void i_should_see_the_type_dropdown() {
		driver.findElement(By.id("acc6")).isDisplayed();
	   
	}

	@Then("I verify all the drop down feilds presented  in the type drop down")
	public void i_verify_all_the_drop_down_feilds_presented_in_the_type_drop_down() {
		String expectedType[]= {"--None--","Prospect","Customer - Direct","Customer - Channel","Channel Partner / Reseller",
				"Installation Partner","Technology Partner","Other"};
		
		WebElement type =driver.findElement(By.id("acc6"));
		Select typeSel = new  Select(type);
		List<WebElement> TypeOptions = typeSel.getOptions();
		for(int i=0;i<TypeOptions.size();i++) {
			Assert.assertArrayEquals(expectedType[i], TypeOptions.get(i).getText());
			
			
		}
	    
	}

}
