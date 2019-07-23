package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.WorkWeekData;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.WorkWeek;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class EditWorkWeek extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(EditWorkWeek.class);

    @Test( priority =11,groups = "LEAVE",dataProviderClass = WorkWeekData.class,dataProvider = "WorkWeek",testName = "Edit Work Week")
    public void EditWorkWeek(String workWeekMonday,String workWeekTuesday,String workWeekWednesday,String workWeekThursday,String workWeekFriday,String workWeekSaturday,String workWeekSunday){
        extentTest=extentReport.startTest("Edit Work Week");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        WorkWeek.clickMenuEditWorkWeek();
        LOGGER.info("Edit work week Menu Clicked");
        softAssert.assertTrue(WorkWeek.iseditWorkWeekHeaderDisplay(),"Edit Work Week page Not Displayed");
        WorkWeek.clickeditBtn();
        LOGGER.info("Edit button Clicked");
        WorkWeek.WorkWeek(workWeekMonday,workWeekTuesday,workWeekWednesday,workWeekThursday,workWeekFriday,workWeekSaturday,workWeekSaturday);
        WorkWeek.clickSaveBtn();
        LOGGER.info("Save button Clicked");
        extentTest.log(LogStatus.PASS, "Work Wekk Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

}
