package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configFiles.ConfigFiles;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver initializeBrowse() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ConfigFiles.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ConfigFiles.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(ConfigFiles.PAGE_LOAD, TimeUnit.SECONDS);
		return driver;
	}

}
