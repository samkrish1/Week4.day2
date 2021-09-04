package Week4.day2;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement target = driver.findElementByXPath("//li[text()='Item 7']");
		Point location = target.getLocation();
	int x = location.getX();
	int y = location.getY();
		Actions builder =new Actions(driver);
		Thread.sleep(3000);
		builder.clickAndHold().dragAndDropBy(source, x, y).perform();
	
	}

}
