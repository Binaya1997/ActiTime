package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProject {


	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;

    @FindBy(xpath="//div[text()='+ New Project']")
    private WebElement newProject;
    
    @FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
    private WebElement projectName;
    
    @FindBy(xpath="(//div[@class='dropdownButton'])[15]")
    private WebElement customerDropdown;
    
    @FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
    private WebElement chooseCustomer;
    
    @FindBy(xpath="//textarea[@placeholder='Add Project Description']")
    private WebElement projectDesp;
    
    @FindBy(xpath="//div[text()='Create Project']")
    private WebElement addProject;
    
    @FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actcustomer;
    
	public CreateNewProject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddNew() {
		return addNew;
	}

	
	public WebElement getNewProject() {
		return newProject;
	}

	
	public WebElement getProjectName() {
		return projectName;
	}

	
	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	
	public WebElement getChooseCustomer() {
		return chooseCustomer;
	}

	
	public WebElement getProjectDesp() {
		return projectDesp;
	}

	
	public WebElement getAddProject() {
		return addProject;
	}


	public WebElement getActCustomer() {
		return actcustomer;
	}









}
