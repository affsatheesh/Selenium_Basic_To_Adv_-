package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authonicatiion_Popup {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	//URL = the-internet.herokuapp.com/basic_auth
	// admin:admin
//	    ||     ||
// (username)(password)

	}

}
