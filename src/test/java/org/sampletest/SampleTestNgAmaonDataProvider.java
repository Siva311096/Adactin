package org.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestNgAmaonDataProvider {
	
	@DataProvider(name="sample")
	public Object[][] getData() {	
		return new Object[][] {
			{"iphone"},{"sony"},{"samsung"},{"nokia"},{"redmi"},{"oneplus"},{"infinix"},{"lenovo"},{"honor"},{"realme"},{"htc"},{"oppo"},{"poco"},{"micromax"},{"sony tv"}};
	}
	WebDriver driver;
	@BeforeMethod
	private void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@Test(dataProvider="sample")
	private void tc01(String search) {
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys(search,Keys.ENTER);	
	}
}
