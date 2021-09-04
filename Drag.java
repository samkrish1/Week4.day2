package Week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drag.html");
		WebElement source = driver.findElementById("draggable");
		
		Actions builder =new Actions(driver);
		Thread.sleep(3000);
		builder.dragAndDropBy(source, 150, 100).perform();
	}

}
