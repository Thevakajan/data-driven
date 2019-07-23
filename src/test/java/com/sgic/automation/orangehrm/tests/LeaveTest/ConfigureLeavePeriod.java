package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LeavePeriodData;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ConfigureLeavePeriod  extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(ConfigureLeavePeriod.class);

    //Edit Leave Period
    @Test( priority = 7,groups = "LEAVE",dataProviderClass = LeavePeriodData.class,dataProvider = "LeavePeriod",testName = "Leave Entitlements and Usage Report")
    public void leavePeriod(String leavePeriodStartMonth, String leavePeriodStartDate){
        extentTest=extentReport.startTest("Edit Leave Period");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        LeavePeriod.clickMenuLeavePeriod();
        LOGGER.info("Leave Period Menu Clicked");
        softAssert.assertTrue(LeavePeriod.isLeavePeriodDisplay(),"Edit Leave Period not Displayed");
        LeavePeriod.clickBtnEdit();
        LOGGER.info("Edit Button Clicked");
        LeavePeriod.EditLeavePeriod(leavePeriodStartMonth,leavePeriodStartDate);
        LeavePeriod.clickbtnSave();
        LOGGER.info("Save Button Clicked");
        extentTest.log(LogStatus.PASS, "Leave period Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
