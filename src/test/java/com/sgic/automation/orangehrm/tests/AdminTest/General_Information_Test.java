package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.GeneralInformation_data;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.General_Information;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.tests.GeneralTestData;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class General_Information_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(General_Information_Test.class);

    @Test(groups = "REGRESSION", priority = 6, dataProviderClass = GeneralInformation_data.class, dataProvider = "GenderalInformation")
    public void testGenderlInformation(String Name, String Phone,String Email,String Address1,String Address2,
                                       String City,String zip,String note,String id,String number,String fax,String state) {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Genderl Infomation Add Success");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuOrganization();
        AdminMenuPage.clickMenuGeneralInformation();

        General_Information.GenterlInformationEditMethad(Name,Phone,Email,Address1,City,zip,note,id,number,fax,Address2,state);

        extentTest.log(LogStatus.PASS, "Gender Information Add Success");
//        softAssert.assertTrue(RegistionPage.isLoginPageDisplayed(), "Registion  is not Displayed");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
