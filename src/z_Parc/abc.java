package z_Parc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class A {
	
	static int x;
	void increment()
	{
		x++;
	}
	
}
  public  class abc
    {
    	
    	
    	public static void main(String[] args)
 	   {
    		A obj1 = new A();
    		A obj2 = new A();
    		obj1.x = 0;
    		obj1.increment();
    		obj2.increment();
    		System.out.println(obj1.x +" "+ obj2.x);
 	   }
    }
    
   
    	
    