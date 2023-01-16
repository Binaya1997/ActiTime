package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelecteProject {


	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement typeProjectName;
	
	@FindBy(xpath="//span[text()='HDFC']")
	private WebElement tapText;
		
	@FindBy(xpath="(//div[@class='editButton'])[18]")
	private WebElement selectSetting;
	
	@FindBy(xpath="(//div[text()='ACTIONS' and @class='action'])[2]")
	private WebElement  tabAction;
	
	@FindBy(xpath="(//div[text()='Delete'])[3]")
	private WebElement tapDelete;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement tapPerDelete;
	
	@FindBy(xpath="(//div[text()='All Customers'])[2]")
	private WebElement confirmDelete;
	
	public DelecteProject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	
	
	
	public WebElement getTypeProjectName() {
		return typeProjectName;
	}
	
	public WebElement getTapText() {
		return tapText;
	}
	
	public WebElement getSelectSetting() {
		return selectSetting;
	}

	public WebElement getTabAction() {
		return tabAction;
	}

	
	public WebElement getTapDelete() {
		return tapDelete;
	}

	
	public WebElement getTapPerDelete() {
		return tapPerDelete;
	}

	
	public WebElement getConfirmDelete() {
		return confirmDelete;
	}
	
}
