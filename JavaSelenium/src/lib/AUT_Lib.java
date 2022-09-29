package lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AUT_Lib {
	public static WebDriver oDriver = null;
	public static WebDriver initAUTBrowser (String sbrType) {
		if (sbrType.isEmpty()) {
			System.err.println("Broswer Type is Blank");
			//return oDriver;
		}
		else {
			String sDriverPath;
			switch (sbrType) {
			case "IE":
				sDriverPath = "C:\\Users\\invim19\\Downloads\\Java-Selenium\\IEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", sDriverPath);
				oDriver = new InternetExplorerDriver();
				break;

			case "Chrome":
				sDriverPath = "C:\\Users\\invim19\\Downloads\\Java-Selenium\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", sDriverPath);
				oDriver = new ChromeDriver();
				break;
				
			case "Edge":
				sDriverPath = "C:\\Users\\invim19\\Downloads\\Java-Selenium\\msedgedriver.exe";
				System.setProperty("webdriver.edge.driver", sDriverPath);
				oDriver = new EdgeDriver();
				break;
				
			default:
				sDriverPath = "C:\\Users\\invim19\\Downloads\\Java-Selenium\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", sDriverPath);
				oDriver = new ChromeDriver();
			}
			oDriver.manage().deleteAllCookies();
			oDriver.manage().window().maximize();
			oDriver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			oDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//return oDriver;
		}
		return oDriver;
	}
	public static void pauseSeconds(int isec) {
		try {
			Thread.sleep(1000 * isec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
