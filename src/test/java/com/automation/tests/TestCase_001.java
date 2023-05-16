package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.automation.pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_001 extends BasePage {

	
	WebDriver driver = new ChromeDriver();
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers_automation\\chromedriver.exe");
		
		driver.manage().window().maximize();
		
		
		
		
	}
	
	@Test
	public void method1() {
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[contains(text(),'boAt Rockerz 450 Bluetooth On Ear Headphones with Mic, Upto 15 Hours Playback, 40MM Drivers, Padded Ear Cushions, Integrated Controls and Dual Modes(Hazel Beige)')]")).click();
		BasePage basePage = new BasePage();
		basePage.baseMethod();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		
//		driver.quit();
		
		
	}

}
