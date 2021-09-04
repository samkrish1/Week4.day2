package Week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		WebElement source = driver.findElementByXPath("//a[text() ='TestLeaf Courses']");
		Actions builder =new Actions(driver);
		builder.moveToElement(source).perform();
		driver.findElementByXPath("//a[text()='RPA']").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
