package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.PerformanceTestData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.KPIAsddPage;
import com.sgic.automation.orangehrm.pages.KPIsPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
/**test for performance functionality
 * @Author Jeyapriya
 */
public class AddKPIs extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddKPIs.class);
    /**
     * testcase:Add KeyPerformanceIndicators with these parameters
     * @param jobTitle :IT Manager
     * @param KPI:kpi
     * @param minRating:1
     * @param maxRating:2
     */
    @Test( groups = "PERFORMANCE",priority = 1,dataProviderClass = PerformanceTestData.class,
            dataProvider = "addKPIs",testName = "KeyPerformanceIndicators")
    public void addKIPs(String jobTitle,String KPI,String minRating,String maxRating ) {
        extentTest=extentReport.startTest("Add KPIs");
        LOGGER.info("Login page is displayed");
        extentTest.log(LogStatus.PASS, "Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        extentTest.log(LogStatus.PASS, "Login success");
        LOGGER.info("DashBoardPage is displayed");
        extentTest.log(LogStatus.PASS, "Dashboard page is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
        DashBoardPage.clickKPIs();
        LOGGER.info("KPIs page is Displayed");
        extentTest.log(LogStatus.PASS, "KPIs page is displayed");
        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
        KPIsPage.clickAddbtn();
        LOGGER.info("AddKPIs page is displayed");
        softAssert.assertTrue(KPIAsddPage.isAddKIPsPageDisplayes(),"KPIs add page  is not Displayed");
        LOGGER.info("add KPIs with "+"job title: "+jobTitle+" KPI: "+KPI+" MinimumRating: "+minRating+" MaximumRating: "+maxRating);
        KPIAsddPage.addKPIs(jobTitle,KPI,minRating,maxRating);
        extentTest.log(LogStatus.PASS, "add KPIS with jobtitle: " + jobTitle + " , KPI: " + KPI+" , MinimumRating "
                +minRating+" , maximumRating "+maxRating);

        softAssert.assertTrue(KPIsPage.isResultDisplayed(),"KPIs add result  is not Displayed");
        LOGGER.info("KPIs add successful");
        extentTest.log(LogStatus.PASS, "KPI add successfully");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        LOGGER.info("logout success");
        extentTest.log(LogStatus.PASS, "logout success");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
