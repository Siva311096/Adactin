package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("siva avis");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("hiii");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
