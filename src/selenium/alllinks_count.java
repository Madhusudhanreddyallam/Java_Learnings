package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alllinks_count {
	
	int abc = 0;
	@Test
	public void open_chrome() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://artoftesting.com/get-all-links-in-a-webpage-selenium-webdriver-java");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		WebElement element = driver.findElement(By.tagName("a"));
		List<WebElement> count = driver.findElements(By.tagName("a"));
		List<String> all_links = new ArrayList<String>();
		for (WebElement ele : count)
		{
			all_links.add(ele.getAttribute("href"));
		}
		
		for (String ele: all_links)
		{
			((JavascriptExecutor) driver).executeScript("window.open()");
			driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window("CDwindow-7571845BF2E7AF601BC0454F2A623249");
			driver.get(ele);
		}
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		js.executeScript("arguments[0].click", element);
		js.executeScript("alert ('welcome to automation');");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("abc");
		driver.switchTo().alert().getText();
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		action.sendKeys(Keys.CONTROL + "T").build().perform();
		action.doubleClick().build().perform();
		action.contextClick().build().perform();
	}


}
