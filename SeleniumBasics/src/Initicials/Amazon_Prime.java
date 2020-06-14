package Initicials;  
import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.chrome.ChromeDriver;
     import org.openqa.selenium.support.PageFactory;
     import org.testng.annotations.AfterSuite;
     import org.testng.annotations.BeforeSuite;
     import org.testng.annotations.Test;
     
     @Test
     public class Amazon_Prime {
       public static WebElement email;
       
       public static WebElement password;
       
       public static WebElement signInSubmit;
       
       WebDriver driver;
       
       @BeforeSuite
       public void Primelogin() {
       System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver.exe");
       this.driver = (WebDriver)new ChromeDriver();
       this.driver.get("https://www.amazon.com/ap/signin?accountStatusPolicy=P1&clientContext=261-4493794-7304343&language=en_US&openid.assoc_handle=amzn_prime_video_desktop_us&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_encoding%3DUTF8%26location%3D%252Fref%253Ddv_auth_ret");
       }
       
       @AfterSuite
       public void pagefactory() {
      PageFactory.initElements(this.driver, Amazon_Prime.class);
      email.sendKeys(new CharSequence[] { "sathezsk02@gamil.com" });
      password.sendKeys(new CharSequence[] { "Worldend" });
      signInSubmit.click();
       this.driver.close();
       }
     }
