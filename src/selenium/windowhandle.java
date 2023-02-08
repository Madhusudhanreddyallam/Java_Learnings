package selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {
	
	@Test
	public void getwindow ()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		String parentwin_id = driver.getWindowHandle();		
		Set<String> all_win_id = driver.getWindowHandles();		
		
		
		for (String Child : all_win_id)
		{
			if(!parentwin_id.equalsIgnoreCase(Child))
			{
				driver.switchTo().window(Child);
				System.out.println(driver.getTitle());
			}
			
		}
		
		
		
	}

}
