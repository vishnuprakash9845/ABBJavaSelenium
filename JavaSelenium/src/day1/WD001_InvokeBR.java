package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD001_InvokeBR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Opening Chrome Browser
				String sDriverPath = "C:\\Users\\invim19\\Downloads\\Java-Selenium\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", sDriverPath);
				WebDriver obr = new ChromeDriver();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Close the Browser
				obr.close(); //chromedriver.exe still runs use quit() to close completely
	}

}
