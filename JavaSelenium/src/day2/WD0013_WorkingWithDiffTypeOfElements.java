package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD0013_WorkingWithDiffTypeOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Chrome");
		if(driver!=null)
		{
			driver.navigate().to("https://www.bing.com");
			
			if(driver.getTitle().matches("Bing"))
			{
				System.out.println("X,Y: "+ driver.findElement(By.id("bLogo")).getLocation().getX()+ ","+driver.findElement(By.id("bLogo")).getLocation().getY());
				
				System.out.println("Height,Width: "+ driver.findElement(By.id("bLogo")).getRect().getHeight()+ ","+driver.findElement(By.id("bLogo")).getRect().getWidth());
				
				System.out.println("Href Values of Image Links: "+ driver.findElement(By.linkText("Images")).getAttribute("href"));
				
				driver.findElement(By.id("sb_form_q")).sendKeys("ABB India");
				AUT_Lib.pauseSeconds(1);
				driver.findElement(By.id("sb_form_q")).clear();
				driver.findElement(By.id("sb_form_q")).sendKeys("ABB China");
				AUT_Lib.pauseSeconds(2);
				driver.findElement(By.cssSelector("input[id*='form_go']")).submit();
				AUT_Lib.pauseSeconds(2);
				System.out.println("Search Count : "+driver.findElement(By.cssSelector("span.sb_count")).getText());
			
				System.out.println("Search Count : "+driver.findElements(By.xpath("//a")).size());
			
			    int iLinks = driver.findElements(By.xpath("//a")).size();
			    
			    for(int i=0; i<= iLinks; i++)
			    {
			    	System.out.println(i +"]"+ driver.findElements(By.xpath("//a")).get(i).getText());;
			    }
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
