package org.bilaal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDataProviderAmazon {
	WebDriver driver;
	@DataProvider(name="amazon")
	public Object[][] getData() {
		return new Object[][] {
			{"mobile"},{"iphone"},{"harddisk"},{"ipad"},{"poco m2"},{"laptop"},{"earpods"},{"books"},{"parker pen"},{"samsung headset"},{"hp laptop"},{"pradetor"},{"helmet"},{"charger"},{"adaptor"}
			
		};
	}
	@BeforeMethod
	private void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	@Test(dataProvider="amazon")
	private void tc01(String a) {
		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys(a ,Keys.ENTER);
	}
	
	
	
	
	
	
	
	
	
	
}
