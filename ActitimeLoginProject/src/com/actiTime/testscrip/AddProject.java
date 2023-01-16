package com.actiTime.testscrip;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLip;
import com.actiTime.pom.CreateNewProject;
import com.actiTime.pom.HomePage;


@Listeners(com.actiTime.generic.ListnearImpliment.class)
public class AddProject extends BaseClass {
	
	@Test
	public void addProject() throws EncryptedDocumentException, IOException, InterruptedException {
	FileLip f=new FileLip();
	 String name = f.getExFileData("sheet1", 2, 3);
    String desc = f.getExFileData("sheet1", 2, 4);
   
    HomePage hm=new HomePage(driver);
	hm.setTaskTab();
	
	CreateNewProject c=new CreateNewProject(driver);
	c.getAddNew().click();
	c.getNewProject().click();
	c.getProjectName().sendKeys(name);
	c.getCustomerDropdown().click();
	c.getChooseCustomer().click();
	c.getProjectDesp().sendKeys(desc);
	c.getAddProject().click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.textToBePresentInElement(c.getActCustomer(), name));
	String actname = c.getActCustomer().getText();
	Assert.assertSame(actname, name);
	}
}
