package com.sgic.automation.orangehrm.tests.performance;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.PerformanceTestData;
import com.sgic.automation.orangehrm.pages.AddTrackersPage;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.TrackersPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
/**test for performance functionality
 * @Author Jeyapriya
 */
public class AddTRackers extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddTRackers.class);
    /**
     *testcase:add Trackers
     * @param trackerName:Jasmine Morgan
     * @param employeeName:John Smith
     * @param reviewers:Hannah Flores
     */
    @Test(groups = "PERFORMANCE",priority = 5,dataProviderClass = PerformanceTestData.class,
            dataProvider = "addTracker",testName = "Add Trackers")
    public  void addTrackers(String trackerName,String employeeName,String reviewers){
        extentTest=extentReport.startTest("Add Trackers");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        extentTest.log(LogStatus.PASS, "Login page is displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        extentTest.log(LogStatus.PASS, "Login success");
        LOGGER.info("DashBoardPage is displayed");
        extentTest.log(LogStatus.PASS, "Dashboard page is displayed");        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isTrackerBtnDisplay(),"Tracker button is not Displayed");
        DashBoardPage.clickTrackersbtn();
        LOGGER.info("Trackers page is displayed");
        extentTest.log(LogStatus.PASS, "Trackers page is displayed");
        softAssert.assertTrue(TrackersPage.isTrackersDisplayed() ,"Trackers page  is not Displayed");
        TrackersPage.clickAddbtn();
        LOGGER.info("Add Trackers page is displayed");
        softAssert.assertTrue(AddTrackersPage.isAddTrackersDisplayes() ,"Add Trackers page  is not Displayed");
        LOGGER.info("Add Trackers with tracker name: "+trackerName+", employee name: "+employeeName + ", reviewers: "+reviewers);
        AddTrackersPage.addTrackers( trackerName, employeeName, reviewers);
        extentTest.log(LogStatus.PASS, "add trackers with trackerName : "+trackerName+
                " , employeeName : "+employeeName+" , reviewers: "+reviewers);
        softAssert.assertTrue(TrackersPage.isResultDisplayed(),"Trackers add result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        LOGGER.info("logout success");
        extentTest.log(LogStatus.PASS, "logout success");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
}
