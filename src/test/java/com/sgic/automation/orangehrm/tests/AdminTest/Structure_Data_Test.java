package com.sgic.automation.orangehrm.tests.AdminTest;


import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.Organization_Structure_Data;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.Organization_Structure;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Structure_Data_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Structure_Data_Test.class);
    @Test(groups = "REGRESSION", priority = 15, dataProviderClass = Organization_Structure_Data.class, dataProvider = "Structure_Data")
    public void testGenderlInformation(String Name, String Phone,String Email) {
        softAssert = new SoftAssert();
        extentTest=extentReport.startTest(" Add Unit Test");
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");

        AdminMenuPage.clickAdmin();
        extentTest.log(LogStatus.PASS, "Click Add Success");
        AdminMenuPage.clickMenuOrganization();
        extentTest.log(LogStatus.PASS, "Click MenuOrganization Success");
        AdminMenuPage.ClickMenuStructure();
        Organization_Structure.Organization_Structure(Name,Phone,Email);


        extentTest.log(LogStatus.PASS, "Gender Information Add Success");
//        softAssert.assertTrue(RegistionPage.isLoginPageDisplayed(), "Registion  is not Displayed");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
