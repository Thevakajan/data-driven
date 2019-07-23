package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Add_License extends PageBase {
    private  static final Logger LOGGER = Logger.getLogger(Add_License.class);
    private static By JobTitleHeader = By.xpath("//h1");
    private static By AddButton = By.id("btnAdd");
    private static By AddName= By.xpath("//*[@id=\"license_name\"]");
    private static By SaveButton= By.id("btnSave");



    public static void ClickAddButton(){
        getDriver().findElement(AddButton).click();
        LOGGER.info("Button_Add_Button_Click*** ");
    }
    public static void ClickSaveButton(){
        getDriver().findElement(SaveButton).click();
        LOGGER.info("Button_Save_Button_Click*** ");
    }
    public static void setname(String name) {
        getDriver().findElement(AddName).sendKeys(name);
        LOGGER.info("Typeing Add Name");
    }
}
