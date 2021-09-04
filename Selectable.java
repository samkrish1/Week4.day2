package Week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		WebElement source = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement target = driver.findElementByXPath("//li[text()='Item 7']");
		Actions builder =new Actions(driver);
		Thread.sleep(3000);
		builder.clickAndHold(source).moveToElement(target).release().perform();
		
	}

}
