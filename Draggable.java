package Week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElementByXPath("//div[@id='draggable']");
		Actions builder =new Actions(driver);
		Thread.sleep(3000);
		builder.dragAndDropBy(source, 100, 100).perform();
	}

}
