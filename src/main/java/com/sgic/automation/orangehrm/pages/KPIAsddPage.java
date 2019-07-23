package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * @Author Jeyapriya
 */
public class KPIAsddPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By addKPIsheading = By.id("PerformanceHeading");
    private static By txtjobtitle = By.id("defineKpi360_jobTitleCode");
    private static By txtKPI = By.id("defineKpi360_keyPerformanceIndicators");
    private static By txtMinRating = By.id("defineKpi360_minRating");
    private static By txtMaxRating = By.id("defineKpi360_maxRating");
    private static By makeDefault = By.id("defineKpi360_makeDefault");
    private static By savebtn = By.id("saveBtn");
    private static By cancelbtn = By.id("btnCancel");

    public static boolean isAddKIPsPageDisplayes(){
        return getDriver().findElement(addKPIsheading).isDisplayed();
    }
    public static void setJobTitle(String jobTitle){
        getDriver().findElement(txtjobtitle).sendKeys(jobTitle);
    }
    public static void setKPIs(String kpis){
        getDriver().findElement(txtKPI).clear();
        getDriver().findElement(txtKPI).sendKeys(kpis);
    }
    public static void setMinRating(String minRating){
        getDriver().findElement(txtMinRating).clear();
        getDriver().findElement(txtMinRating).sendKeys(minRating);
    }
    public static void setMaxRating(String maxRating){
        getDriver().findElement(txtMaxRating).clear();
        getDriver().findElement(txtMaxRating).sendKeys(maxRating);
    }
    public static void clickMakeDefault(){
        getDriver().findElement(makeDefault).click();
    }
    public static boolean isSaveButtonDisplayed(){
        return getDriver().findElement(savebtn).isDisplayed();
    }
    public static void clickSaveBtn(){
        getDriver().findElement(savebtn).click();
    }
    public static void  addKPIs(String jobTitle,String KPI,String minRating,String maxRating){
        KPIAsddPage.setJobTitle(jobTitle);
        KPIAsddPage.setKPIs(KPI);
        KPIAsddPage.setMinRating(minRating);
        KPIAsddPage.setMaxRating(maxRating);
        KPIAsddPage.clickMakeDefault();
        KPIAsddPage.clickSaveBtn();
    }

}
