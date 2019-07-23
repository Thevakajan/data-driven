package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Locations extends PageBase {
    private  static final Logger LOGGER = Logger.getLogger(Add_License.class);
    private static By JobLocationHeader = By.xpath("//h1");
    private static By AddButton = By.id("btnAdd");
    private static By Name = By.id("location_name");
    private static By Country = By.id("location_country");
    private static By Province = By.id("location_province");
    private static By City = By.id("location_city");
    private static By Address = By.id("location_address");
    private static By Postal_Code = By.id("location_zipCode");
    private static By Phone = By.id("location_phone");
    private static By Fax = By.id("location_fax");
    private static By Note = By.id("location_notes");
    private static By Save = By.id("btnSave");



    public static boolean isLocationHeaderDisplayed(){

        return getDriver().findElement(JobLocationHeader).isDisplayed();
    }

    public static void setFistName(String txtName) {
        getDriver().findElement(Name).sendKeys(txtName);
        LOGGER.info(" Send Key Name");
    }
    public static void setCity(String txtCity) {
        getDriver().findElement(City).sendKeys(txtCity);
        LOGGER.info(" Send Key City");
    }
    public static void setNote(String txtNote) {
        getDriver().findElement(Note).sendKeys(txtNote);
        LOGGER.info(" Send Key City");
    }
    public static void setostal_Code(String txtostal_Code) {
        getDriver().findElement(Postal_Code).sendKeys(txtostal_Code);
        LOGGER.info(" Send Key Postal_Code");
    }
    public static void setPhone(String txtPhone) {
        getDriver().findElement(Phone).sendKeys(txtPhone);
        LOGGER.info(" Send Key Phone");
    }
    public static void setFax(String txtFax) {
        getDriver().findElement(Fax).sendKeys(txtFax);
        LOGGER.info(" Send Key Fax");
    }
    public static void setAddress(String txtAddress) {
        getDriver().findElement(Address).sendKeys(txtAddress);
        LOGGER.info(" Send Key Address");
    }
    public static void setProvince(String txtProvince) {
        getDriver().findElement(Province).sendKeys(txtProvince);
        LOGGER.info("Send Key Province ");
    }
    public static void setCountry(String txCountry) {
        getDriver().findElement(Country).sendKeys(txCountry);
        LOGGER.info(" Send Key Country");
    }
    public static void ClickSaveButton(){
        getDriver().findElement(Save).click();
        LOGGER.info("Button_Save_Button_Click*** ");
    }
    public static void ClickAddButton(){
        getDriver().findElement(AddButton).click();
        LOGGER.info("Button_AddButton_Button_Click*** ");
    }
}
