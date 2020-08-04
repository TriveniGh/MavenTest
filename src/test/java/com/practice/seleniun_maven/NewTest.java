package com.practice.seleniun_maven;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		
		
		//fetch all values from dropdown
		Select dd = new Select(driver.findElement(By.name("country")));
		 ArrayList<String> list = new ArrayList<String>();
		 
		List<WebElement> options = dd.getOptions();
		System.out.println(options);
		for(WebElement ele : options)
		{
			System.out.println(ele.getText());
		}
		String[] expvalues = {"ALBANIA"};
		int j = 0;
		for(WebElement ele : options)
		{	
			String value = ele.getText();
			list.add(value);
			
		}
		System.out.println("list1"+list);
		
		driver.quit();
  }
}
