package com.actiTime.testscrip;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLip;
import com.actiTime.pom.DelecteProject;
import com.actiTime.pom.HomePage;

@Listeners(com.actiTime.generic.ListnearImpliment.class)
public class DleteExistProject extends BaseClass{

	
	@Test
	public void deletePer() throws EncryptedDocumentException, IOException, InterruptedException {
		FileLip f=new FileLip();
		 String name = f.getExFileData("sheet1", 2, 3);
		 
		 
		 HomePage hm=new HomePage(driver);
			hm.setTaskTab();
			
		 DelecteProject d=new DelecteProject(driver);
		 d.getTypeProjectName().sendKeys(name);
		 d.getTapText().click();
		 d.getSelectSetting().click();
		 Thread.sleep(2000);
		 d.getTabAction().click();
		 d.getTapDelete().click();
		 d.getTapPerDelete().click();
		 String text = d.getConfirmDelete().getText();
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.textToBePresentInElement(d.getConfirmDelete(), text));
		 String text1 = d.getConfirmDelete().getText();
		 Assert.assertEquals(text, text1);
		
	}
}
