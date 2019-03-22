package com.Sel_git_maven.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase {
	@Test
	public void launch() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver (2).exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
