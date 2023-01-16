package com.actiTime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.actiTime.pom.HomePage;
import com.actiTime.pom.LoginActiTIme;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static WebDriver driver;

@BeforeClass
public void openBrowser() throws IOException {
	driver=new ChromeDriver();
	FileLip fp=new FileLip();
	String URL = fp.getPrFileData("url");
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

@AfterClass
public void closeBrowser() {
	driver.close();
}

@BeforeMethod
public void login() throws IOException {
	LoginActiTIme lg=new LoginActiTIme(driver);
	lg.actAction();
}
@AfterMethod
public void logout() {
	HomePage hm=new HomePage(driver);
	hm.setLhtbtn();
}
}
