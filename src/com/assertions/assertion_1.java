package com.assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assertion_1 {

		WebDriver driver;
		@BeforeTest
		public void setup(){
			System.setProperty("webdriver.chrome.driver", "./Chrome_driver_jars/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		@Test
		public void example() throws Exception{
			driver.navigate().to("https://www.easemytrip.com/");
			String String1 = "MyAccount";
			String String2 = "My Booking";
			
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Login or Signup']"))).build().perform();
			
			String Result1 =driver.findElement(By.xpath("//*[@id=\"divSignInPnl\"]/div/a[4]/span[2]/span[1]")).getText();
			Assert.assertEquals(Result1, String2);
			Assert.assertNotEquals(Result1, String1);
			Assert.assertTrue(Result1==String2);
			Assert.assertFalse(Result1==String1);
			Assert.assertNotNull(Result1);	
			driver.close();

	}
		}

