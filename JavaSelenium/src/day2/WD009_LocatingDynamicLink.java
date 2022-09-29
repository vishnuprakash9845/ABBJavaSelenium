package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD009_LocatingDynamicLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Edge");
		if(driver!=null)
		{
			driver.navigate().to("https://www.amazon.in/ref=nav_logo");
			
			if(driver.getTitle().contains("Online"))
			{
				System.out.println("Navigated to the AUT Website");
				
				driver.findElement(By.linkText("Electronics")).click();
				AUT_Lib.pauseSeconds(2);
				driver.navigate().back();
				AUT_Lib.pauseSeconds(2);
				driver.findElement(By.linkText("Books")).click();
				AUT_Lib.pauseSeconds(2);
				
			}
			else
			{
				System.err.println("Navigated to invalid website");
			}
			
			driver.quit();
		}
		else
		{
			System.err.println("Webdriver Initialization failed and execution stopped.");
		}
				
		AUT_Lib.pauseSeconds(4);
		driver.quit();
	}

}
