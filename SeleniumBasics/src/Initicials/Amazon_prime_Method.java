package Initicials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

@Test
public class Amazon_prime_Method {
  @FindBy(name = "email")
  public static WebElement Username;
  
  @FindBy(name = "password")
  public static WebElement password;
  
  @FindBy(id = "signInSubmit")
  public static WebElement login;
}

