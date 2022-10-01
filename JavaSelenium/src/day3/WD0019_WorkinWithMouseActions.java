package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import lib.AUT_Lib;

public class WD0019_WorkinWithMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Chrome");
		if(driver!=null)
		{
			driver.navigate().to("https://jqueryui.com/droppable/");
			
			if(driver.getCurrentUrl().contains("https://jqueryui.com/droppable/"))
			{
				//Method-1
				//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
				
				//Method-2
				//driver.switchTo().frame(0);
				
				//Method-3
				//driver.switchTo().frame(name attribute of the frame);
				
				WebDriver oFrameDriver =driver.switchTo().frame(0);
				
				WebElement oSourceElement = driver.findElement(By.id("draggable"));				
				WebElement oTargetElement = driver.findElement(By.id("droppable"));
				
				Actions oMouse = new Actions(driver);
				oMouse.clickAndHold(oSourceElement).moveToElement(oTargetElement).release().build().perform();
				
				WebElement oSourceElement1 = driver.findElement(By.id("draggable"));				
				WebElement oTargetElement1 = driver.findElement(By.id("droppable"));
				
				Actions oMouse1 = new Actions(driver);
				oMouse1.clickAndHold(oSourceElement1).moveByOffset(100,100).release().build().perform();
				
				driver.switchTo().defaultContent();
				
				driver.findElement(By.linkText("Resizable")).click();
				
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
