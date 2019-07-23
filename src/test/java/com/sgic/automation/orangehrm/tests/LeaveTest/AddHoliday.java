package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.HolidayData;
import com.sgic.automation.orangehrm.pages.Holidays;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class AddHoliday extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddHoliday.class);

    @Test( priority = 12,groups = "LEAVE",dataProviderClass = HolidayData.class,dataProvider = "AddHoliday",testName = "Add Holiday")
    public void AddHoliday(String addHolidayName, String calenderDate,String addHolidayLength){
        extentTest=extentReport.startTest("Add New Holiday");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Module Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        Holidays.clickMenuHoliday();
        LOGGER.info("Holiday Menu Clicked");
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.clickBtnAdd();
        LOGGER.info("Add button Clicked");
        softAssert.assertTrue(Holidays.isAddHolidayHeaderDisplay(),"Add Holiday page not displayed");
        Holidays.AddHolidays(addHolidayName,calenderDate,addHolidayLength);
        Holidays.clickBtnSave();
        LOGGER.info("Save button Clicked");
        PageBase.staticWait(3);
        extentTest.log(LogStatus.PASS, "Holiday Sucessfully Added");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
