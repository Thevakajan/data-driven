package com.sgic.automation.orangehrm.pages;

/**
 * @Author Thanushan
 */
import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.sgic.automation.orangehrm.utils.PageBase.getDriver;
import static com.sgic.automation.orangehrm.utils.PageBase.implicitWait;

public class LeaveListPage{
    private static By leaveMenu = By.id("menu_leave_viewLeaveModule");
    private static By leaveListMenu = By.id("menu_leave_viewLeaveList");
    private static By leaveListHeader = By.id("leave-list-search");
    private static By leaveListFrom= By.id("calFromDate");
    private static By leaveListTo = By.id("calToDate");
    private static By leaveListStatusAll = By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck");
    private static By leaveListStatusRejected = By.id("leaveList_chkSearchFilter_-1");
    private static By leaveListStatusCancelled = By.id("leaveList_chkSearchFilter_0");
    private static By leaveListStatusPendingApproval = By.id("leaveList_chkSearchFilter_1");
    private static By leaveListStatusScheduled = By.id("leaveList_chkSearchFilter_2");
    private static By leaveListStatusTaken = By.id("leaveList_chkSearchFilter_3");
    private static By leaveListEmployee = By.id("leaveList_txtEmployee_empName");
    private static By leaveListSubUnit = By.id("leaveList_cmbSubunit");
    private static By leaveListPastEmployees = By.id("leaveList_cmbWithTerminated");
    private static By leaveListBtnSearch= By.id("btnSearch");
    private static By leaveListBtnReset= By.id("btnReset");
    private static By leaveListBtnSave= By.id("btnSave");
    private static By resultTable= By.id("resultTable");
    private static By searchResult= By.id("search-results");
    private static By commentIcon= By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[7]/span/img");
    private static By commentDialog= By.id("search-commentDialog");
    private static By comment= By.id("leaveComment");
    private static By commentSave= By.id("commentSave");


    public static boolean isLeaveListDisplay(){
        return getDriver().findElement(leaveListHeader).isDisplayed();
    }
    public static void clickLeaveMenu() {
        getDriver().findElement(leaveMenu).click();
    }
    public static void clickLeaveListMenu() {
        getDriver().findElement(leaveListMenu).click();
    }
    public static void setLeaveListFrom( String calFromDate ) {
        getDriver().findElement(leaveListFrom).clear();
        getDriver().findElement(leaveListFrom).sendKeys(calFromDate);
    }
    public static void setLeaveListTo( String calToDate ) {
        getDriver().findElement(leaveListTo).clear();
        getDriver().findElement(leaveListTo).sendKeys(calToDate,Keys.ENTER);
    }
    public static void clickleaveListStatusRejected() {
        getDriver().findElement(leaveListStatusRejected).click();
    }

    public static void clickLeaveListStatusAll() {

        getDriver().findElement(leaveListStatusAll).click();
    }
    public static void setLeaveListEmployee( String leaveList_txtEmployee_empName ) {
        getDriver().findElement(leaveListEmployee).sendKeys(leaveList_txtEmployee_empName);
    }
    public static void setLeaveListSubUnit( String leaveList_cmbSubunit ) {
        getDriver().findElement(leaveListSubUnit).sendKeys(leaveList_cmbSubunit);
    }
    public static void clickLeaveListPastEmployee() {

        getDriver().findElement(leaveListPastEmployees).click();
    }
    public static void clickLeaveListSearch() {

        getDriver().findElement(leaveListBtnSearch).click();
    }
    public static boolean isSearchResultDisplay() {
        return  getDriver().findElement(searchResult).isDisplayed();
    }
    public static boolean isResultTableDisplay() {
        return getDriver().findElement(resultTable).isDisplayed();
    }
    public static void clickCommentIcon() {
        implicitWait(4);
        getDriver().findElement(commentIcon).click();
    }
    public static boolean isCommentDialogDisplay() {

        return getDriver().findElement(commentDialog).isDisplayed();
    }
    public static void setComment(String leaveComment) {
       // getDriver().switchTo().alert().sendKeys(leaveComment);
        getDriver().findElement(comment).sendKeys(leaveComment);
    }
    public static void clickCommentSave() {

        getDriver().findElement(commentSave).click();
    }

    public static void LeaveListData(String calFromDate,String calToDate,String leaveList_txtEmployee_empName,String leaveList_cmbSubunit){
      LeaveListPage.setLeaveListFrom(calFromDate);
      LeaveListPage.setLeaveListTo(calToDate);
      LeaveListPage.clickLeaveListStatusAll();
      LeaveListPage.setLeaveListEmployee(leaveList_txtEmployee_empName);
      LeaveListPage.setLeaveListSubUnit(leaveList_cmbSubunit);
      LeaveListPage.clickLeaveListPastEmployee();

      PageBase.implicitWait(3);
    }
    public static void LeaveListCommentData(String calFromDate,String calToDate,String leaveList_txtEmployee_empName,String leaveList_cmbSubunit){
        LeaveListPage.setLeaveListFrom(calFromDate);
        LeaveListPage.setLeaveListTo(calToDate);
        LeaveListPage.clickLeaveListStatusAll();
        LeaveListPage.setLeaveListEmployee(leaveList_txtEmployee_empName);
        LeaveListPage.setLeaveListSubUnit(leaveList_cmbSubunit);
        //LeaveListPage.clickLeaveListPastEmployee();
        PageBase.implicitWait(3);

    }


}
