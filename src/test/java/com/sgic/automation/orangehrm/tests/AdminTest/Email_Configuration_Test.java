package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.EmailConfigData;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.Mail_Configuration;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Email_Configuration_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Email_Configuration_Test.class);

    @Test(groups = "REGRESSION",priority = 4, dataProvider = "EmailConfige", dataProviderClass = EmailConfigData.class)
    public void SaveJobTitleTest(String mailsentas,String PathMail,String TestEmail) {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.ClickMenuConfiguration();
        AdminMenuPage.ClickMenuEmail_Config();
        extentTest=extentReport.startTest("Mail Configuration");
        Mail_Configuration.MailConfiguration(mailsentas,PathMail,TestEmail);
        extentTest.log(LogStatus.PASS, " OrangeHRM Mail Configuration Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
