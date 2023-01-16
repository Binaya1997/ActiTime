package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tabtsk {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustmer;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter Customer Name\"])[2]")
	private WebElement customerName;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement description;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustmoer;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement existCustomer;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualcustomer;
	
	public Tabtsk(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getAddNew() {
		return addNew;
	}

	
	public WebElement getNewCustmer() {
		return newCustmer;
	}

	
	public WebElement getCustomerName() {
		return customerName;
	}

	
	public WebElement getDescription() {
		return description;
	}

	
	public WebElement getSelectCustmoer() {
		return selectCustmoer;
	}

	
	public WebElement getExistCustomer() {
		return existCustomer;
	}

	
	public WebElement getCreateCustomer() {
		return createCustomer;
	}
	
	
    public WebElement getActualcustomer() {
		return actualcustomer;
	}

}
