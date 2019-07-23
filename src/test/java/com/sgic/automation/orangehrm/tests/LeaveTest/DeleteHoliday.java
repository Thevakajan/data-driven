package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.HolidayData;
import com.sgic.automation.orangehrm.pages.Holidays;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DeleteHoliday extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(DeleteHoliday.class);

    @Test( priority = 14,groups = "LEAVE",dataProviderClass = HolidayData.class,dataProvider = "SearchHoliday",testName = "Search Holiday")
    public void DeleteHoliday(String calFromDate, String calToDate){
        extentTest=extentReport.startTest("Delete Holiday");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        Holidays.clickMenuHoliday();
        LOGGER.info("Holiday Menu Clicked");
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        LOGGER.info("Holiday details header verified");
        Holidays.SearchHolidays(calFromDate,calToDate);
        Holidays.clickBtnSearch();
        LOGGER.info("Search Button Clicked");
        Holidays.clickDeleteCheckBoxClick();
        LOGGER.info("Delete Check box Clicked");
        Holidays.clickBtnDelete();
        LOGGER.info("Delete Button Clicked");
        softAssert.assertTrue(Holidays.isDeleteHolidayConfirmationHeaderDisplay(),"Delete Holiday Confiramation message not displayed");
        LOGGER.info("Leave Type Menu Clicked");
        Holidays.clickDeleteHolidayOk();
        LOGGER.info("Ok button is Clicked");
        extentTest.log(LogStatus.PASS, "Holiday detail is Sucessfully Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

}
