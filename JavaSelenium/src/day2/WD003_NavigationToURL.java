package day2;

import org.openqa.selenium.WebDriver;

import lib.AUT_Lib;

public class WD003_NavigationToURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver oWD = AUT_Lib.initAUTBrowser("Edge");
				oWD.get("https://www.bing.com");
				
				AUT_Lib.pauseSeconds(4);
				oWD.quit();
	}

}
