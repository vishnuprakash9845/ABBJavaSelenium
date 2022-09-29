package day1;

import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD002_CrossBrowserScripting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver oWD = AUT_Lib.initAUTBrowser("Edge");
		AUT_Lib.pauseSeconds(4);
		oWD.quit();

	}

}
