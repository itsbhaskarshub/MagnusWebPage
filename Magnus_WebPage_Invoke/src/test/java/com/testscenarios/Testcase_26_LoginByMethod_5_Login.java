package com.testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testcase_26_LoginByMethod_5_Login {

	public static String path = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String url  = "https://magnus.jalatechnologies.com/";
	public static WebDriver driver;
	/*
	public static String emailid  = "training@jalaacademy.com";
	public static String password = "jobprogram";
	*/
	
	
	
	@Test(priority = 0)
	@SuppressWarnings("deprecation")
	public void LoginMethod_1_Submit() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", path);
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			driver.findElement(By.id("btnLogin")).click();
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Submit Button Not Found");
		}
		Thread.sleep(5000);	
		 
		String ExpectedResult = driver.getTitle();
		System.out.println(ExpectedResult);
		if(ExpectedResult.equalsIgnoreCase("Magnus")){
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.close();	
	}
	
	
	@Test(priority = 1)
	@SuppressWarnings("deprecation")
	public void LoginMethod_1_VaildLogin() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", path);
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		try {
			driver.findElement(By.id("btnLogin")).click();
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Submit Button Not Found");
		}
		Thread.sleep(5000);	
		 
		String ExpectedResult = driver.getTitle();
		System.out.println(ExpectedResult);
		if(ExpectedResult.equalsIgnoreCase("Magnus")){
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.close();
	}
	
	@Test(priority = 2)
	@SuppressWarnings("deprecation")
	public void LoginMethod_1_InvaildEmailIdLogin() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", path);
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys("xxxxxxxxx@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		try {
			driver.findElement(By.id("btnLogin")).click();
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Submit Button Not Found");
		}
		Thread.sleep(5000);	
		 
		String ExpectedResult = driver.getTitle();
		System.out.println(ExpectedResult);
		if(ExpectedResult.equalsIgnoreCase("Magnus")){
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.close();
	}
	
	@Test(priority = 3)
	@SuppressWarnings("deprecation")
	public void LoginMethod_1_InvaildPasswordLogin() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", path);
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("xxxxxxxx");
		try {
			driver.findElement(By.id("btnLogin")).click();
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Submit Button Not Found");
		}
		Thread.sleep(5000);	
		 
		String ExpectedResult = driver.getTitle();
		System.out.println(ExpectedResult);
		if(ExpectedResult.equalsIgnoreCase("Magnus")){
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.close();
	}
	
	@Test(priority = 4)
	@SuppressWarnings("deprecation")
	public void LoginMethod_1_SubmitElementNotFound() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", path);
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		System.out.println("Submit Button Not Found");
		Thread.sleep(5000);	
		 
		String ExpectedResult = driver.getTitle();
		System.out.println(ExpectedResult);
		if(ExpectedResult.equalsIgnoreCase("Magnus")){
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.close();
	}
	
	
	public static void main(String[] args) throws InterruptedException  {

		Testcase_26_LoginByMethod_5_Login lm = new Testcase_26_LoginByMethod_5_Login();
		lm.LoginMethod_1_Submit();
		lm.LoginMethod_1_VaildLogin();
		lm.LoginMethod_1_InvaildEmailIdLogin();
		lm.LoginMethod_1_InvaildPasswordLogin();
		lm.LoginMethod_1_SubmitElementNotFound();
		
		
		
	}
	
}
