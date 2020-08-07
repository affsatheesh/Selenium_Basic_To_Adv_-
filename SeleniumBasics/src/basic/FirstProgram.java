package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.Select;

public class FirstProgram
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skoolgo.pixelmindit.com:5000/#/add-member");
		
		
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("admin@pixel.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sk12345");
		
		WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		Thread.sleep(15000);
		
		WebElement member= driver.findElement(By.xpath("//p[text()='Members']"));
		WebElement addmember= driver.findElement(By.xpath("//a[text()='Add Members']"));
		Actions action = new Actions(driver);
		action.moveToElement(member).build().perform();
		action.doubleClick(addmember).build().perform();
		
		Thread.sleep(8000);

	
/*
		WebElement DOB= driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']"));
		DOB.click();
		
		Thread.sleep(5000);
		
	
		WebElement year= driver.findElement(By.xpath("//h6[text()='2020']"));
		year.click();
		
		Thread.sleep(10000);
		
		WebElement myyear= driver.findElement(By.xpath("//div[text()='1996']"));
		action.moveToElement(myyear).build().perform();
		action.doubleClick().build().perform();
		
		
		Thread.sleep(8000);
		WebElement nationality= driver.findElement(By.id("nationality"));

		Select select = new Select(nationality);

		List<WebElement> options= select.getOptions();
		int fullList=options.size();
		System.out.println(fullList);

		for (WebElement webElement : options)
		{
			String text = webElement.getText();
			select.selectByVisibleText("India");
		}

	//	Gender selecting
		Thread.sleep(5000);
		WebElement gender= driver.findElement(By.id("gender"));

		Select selectgender= new Select(gender);

		List<WebElement> options1= selectgender.getOptions();
		int fullList1=options1.size();
		System.out.println(fullList1);

		for (WebElement webElement : options1)
		{
			String text1 = webElement.getText();
			selectgender.selectByVisibleText("Male");
		}


		// Branch selecting
		Thread.sleep(5000);
		WebElement branch= driver.findElement(By.id("branch"));

		Select selectbranch1= new Select (branch);

		List<WebElement> options2= selectbranch1.getOptions();
		int fullList2=options2.size();
		System.out.println(fullList2);

		for (WebElement webElement : options2)
		{
			String text2 = webElement.getText();
			selectbranch1.selectByVisibleText("Manama");
		}
		
		//Height
		Thread.sleep(5000);
		WebElement height= driver.findElement(By.id("height"));
		height.clear();
		Thread.sleep(5000);
		height.sendKeys("6.2");
		
		//weight
		Thread.sleep(5000);
		WebElement weight= driver.findElement(By.id("weight"));
		weight.clear();
		Thread.sleep(5000);
		weight.sendKeys("55");
		
		// Emergency No (optional)
		
		Thread.sleep(5000);
		WebElement phonenumberop= driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/form/div/div[2]/div/div[12]/div/div[1]/div/input"));
		phonenumberop.sendKeys("+916379709559");
	
		// Relationship
		
		Thread.sleep(5000);
		WebElement relationship= driver.findElement(By.id("relationship"));
		relationship.sendKeys("Brother");
		
		// Notes
		Thread.sleep(5000);
		WebElement notes= driver.findElement(By.id("Notes"));
		notes.sendKeys("Hi this is sathez");
		*/
		// User Photo upload
		Thread.sleep(5000);


	
 WebElement	uploading=	driver.findElement(By.xpath("//span[text()='Browse']"));
		action.moveToElement(uploading).click().build().perform();
		
		  String imagefiles= "C:\\Users\\~ SATHEZ ~\\s.jpg";
		
	    StringSelection imageselection = new StringSelection(imagefiles);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imageselection, null);
	    Thread.sleep(8000);
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    
	    Thread.sleep(8000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    //Trainer
	    Thread.sleep(8000);
	   	WebElement Trainer= driver.findElement(By.className("css-1hwfws3"));

		Select selectTrainer= new Select (Trainer);

		List<WebElement> options3= selectTrainer.getOptions();
		int fullList3=options3.size();
		System.out.println(fullList3);

		for (WebElement webElement : options3)
		{
			String text3 = webElement.getText();
			selectTrainer.selectByIndex(0);
		}
	    
		// What is your Level?
		 Thread.sleep(8000);
		WebElement position= driver.findElement(By.id("levelQuestion"));

		Select selectposition= new Select (position);

		List<WebElement> options4= selectposition.getOptions();
		int fullList4=options4.size();
		System.out.println(fullList4);

		for (WebElement webElement : options4)
		{
			String text4 = webElement.getText();
			selectposition.selectByVisibleText("Beginner");
		}
		
		// What is your Goal?
		 Thread.sleep(8000);
		WebElement goal= driver.findElement(By.id("goalQuestion"));

		Select selectgoal= new Select (goal);

		List<WebElement> options5= selectgoal.getOptions();
		int fullList5=options5.size();
		System.out.println(fullList5);

		for (WebElement webElement : options5)
		{
			String text5 = webElement.getText();
			selectgoal.selectByVisibleText("Loss Weight");
		}
		
		// How many days you plan to exercising per a week?
		 Thread.sleep(8000);
		WebElement week= driver.findElement(By.id("exercisingQuestion"));

		Select selectweek= new Select (week);

		List<WebElement> options6= selectweek.getOptions();
		int fullList6=options6.size();
		System.out.println(fullList5);

		for (WebElement webElement : options6)
		{
			String text6 = webElement.getText();
			selectweek.selectByVisibleText("4 Days a week");
		}
		
	}
	}
