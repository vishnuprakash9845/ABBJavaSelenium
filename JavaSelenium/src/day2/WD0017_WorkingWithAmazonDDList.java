package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import lib.AUT_Lib;

public class WD0017_WorkingWithAmazonDDList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Edge");
		if(driver!=null)
		{
			driver.navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
			
			if(driver.getTitle().contains("Easy"))
			{
				Select oList1 = new Select(driver.findElement(By.id("select-demo")));
				
				System.out.println("Is Multi Value Selection dropdown : "+ oList1.isMultiple());
				System.out.println("Total no of options available in DD List :"+ oList1.getOptions().size());
				System.out.println("Defualt selected option : "+ oList1.getFirstSelectedOption().getText());
					
				oList1.selectByIndex(5);
				AUT_Lib.pauseSeconds(2);
				oList1.selectByValue("Saturday");
				AUT_Lib.pauseSeconds(2);
				oList1.selectByVisibleText("Friday");
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
