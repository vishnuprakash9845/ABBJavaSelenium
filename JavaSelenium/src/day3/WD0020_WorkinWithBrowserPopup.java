package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import lib.AUT_Lib;

public class WD0020_WorkinWithBrowserPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Chrome");
		if(driver!=null)
		{
			driver.navigate().to("https://www.w3schools.com/jsref/met_win_alert.asp");
			
			if(driver.getCurrentUrl().contains("https://www.w3schools.com/jsref/met_win_alert.asp"))
			{
				AUT_Lib.CloseAlert();
				
				System.out.println("Before clicking on Try It yourself link, driver object browser info");
				System.out.println("Title : "+ driver.getTitle());
				System.out.println("URL : "+driver.getCurrentUrl());
				System.out.println("Handle No : "+ driver.getWindowHandle());
				System.out.println("No of browser referenced : "+ driver.getWindowHandles().size());
				System.out.println("\n \n ");
				
				driver.findElement(By.linkText("Try it Yourself »")).click();
				
				AUT_Lib.CloseAlert();
				
				System.out.println("After clicking on Try It yourself link, driver object browser info");
				System.out.println("Title : "+ driver.getTitle());
				System.out.println("URL : "+driver.getCurrentUrl());
				System.out.println("Handle No : "+ driver.getWindowHandle());
				System.out.println("No of browser referenced : "+ driver.getWindowHandles().size());
				System.out.println("\n \n ");
				
				String sChildBrowser = driver.getWindowHandles().toArray()[1].toString();
				driver.switchTo().window(sChildBrowser);
				
				System.out.println("After Executing switch to window statement, driver object browser info");
				System.out.println("Title : "+ driver.getTitle());
				System.out.println("URL : "+driver.getCurrentUrl());
				System.out.println("Handle No : "+ driver.getWindowHandle());
				System.out.println("No of browser referenced : "+ driver.getWindowHandles().size());
				System.out.println("\n \n ");
				
				AUT_Lib.pauseSeconds(2);
				
				driver.switchTo().frame("iframeResult");
				
				AUT_Lib.CloseAlert(driver);
				
				driver.findElement(By.xpath("//button[.='Try it']")).click();
				AUT_Lib.pauseSeconds(2);
				
				System.out.println(driver.switchTo().alert().getText());
				//driver.switchTo().alert().accept();
				AUT_Lib.CloseAlert(driver);
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
