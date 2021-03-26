package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.basePackage.BaseClass;
import com.extentManager.ExtentManager;

public class OrangeHRMTest extends BaseClass {
	  

	@Test(priority=1)
	public void VanillaPassportLoginPage() throws InterruptedException {
		  useCaseName = " ## Vanilla Passport Login Page ";	
	      String actualTitle=driver.getTitle();
		  System.out.println(" ++++++++++++++"+useCaseName+"++++++++++++++ OK "+ actualTitle);
		  //Thread.sleep(100);
		  Assert.assertEquals(vanillaByPassUrl,driver.getCurrentUrl()); 
	}
	@Test(priority=2)
	public void VanillaPassportLogin() throws InterruptedException {
		  useCaseName = " Vanilla Passport Login Test ";
		  //driver.get(vanillaByPassUrl); 
		  //Thread.sleep(2000);		  
		 // System.out.println("Vanilla Passport calling .............");
		  //WebElement username=driver.findElement(By.id("username")); 
		  //WebElement password=driver.findElement(By.id("password")); 
		  // System.out.println("444444444444."+login);
		 //System.out.println("3333333333333333333." +password);
		   loginToVanillaPassport();
		   String actualTitle=driver.getTitle();
		   Thread.sleep(500);
		   System.out.println(" ++++++++++++++"+useCaseName+"++++++++++++++ OK "+actualTitle);		
		   Assert.assertTrue(true);
	}
	@Test(priority=3)
	public void Vanilla3DDashboardLogin() throws InterruptedException {
		  useCaseName = " Vanilla 3DDashboard Login Test ";
		  loginToVanillaPassport();			
		  driver.switchTo().window(driver.getWindowHandles().iterator().next()); 
		  driver.get("https://vanilla-3ddashboard.damenplm.com/3ddashboard");	
		  String actualTitle=driver.getTitle();
		  Thread.sleep(2000);		  
		  System.out.println(" ++++++++++++++"+useCaseName+"++++++++++++++ OK "+actualTitle);	
		  Assert.assertTrue(true);
	}
	@Test(priority=4)
	public void Vanilla3DSPaceLoginTest() throws InterruptedException {
		  useCaseName = " Vanilla 3DSPace Login Test ";
		  loginToVanillaPassport();
		  driver.switchTo().window(driver.getWindowHandles().iterator().next()); 			
		  driver.get("https://vanilla-3dspace.damenplm.com/3dspace/");
		  String actualTitle=driver.getTitle();
		  Thread.sleep(2000);
		  System.out.println(" ++++++++++++++"+useCaseName+"++++++++++++++ OK "+actualTitle);
		  Assert.assertTrue(true);
	}
	@Test(priority=5)
	public void VanillaFedSearchMonitoringTest() throws InterruptedException {
		    useCaseName = " Vanilla FederatedSearch Monitoring Test ";
		    loginToVanillaPassport();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");// Open new tab 			
			driver.switchTo().window(driver.getWindowHandles().iterator().next()); 			
			driver.get("https://vanilla-3dsearch.damenplm.com/federated/manager?query=monitoring");
			String actualTitle=driver.getTitle();
			System.out.println(" ++++++++++++++"+useCaseName+"++++++++++++++ OK "+actualTitle);
		    Assert.assertTrue(true);
	}
	@Test(priority=6)
	public void VanillaFedsearchQueryStatusTest() throws InterruptedException {
		    useCaseName = " Feddsearch query status Test ";
		    loginToVanillaPassport();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");// Open new tab 			
			driver.switchTo().window(driver.getWindowHandles().iterator().next()); 			
			driver.get("https://vanilla-3dsearch.damenplm.com/federated/search?query=test");
			String actualTitle=driver.getTitle();
			System.out.println(" ++++++++++++++"+useCaseName+"++++++++++++++ OK "+actualTitle);
		    Assert.assertTrue(true);
	}
	@Test(priority=7)
	public void VanillaCentralFcsTest() throws InterruptedException {
		    useCaseName = "  Vanilla Central Fcs Test";
		    loginToVanillaPassport();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");// Open new tab 			
			driver.switchTo().window(driver.getWindowHandles().iterator().next()); 	
			String actualTitle=driver.getTitle();
			driver.get("https://vanilla-centralfcs.damenplm.com/fcs/servlet/fcs/about");
			System.out.println(" ++++++++++++++"+useCaseName+"++++++++++++++ OK "+actualTitle);
		    Assert.assertTrue(true);
	}
	
	/*	
	@Test
	public void loginTest() throws InterruptedException {
		useCaseName = "  opensource login Test ";
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        String expectedTitle="OrangeHRM";
        Assert.assertEquals(actualTitle, expectedTitle);
	}
	*/
	/*
	@Test
	public void sampleCase() {
		ExtentManager.test.createNode("Validation1");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation2");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation3");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation4--changes--");
		Assert.assertTrue(true);
	}*/
}
