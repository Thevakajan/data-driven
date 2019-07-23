package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * @Author Jeyapriya
 */
public class AddTrackersPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By addTrackersPageheading = By.id("performanceTrackerHeading");
    private static By trackerName = By.id("addPerformanceTracker_tracker_name");
    private static By empName = By.id("addPerformanceTracker_employeeName_empName");
    private static By availableReviewers=By.xpath("//*[@id=\"addPerformanceTracker_availableEmp\"]");
    private static By addbtn = By.id("btnAssignEmployee");
    private static By removebtn = By.id("btnRemoveEmployee");

    private static By savebtn = By.id("btnSave");
    private static By cancelbtn = By.id("btnCancel");

    public static boolean isAddTrackersDisplayes(){
        return getDriver().findElement(addTrackersPageheading).isDisplayed();
    }
    public static void setTrackerName(String TrackerName){
        getDriver().findElement(trackerName).clear();
        getDriver().findElement(trackerName).sendKeys(TrackerName);
    }

    public static void setEmployeeName(String employeeName){

        getDriver().findElement(empName).sendKeys(employeeName);
    }
    public static void setAvailableReviewers(String reviewers){
        getDriver().findElement(availableReviewers).sendKeys(reviewers);
    }
    public static void clickAddBtn()
    {
        getDriver().findElement(addbtn).click();
    }
    public static void clickRemoveBtn()
    {
        getDriver().findElement(removebtn).click();
    }
    public static boolean isSaveButtonDisplayed(){
        return getDriver().findElement(savebtn).isDisplayed();
    }
    public static void clickSaveBtn()
    {
        getDriver().findElement(savebtn).click();
    }
    public static void  addTrackers(String trackerName,String employeeName,String reviewers){
        AddTrackersPage.setTrackerName(trackerName);
        AddTrackersPage.setEmployeeName(employeeName);
        AddTrackersPage.setAvailableReviewers(reviewers);
        AddTrackersPage.clickAddBtn();
        AddTrackersPage.clickSaveBtn();
    }
}
