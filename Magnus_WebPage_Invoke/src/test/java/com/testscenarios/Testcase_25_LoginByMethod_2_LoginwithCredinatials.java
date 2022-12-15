package com.testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testcase_25_LoginByMethod_2_LoginwithCredinatials {

	public static String path = "..//jalatechnologies/DriverLocations/msedgedriver.exe";
	public static String url  = "https://magnus.jalatechnologies.com/";
	public static WebDriver driver;
	/*
	public static String emailid  = "training@jalaacademy.com";
	public static String password = "jobprogram";
	*/
	
	//public void LoginMethod_1() throws InterruptedException {
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", path);
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
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
	
}
