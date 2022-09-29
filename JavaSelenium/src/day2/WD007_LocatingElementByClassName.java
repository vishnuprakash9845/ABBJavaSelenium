package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD007_LocatingElementByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Edge");
		if(driver!=null)
		{
			driver.navigate().to("https://www.bing.com");
			
			if(driver.getTitle().matches("Bing"))
			{
				System.out.println("Navigated to the AUT Website");
				
				driver.findElement(By.className("sb_form_q")).sendKeys("ABB China");
				driver.findElement(By.name("search")).submit();
				AUT_Lib.pauseSeconds(4);
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
