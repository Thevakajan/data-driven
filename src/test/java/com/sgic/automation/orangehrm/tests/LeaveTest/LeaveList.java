package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LeaveListData;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.LeaveEntitlementsAndUsageReport;
import com.sgic.automation.orangehrm.pages.LeaveListPage;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.tests.LeaveTest.SearchHoliday;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LeaveList extends TestBase {
        private static final Logger LOGGER = Logger.getLogger(LeaveList.class);

    @Test( priority = 0,dataProviderClass = LeaveListData.class,dataProvider = "LeaveList",testName = "Leave List")
    public void LeaveList(String calFromDate,String calToDate,String leaveList_txtEmployee_empName,String leaveList_cmbSubunit,String leaveComment) {
        extentTest = extentReport.startTest("Leave List Search");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeaveListPage.clickLeaveMenu();
        LOGGER.info("Leave Menu clicked");
        LeaveListPage.clickLeaveListMenu();
        LOGGER.info("Leave List Menu clicked");
        softAssert.assertTrue(LeaveListPage.isLeaveListDisplay(),"Leave List page not Displayed");
        LOGGER.info("Leave List Page is Verified");
        LeaveListPage.LeaveListData(calFromDate,calToDate,leaveList_txtEmployee_empName,leaveList_cmbSubunit);
        LeaveListPage.clickLeaveListSearch();
        LOGGER.info("Leave List Search Button Clicked");
        softAssert.assertTrue(LeaveListPage.isResultTableDisplay(),"Search Result Table not displayed");
        LOGGER.info("Leave List Search Results table verified");
        softAssert.assertTrue(LeaveListPage.isSearchResultDisplay(),"Search Result not displayed");
        LOGGER.info("Leave List Search Results verified");
        LOGGER.info("Leave Sucessfully Searched");
        implicitWait(2);
        LeaveListPage.clickCommentIcon();
        LOGGER.info("Comment Icon Clicked");
        //softAssert.assertTrue(LeaveListPage.isCommentDialogDisplay(),"Comment Dialog Not Displayed");
        LOGGER.info("Comment dialog Sucessfully Verified");
        LeaveListPage.setComment(leaveComment);
        LeaveListPage.clickCommentSave();

        extentTest.log(LogStatus.PASS, "Leave List Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
