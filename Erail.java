package Week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40 ,TimeUnit.SECONDS);
		WebElement from = driver.findElementByXPath("//input[@id='txtStationFrom']");
		from.clear();
		from.sendKeys("MS");
		from.sendKeys(Keys.ENTER);
		WebElement To = driver.findElementByXPath("//input[@id='txtStationTo']");
		To.clear();
		To.sendKeys("BCT");
		To.sendKeys(Keys.ENTER);
		
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		WebElement E1 = driver.findElement(By.id("chkSelectDateOnly"));
		List <WebElement> row =E1.findElements(By.tagName("tr"));
		System.out.println("Row " +row.size());
		
		
	}

}
