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
import com.actiTime.pom.HomePage;
import com.actiTime.pom.Tabtsk;

@Listeners(com.actiTime.generic.ListnearImpliment.class)
public class CreateCustomer extends BaseClass {
	
	@Test
	public void testlogin() throws EncryptedDocumentException, IOException, InterruptedException{
		 FileLip f=new FileLip();
		 String name = f.getExFileData("sheet1", 1, 3);
	     String desc = f.getExFileData("sheet1", 1, 4);
	    
		HomePage hm=new HomePage(driver);
		hm.setTaskTab();
		
	    Tabtsk t=new Tabtsk(driver);
	    t.getAddNew().click();
	    t.getNewCustmer().click();
	    t.getCustomerName().sendKeys(name);
	    t.getDescription().sendKeys(desc);
	    t.getSelectCustmoer().click();
	    t.getExistCustomer().click();
	    t.getCreateCustomer().click();
	  
	    WebDriverWait wait=new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.textToBePresentInElement(t.getActualcustomer(), name));
	    String actualname = t.getActualcustomer().getText();
	    Assert.assertSame(actualname, name);
	    
		 
	}
}
