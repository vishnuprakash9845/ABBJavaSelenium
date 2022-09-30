package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD0014_LocatingCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Chrome");
		if(driver!=null)
		{
			driver.navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
			
			if(driver.getTitle().contains("Easy"))
			{
				
				AUT_Lib.SetCheckboxOn(By.xpath("(//input[@type='checkbox'])[1]"));
				AUT_Lib.SetCheckboxOn(By.xpath("(//input[@type='checkbox'])[2]"));
				AUT_Lib.SetCheckboxOn(By.xpath("(//input[@type='checkbox'])[3]"));
				AUT_Lib.SetCheckboxOn(By.xpath("(//input[@type='checkbox'])[4]"));
				AUT_Lib.pauseSeconds(2);
				AUT_Lib.SetCheckboxOn(By.xpath("(//input[@type='checkbox'])[1]"));
				AUT_Lib.SetCheckboxOn(By.xpath("(//input[@type='checkbox'])[2]"));
				AUT_Lib.SetCheckboxOn(By.xpath("(//input[@type='checkbox'])[3]"));
				AUT_Lib.SetCheckboxOn(By.xpath("(//input[@type='checkbox'])[4]"));
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
