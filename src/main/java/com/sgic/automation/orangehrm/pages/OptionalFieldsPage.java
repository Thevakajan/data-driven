package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/*
@Author Jenisha
verify OptionalFields functions
 */
public class OptionalFieldsPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PIMPage.class);

    private static By OptionalFieldHeading=By.xpath("//*[@id=\"content\"]/div/div[1]/h1");
    private static By edit=By.id("btnSave");
    private static By save=By.id("btnSave");
    private static By select=By.id("configPim_chkShowSSN");
    private static By confirmation=By.xpath("//*[@id=\"content\"]/div/div[2]/script");



    public static boolean isOptionlFieldDisplayes(){
        return getDriver().findElement(OptionalFieldHeading).isDisplayed();
    }

    public static void clicEditBtn(){

        getDriver().findElement(edit).click();
        LOGGER.info("Edit button clicked");
    }
    public static void clickSaveBtn(){

        getDriver().findElement(save).click();
        LOGGER.info("Save button clicked");
    }
    public static void selectOption(){

        getDriver().findElement(select).click();
        LOGGER.info("Select option clicked");
    }
    public static boolean isConfirmationDisplayed(){
        return getDriver().findElement(confirmation).isDisplayed();
    }

}
