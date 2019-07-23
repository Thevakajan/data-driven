package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Skills  extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(Skills.class);
    private static By AddButton = By.id("btnAdd");
    public static void ClickAddButton(){
        getDriver().findElement(AddButton).click();
        LOGGER.info("Button_Add_Button_Click*** ");
    }
    private static By SaveButton = By.id("btnSave");
    public static void ClicksaveButton(){
        getDriver().findElement(SaveButton).click();
        LOGGER.info("Button_Save_Button_Click*** ");
    }
    private static By txtSkillName = By.id("skill_name");
    public static void setjobCategory_name(String name) {
        getDriver().findElement(txtSkillName).sendKeys(name);
        LOGGER.info("Typeing Add SkillName");
    }
    private static By txtDescription = By.id("skill_description");
    public static void setDescription(String Description) {
        getDriver().findElement(txtDescription).sendKeys(Description);
        LOGGER.info("Typeing Add SkillName");
    }
}
