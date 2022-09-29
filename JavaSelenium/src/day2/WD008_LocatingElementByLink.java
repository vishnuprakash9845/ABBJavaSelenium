package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD008_LocatingElementByLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Edge");
		if(driver!=null)
		{
			driver.navigate().to("https://www.bing.com");
			
			if(driver.getTitle().matches("Bing"))
			{
				System.out.println("Navigated to the AUT Website");
				
				driver.findElement(By.linkText("Images")).click();
				AUT_Lib.pauseSeconds(2);
				driver.navigate().back();
				AUT_Lib.pauseSeconds(1);
				driver.findElement(By.linkText("Videos")).click();
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
