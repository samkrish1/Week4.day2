package Week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable_2 {

	public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable");
		driver.switchTo().frame(0);
		WebElement S = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement T = driver.findElementByXPath("//li[text()='Item 5']");
		Actions builder = new Actions(driver);
		builder.clickAndHold(S).moveToElement(T).release().perform();
		
		
	}

}
