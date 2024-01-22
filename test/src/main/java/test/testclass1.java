package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass1 {
	
	@Test(priority=0, description="This is tc1")
	public void  method1()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-edge-driver/4.9.1");
		System.out.print("This is priority 0 method");
	}
	@Test(priority=1, description="This is tc2")
	public void  method2()
	{
		
		System.out.print("This is priority 1 method");
	}

}
