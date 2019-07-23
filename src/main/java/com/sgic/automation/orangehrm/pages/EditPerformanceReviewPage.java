package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EditPerformanceReviewPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By editPerformanceReviewPageheading = By.id("addPerformanceHeading");
    private static By txtstartDate = By.id("saveReview360Form_workPeriodStartDate");
    private static By txtendDate = By.id("saveReview360Form_workPeriodEndDate");
    private static By txtdueDate = By.id("saveReview360Form_dueDate");
    private static By savebtn = By.xpath("//*[@id=\"saveBtn\"]");



    public static boolean isAddReviewDisplayes(){
        return getDriver().findElement(editPerformanceReviewPageheading).isDisplayed();
    }


    public static void setStartDate(String startDate){
        getDriver().findElement(txtstartDate).click();
        getDriver().findElement(txtstartDate).clear();
        getDriver().findElement(txtstartDate).sendKeys(startDate);
    }
    public static void setEndDate(String endDate){
        getDriver().findElement(txtendDate).clear();
        getDriver().findElement(txtendDate).sendKeys(endDate);
    }
    public static void setDueDate(String dueDate){
        getDriver().findElement(txtdueDate).clear();
        getDriver().findElement(txtdueDate).sendKeys(dueDate);
    }

    public static void clickSaveBtn()    {
        getDriver().findElement(savebtn).click();
        implicitWait(5);
    }

    public static void  editPerformanceReview(String startDate,String endDate,String dueDate){
        EditPerformanceReviewPage.setStartDate(startDate);
        EditPerformanceReviewPage.setEndDate(endDate);
        EditPerformanceReviewPage.setDueDate(dueDate);
        EditPerformanceReviewPage.clickSaveBtn();
    }
}
