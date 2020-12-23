package Utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
public static void openBrowser(String browser,String url) throws IOException {
		
		if(browser=="chrome") {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "/Users/danny/Desktop/chromedriver");
			 driver = new ChromeDriver(options);
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
			 wait=new WebDriverWait(driver,5);
			 driver.get(url);
			 
			 
			 
			 
		}
	}

}
