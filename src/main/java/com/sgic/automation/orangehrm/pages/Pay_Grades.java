package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Pay_Grades extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(Pay_Grades.class);
    private static By PayGradesHeader = By.xpath("//h1");
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
    private static By txtname = By.id("payGrade_name");
    public static void setname(String name) {
        getDriver().findElement(txtname).sendKeys(name);
        LOGGER.info("Typeing Pay_Grades");
    }
    public static boolean isDisplayTitleHeader(){
        return getDriver().findElement(PayGradesHeader).isDisplayed();
    }
    private static By ButtonSave= By.id("btnSave");
    public static void ClickButtonSave(){
        getDriver().findElement(ButtonSave).click();
        LOGGER.info("Button_Save_Button_Click*** ");
    }
}
