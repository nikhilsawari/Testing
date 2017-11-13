package com.nikhil.test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nikhil.pagedriver.PageDriver;
import com.nikhil.pages.HomePage;
import com.nikhil.pages.PageObjects;

public class LoginTest {

	HomePage homepage = new HomePage();
	//PageDriver pagedriver = new PageDriver();

	
	public void beforegrp() {
		System.out.println("Inside before group");

	}

	@BeforeTest
	public void startSession() {
		homepage.initialiseDriver();;

	}
/*
	@AfterMethod
	public void closeSession() {
		homepage.tearDown();
	}*/

	@Test(priority = 1, groups = "Regression")
	public void checkLogin() throws InterruptedException {
		System.out.println("1");
		homepage.userName("nik22awari");
		homepage.submitButoon();
		
		Thread.sleep(1000);
		homepage.passWord("nokia58000");
		Thread.sleep(1000);
		homepage.submitButoon();
		Thread.sleep(3000);
		Assert.assertEquals(homepage.invalidCreditMessage(), "Wrong password. Try again.");
		homepage.passWord("nokia5800");
		Thread.sleep(1000);
		homepage.submitButoon();
		Thread.sleep(5000);
		Assert.assertEquals(homepage.homePageUrl(), "https://mail.google.com/mail/u/0/#inbox");
	}

	@Test(priority = 2, groups = "Functional")
	public void writeMail() {

		System.out.println("2");
	}

	@Test(priority = 3, groups = "Non-Functional")
	public void thirdMethod() {

		System.out.println("3");
	}

	@Test(priority = 4, groups = "Regression")
	public void fourthMethod() {

		System.out.println("4");
	}
}
