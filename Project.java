package Week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40 ,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement menu = driver.findElementByXPath("//a[text()='Men'][1]");
    	action.moveToElement(menu).perform();
    	Thread.sleep(3000);
    	driver.findElementByXPath("(//a[text()='Jackets'])[1]").click();
    	String text = driver.findElementByXPath("//span[@class='title-count']").getText();
    	System.out.println("Count of the items" + text);
    	String R1 = text.replaceAll("[^0-9]", "");
    	int parseInt3 = Integer.parseInt(R1);
    	String text1 = driver.findElementByXPath("//span[@class='categories-num']").getText();
    	System.out.println(text1);
    	String R2 = text1.replaceAll("[^0-9]", "");
    	int parseInt = Integer.parseInt(R2);
    	String text2 = driver.findElementByXPath("(//span[@class='categories-num'])[2]").getText();
    	System.out.println(text2);
    	String R3 = text2.replaceAll("[^0-9]", "");
    	int parseInt2 = Integer.parseInt(R3);
    	int sum =parseInt+parseInt2;
    	
    	if (parseInt3 ==sum )
    	{
    		System.out.println("Count matches");
    	}
    	else
    	{
    		System.out.println("Count doent match");
    	}
    	
    	//6.Check jackets
    	
    	driver.findElementByXPath("//div[@class='common-checkboxIndicator']").click();
    	
    	//7) Click + More option under BRAND
    	driver.findElementByXPath("//div[@class='brand-more']").click();
    	//8.Type Duke and click checkbox
    	driver.findElementByXPath("//input[@placeholder='Search brand']").sendKeys("Duke");
    	driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[1]").click();
    	//9) Close the pop-up x
    	
    	driver.findElement(By.xpath("//ul[@class='FilterDirectory-indices']/following::span")).click(); // error at this level .. cant find web element
    	//10) Confirm all the Coats are of brand Duke
    	List<WebElement>Tag = driver.findElements(By.tagName("h3"));
    	for(int i=0; i<Tag.size(); i++)
    	{
    	String T1 = Tag.get(i).getText();
    	
    	if(T1.equals("Duke"))
    			{
    		System.out.println("Coats are all of Duke brand");
    			}
    	else
    	{
    		System.out.println("Coats are not of the Duke brand");
    	}
    	}
    	
    	//11.Sort by Better Discount
    	WebElement sort = driver.findElement(By.xpath("//span[text()='Recommended']"));
    	action.moveToElement(sort).perform();
    	driver.findElement(By.xpath("//label[@class='sort-label sort-selected']")).click();
    	//12) Find the price of first displayed item
    	
    	WebElement firstdisplay = driver.findElement(By.xpath("//span[@class='product-discountedPrice']"));
    	System.out.println("Price of the first item "   + firstdisplay.getText());
    	firstdisplay.click();
    	//13) Take a screen shot
    	
    	File Scr = driver.getScreenshotAs(OutputType.FILE);
    	File Dest = new File("./snaps/seat.png");
    	FileUtils.copyFile(Scr, Dest);
    	
    	//14) Click on WishList Now
    	
	}

	}

