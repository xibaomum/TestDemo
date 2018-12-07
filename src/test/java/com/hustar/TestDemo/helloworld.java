package com.hustar.TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class helloworld {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	}

	/*
	 * @Parameters({"browser"})
	 * 
	 * @BeforeTest public void setupBrowser(String browser){ if
	 * (browser.equals("firefox")){ driver = new FirefoxDriver(); } else {
	 * driver = new ChromeDriver(); } }
	 */

	@Test
	public void commitkeyword() {
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();

		driver.get("http://www.baidu.com");

		WebElement element = driver.findElement(By.name("wd"));

		element.sendKeys("hello Selenium!");

		element.submit();
	}

	@AfterTest
	public void closed() {
		// 关闭浏览器
		driver.quit();
		System.out.println("关闭浏览器成功");
	}

}
