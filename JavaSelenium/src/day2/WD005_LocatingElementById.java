package day2;

import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD005_LocatingElementById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Edge");
		if(driver!=null)
		{
			driver.navigate().to("https://www.bing.com");
			
			if(driver.getTitle().matches("Bing"))
			{
				System.out.println("Navigated to AUT Website");
				System.out.println("URL:"+driver.getCurrentUrl());
				System.out.println("Title:"+driver.getTitle());
				System.out.println("PageSource:"+driver.getPageSource());
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
