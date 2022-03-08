package com.mphasis.seleniumjenkinsdemo.seleniumjenkins;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private WebDriver driver;
    private String url;
    private String expectedTitle;
	
	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Mphasis\\jar files\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "http://www.google.com";
		expectedTitle = "Google";
		driver.navigate().to(url);
	}
	
    @Test
    public void shouldTitleMatch()
    { 	
		String actualtitle = driver.getTitle();
		assertEquals(actualtitle, expectedTitle);
    }
    @AfterMethod
	public  void closeBrowser()
	{
		// 4) close the browser
		driver.close();
	}
}
