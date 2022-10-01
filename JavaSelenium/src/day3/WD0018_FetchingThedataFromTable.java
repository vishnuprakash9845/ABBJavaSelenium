package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD0018_FetchingThedataFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = AUT_Lib.initAUTBrowser("Chrome");
		if(driver!=null)
		{
			driver.navigate().to("https://demo.seleniumeasy.com/table-search-filter-demo.html");
			
			if(driver.getCurrentUrl().contains("https://demo.seleniumeasy.com/table-search-filter-demo.html"))
			{

				int iRow, itotalRows, iCell, iTotalCell;
				String sTableXpath, sVal;
				sTableXpath = "//table[@id='task-table']";
				
				System.out.println("Before");
				AUT_Lib.PauseTillElementVisible(By.xpath(sTableXpath), 10);
				System.out.println("After");
				
				//Get us no of total row
				itotalRows = driver.findElements(By.xpath("//table[@id='task-table']//tr")).size();
				
				System.out.println(itotalRows);
				
				sVal="";
				for(iRow=0;iRow<=itotalRows;iRow++)  // Iterate the no of rows
				{
					if(iRow==0)
					{
						// Printing the Header Columns values
						iTotalCell= driver.findElements(By.xpath(sTableXpath+"/thead/tr/th")).size();
						
						for(iCell=1;iCell<=iTotalCell;iCell++)
						{
							sVal= sVal + "\t" + driver.findElement(By.xpath(sTableXpath+"/thead/tr/th["+iCell+"]")).getText();
						}
					}
					else
					{
						// Printing the Data Row values
						iTotalCell= driver.findElements(By.xpath(sTableXpath+"/tbody/tr["+iRow+"]/td")).size();
						
						for(iCell=1;iCell<=iTotalCell;iCell++)
						{
							sVal= sVal + "\t" + driver.findElement(By.xpath(sTableXpath+"/tbody/tr["+iRow+"]/td["+iCell+"]")).getText();
						}
					}
					sVal = sVal + "\n";  // Append values in next line
				}
				
				System.out.println(sVal);
				
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
