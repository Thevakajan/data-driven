package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class JobTitle extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(JobTitle.class);
    private static By JobTitleHeader = By.xpath("//h1");
    public static boolean isDisplayTitleHeader(){
        return getDriver().findElement(JobTitleHeader).isDisplayed();
    }
    private static By AddButton = By.id("btnAdd");
    public static void ClickAddButton(){
        getDriver().findElement(AddButton).click();
        LOGGER.info("Button_Add_Button_Click*** ");
    }
    private static By DeleteButton= By.id("btnDelete");
    public static void ClickDeleteButton(){
        getDriver().findElement(DeleteButton).click();
        LOGGER.info("Button_Delete_Button_Click*** ");
    }
    private static By JobTitleCheckBox= By.id("ohrmList_chkSelectAll");
    public static void ClickCheckBox(){
        getDriver().findElement(JobTitleCheckBox).click();
        LOGGER.info("JabTitle_CheckBox_ClickAll *** ");
    }
    private static By ConForomOk= By.id("dialogDeleteBtn");
    public static void ClickConForomOk(){
        getDriver().findElement(ConForomOk).click();
        LOGGER.info("JabTitle_ConformDelte*** ");
    }


    private static By AddJobTitleHeader = By.xpath("//h1");
    public static boolean isDisplayAddJobTitleHeader(){
        return getDriver().findElement(AddJobTitleHeader).isDisplayed();
    }
    private static By txtJobTitle = By.id("jobTitle_jobTitle");
    public static void setJobTitle(String JobTitle) {
        getDriver().findElement(txtJobTitle).sendKeys(JobTitle);
        LOGGER.info("Typeing Job Title");
    }
    private static By txtJobDescription = By.id("jobTitle_jobDescription");
    public static void setJobDescription(String Description) {
        getDriver().findElement(txtJobDescription).sendKeys(Description);
        LOGGER.info("Typeing Job Description");
    }
    private static By txtobSpecification= By.id("jobTitle_jobSpec");
    public static void ClickButtonpecifica(){
        getDriver().findElement(txtobSpecification).click();
        LOGGER.info("Button_Save_Button_Click*** ");
    }
    private static By txtNote= By.id("jobTitle_note");
    public static void setNote(String Note) {
        getDriver().findElement(txtNote).sendKeys(Note);
        LOGGER.info("Typeing Job Note");
    }
    private static By ButtonSave= By.id("btnSave");
    public static void ClickButtonSave(){
        getDriver().findElement(ButtonSave).click();
        LOGGER.info("Button_Save_Button_Click*** ");
    }
    public void JobTitle(String JjobTitle,String JobDecription,String Notes){
        JobTitle.setJobTitle(JjobTitle);
        JobTitle.setJobDescription(JobDecription);
        JobTitle.setNote(Notes);
    }
}
