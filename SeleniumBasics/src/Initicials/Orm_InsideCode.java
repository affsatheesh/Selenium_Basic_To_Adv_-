package Initicials;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orm_InsideCode {
  @FindBy(name = "txtUsername")
  public static WebElement username;
  
  @FindBy(name = "txtPassword")
  public static WebElement password;
  
  @FindBy(name = "Submit")
  public static WebElement login;
}


