package com.sgic.automation.orangehrm.tests.AdminTest;


import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LocationsData;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.Locations;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogationTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LogationTest.class);
    @Test(priority = 13, dataProvider = "Location", dataProviderClass = LocationsData.class)
    public void SaveJobTitleTest(String name,String cuntry,String state,String city,String address,String zip,String phone,String fax,String note) {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest("Location Page test");
        AdminMenuPage.clickAdmin();
        extentTest.log(LogStatus.PASS, "Location Admin Menu Page Click");
        AdminMenuPage.clickMenuOrganization();
        extentTest.log(LogStatus.PASS, "Location Admin MenuOrganization Page Click");
        AdminMenuPage.ClickLocations();
        extentTest.log(LogStatus.PASS, "Location Admin Location Page Click");
        Locations.isLocationHeaderDisplayed();
        extentTest.log(LogStatus.PASS, "Location Admin Location Page Heder Display");
        Locations.ClickAddButton();
        extentTest.log(LogStatus.PASS, "Location Add Button Click");
        Locations.isLocationHeaderDisplayed();
        extentTest.log(LogStatus.PASS, "Location Add Location Page Heder Display");
        Locations.setFistName(name);
        extentTest.log(LogStatus.PASS, "Location Text Name");
        Locations.setCountry(cuntry);
        extentTest.log(LogStatus.PASS, "Location Text cuntry");
        Locations.setProvince(state);
        extentTest.log(LogStatus.PASS, "Location Text state");
        Locations.setCity(city);
        extentTest.log(LogStatus.PASS, "Location Text city");
        Locations.setAddress(address);
        extentTest.log(LogStatus.PASS, "Location Text address");
        Locations.setostal_Code(zip);
        extentTest.log(LogStatus.PASS, "Location Text zip");
        Locations.setPhone(phone);
        extentTest.log(LogStatus.PASS, "Location Text phone");
        Locations.setFax(fax);
        extentTest.log(LogStatus.PASS, "Location Text fax");
        Locations.setNote(note);
        extentTest.log(LogStatus.PASS, "Location Text note");
        Locations.ClickSaveButton();
        extentTest.log(LogStatus.PASS, "Location Save Button Click");

    }
}
