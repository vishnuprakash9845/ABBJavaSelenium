package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD0015_WorkingWithRadioButtonGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Chrome");
		if(driver!=null)
		{
			driver.navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
			
			if(driver.getTitle().contains("Easy"))
			{
				AUT_Lib.SelectRadioButton(By.xpath("(//input[@name='ageGroup'])[1]"));
				AUT_Lib.SelectRadioButton(By.xpath("(//input[@name='ageGroup'])[2]"));
				AUT_Lib.SelectRadioButton(By.xpath("(//input[@name='ageGroup'])[3]"));
				AUT_Lib.pauseSeconds(2);
				AUT_Lib.SelectRadioButton(By.xpath("(//input[@name='ageGroup'])[3]"));
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
