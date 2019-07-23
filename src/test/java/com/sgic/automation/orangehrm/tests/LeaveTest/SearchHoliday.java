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

public class SearchHoliday extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(SearchHoliday.class);

    @Test( priority = 13,groups = "LEAVE",dataProviderClass = HolidayData.class,dataProvider = "SearchHoliday",testName = "Search Holiday")
    public void SearchHoliday(String calFromDate, String calToDate){
        extentTest=extentReport.startTest("Search Holiday Details");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Module Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Leave Configure Menu Clicked");
        Holidays.clickMenuHoliday();
        LOGGER.info("Leave Holiday Menu Clicked");
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.SearchHolidays(calFromDate,calToDate);
        Holidays.clickBtnSearch();
        LOGGER.info("Search Button Clicked");
        extentTest.log(LogStatus.PASS, "Holiday Details Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
