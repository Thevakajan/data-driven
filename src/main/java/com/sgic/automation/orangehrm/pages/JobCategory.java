package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class JobCategory extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(JobCategory.class);
    private static By AddButton = By.id("btnAdd");
    public static void ClickAddButton(){
        getDriver().findElement(AddButton).click();
        LOGGER.info("Button_Add_Button_Click*** ");
    }
    private static By txtjobCategory_name = By.id("jobCategory_name");
    public static void setjobCategory_name(String jobCategory_name) {
        getDriver().findElement(txtjobCategory_name).sendKeys(jobCategory_name);
        LOGGER.info("Typeing Job Category Name");
    }

    private static By ButtonSave= By.id("btnSave");
    public static void ClickButtonSave(){
        getDriver().findElement(ButtonSave).click();
        LOGGER.info("Button_Save_Button_Click*** ");
    }
    private static By DeleteButton= By.id("btnDelete");
    public static void ClickDeleteButton(){
        getDriver().findElement(DeleteButton).click();
        LOGGER.info("Button_Delete_Button_Click*** ");
    }
    private static By JobheckBox= By.id("ohrmList_chkSelectAll");
    public static void ClickCheckBox(){
        getDriver().findElement(JobheckBox).click();
        LOGGER.info("JabCategory_CheckBox_ClickAll *** ");
    }
    private static By ConForomOk= By.id("dialogDeleteBtn");
    public static void ClickConForomOk(){
        getDriver().findElement(ConForomOk).click();
        LOGGER.info("JabTitle_CheckBox_ClickAll *** ");
    }
}
