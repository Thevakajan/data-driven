package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * @Author Jeyapriya
 */
public class TrackersPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By trackersHeading=By.xpath("//*[@id=\"search-results\"]/div[1]");
    private static By addbtn = By.id("btnAdd");
    private static By deletebtn = By.id("btnDelete");
    private static By btnSelect=By.xpath("//*[@id=\"resultTable\"]/thead/tr/th[1]");
    private static By result=By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]");
    private static By edit=By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a");
    private static By btnAlertOK=By.id("dialogDeleteBtn");


    public static boolean isTrackersDisplayed(){
        return getDriver().findElement(trackersHeading).isDisplayed();
    }
    public static boolean isAddButtonDisplayed(){
        return getDriver().findElement(addbtn).isDisplayed();
    }
    public static void clickAddbtn(){
        getDriver().findElement(addbtn).click();
    }
    public static void clickselectBtn(){
        getDriver().findElement(btnSelect).click();
    }
    public static void clickDeleteBtn(){
        getDriver().findElement(deletebtn).click();
    }
    public static boolean isResultDisplayed(){
        return getDriver().findElement(result).isDisplayed();
    }
    public static void clickToEdit(){
        getDriver().findElement(edit).click();
    }
    public static void clickAlertOk(){
        getDriver().findElement(btnAlertOK).click();
    }
}
