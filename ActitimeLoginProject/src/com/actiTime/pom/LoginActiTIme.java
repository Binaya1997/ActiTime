package com.actiTime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generic.FileLip;

public class LoginActiTIme {

	@FindBy(id="username")
	private WebElement ubtx;
	
	@FindBy(name="pwd")
	private WebElement pwtx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	public LoginActiTIme(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void actAction() throws IOException {
		FileLip fl=new FileLip();
		String us = fl.getPrFileData("username");
		String pw = fl.getPrFileData("password");
		ubtx.sendKeys(us);
		pwtx.sendKeys(pw);
		lgbtn.click();
	}
	
}
