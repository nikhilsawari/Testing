package com.nikhil.pagedriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageDriver {
	public WebDriver driver = null;
	//public static String nikhil="my name is nikhil";

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void sendkeys(By by, String dataValue) {
		driver.findElement(by).sendKeys(dataValue);
	}

	public String getText(By by) {
		return driver.findElement(by).getText();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void waitForVisibilityOfElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element = driver.findElement(by);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForVisibilityofElements(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		List<WebElement> elements = driver.findElements(by);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public List<WebElement> getListofElements(By by) {

		List<WebElement> elements = driver.findElements(by);
		return elements;
	}

	public static void pause(int timeToWait) {

		try {
			Thread.sleep(timeToWait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
