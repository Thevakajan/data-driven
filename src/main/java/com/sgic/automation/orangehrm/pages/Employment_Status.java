package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;



public class Employment_Status  extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(Employment_Status.class);
    private static By Employee_Status_Header = By.id("empStatusHeading");
    public static boolean isDisplayEmployee_Status_Header(){
        return getDriver().findElement(Employee_Status_Header).isDisplayed();
    }

    private static By AddButton = By.id("btnAdd");
    public static void ClickAddButton(){
        getDriver().findElement(AddButton).click();
        LOGGER.info("Button_Add_Button_Click*** ");
    }
    private static By txtAdd_Employment_Status = By.id("empStatus_name");
    public static void setEmployment_Status(String Employment_Status) {
        getDriver().findElement(txtAdd_Employment_Status).sendKeys(Employment_Status);
        LOGGER.info("Typeing Employee Name");
    }

    private static By ButtonSave= By.id("btnSave");
    public static void ClickButtonSave(){
        getDriver().findElement(ButtonSave).click();
        LOGGER.info("Button_Save_Button_Click*** ");
    }
}
