package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class General_Information extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(General_Information.class);
    private static By txtEmail = By.id("organization_email");
    private static By txtAddress1 = By.id("organization_street1");
    private static By txtCity = By.id("organization_city");
    private static By txtzip = By.id("organization_zipCode");
    private static By txtNote = By.id("organization_zipCode");
    private static By txtid = By.id("organization_taxId");
    private static By txtRgNumber = By.id("organization_registraionNumber");
    private static By txtfax = By.id("organization_fax");
    private static By txtAddress2 = By.id("organization_street2");
    private static By txtState = By.id("organization_province");
    private static By EditButton = By.id("btnSaveGenInfo");
    public static void ClickEdit(){
        getDriver().findElement(EditButton).click();
        LOGGER.info("Button_Edit_Click*** ");
    }
    private  static By ComboboxCountry=By.xpath("//*[@id=\"organization_country\"]/option[201]");
    public static void ClickCountry(){
        getDriver().findElement(ComboboxCountry).click();
        LOGGER.info("Button_Country_Click*** ");
    }

    public static void setState(String State) {
        getDriver().findElement(txtState).clear();
        getDriver().findElement(txtState).sendKeys(State);
        LOGGER.info("Typeing State");
    }
    public static void setAddresss2(String Address2) {
        getDriver().findElement(txtAddress2).clear();
        getDriver().findElement(txtAddress2).sendKeys(Address2);
        LOGGER.info("Typeing Address2");
    }
    public static void setfax(String fax) {
        getDriver().findElement(txtfax).clear();
        getDriver().findElement(txtfax).sendKeys(fax);
        LOGGER.info("Typeing Fax");
    }
    public static void setRgNummber(String RgNumber) {
        getDriver().findElement(txtRgNumber).clear();
        getDriver().findElement(txtRgNumber).sendKeys(RgNumber);
        LOGGER.info("Typeing Number");
    }
    public static void setid(String id) {
        getDriver().findElement(txtid).clear();
        getDriver().findElement(txtid).sendKeys(id);
        LOGGER.info("Typeing note");
    }
    public static void setnote(String note) {
        getDriver().findElement(txtNote).clear();
        getDriver().findElement(txtNote).sendKeys(note);
        LOGGER.info("Typeing note");
    }
    public static void setzip(String zip) {
        getDriver().findElement(txtzip).clear();
        getDriver().findElement(txtzip).sendKeys(zip);
        LOGGER.info("Typeing zip");
    }

    public static void setEmail(String Email) {
        getDriver().findElement(txtEmail).clear();
        getDriver().findElement(txtEmail).sendKeys(Email);
        LOGGER.info("Typeing Email");
    }
    public static void setCity(String City) {
        getDriver().findElement(txtCity).clear();
        getDriver().findElement(txtCity).sendKeys(City);
        LOGGER.info("Typeing City");
    }
    public static void setTxtAddress1(String Address) {
        getDriver().findElement(txtAddress1).clear();
        getDriver().findElement(txtAddress1).sendKeys(Address);
        LOGGER.info("Typeing Address1");
    }

    private static By Editdelete= By.id("btnDelete");
    public static void ClickDeleteButton(){
        getDriver().findElement(EditButton).click();
        LOGGER.info("Button_Delete_Button_Click*** ");
    }
    private static By txtOrganizationName = By.id("organization_name");
    public static void setOrganizationName(String name) {
        getDriver().findElement(txtOrganizationName).clear();
        getDriver().findElement(txtOrganizationName).sendKeys(name);
        LOGGER.info("Typeing Employee Name");
    }
    private static By txtPhone = By.id("organization_phone");
    public static void setphone(String phone) {
        getDriver().findElement(txtPhone).clear();
        getDriver().findElement(txtPhone).sendKeys(phone);
        LOGGER.info("Typeing Phone Name");
    }

    public static void GenterlInformationEditMethad(String Name, String Phone, String Email, String Address1, String Address2,
                                                    String City, String zip, String note, String id, String number, String fax, String state){

        General_Information.ClickEdit();
        General_Information.setOrganizationName(Name);
        General_Information.setphone(Phone);
        General_Information.setEmail(Email);
        General_Information.setTxtAddress1(Address1);
        General_Information.setzip(zip);
        General_Information.setCity(City);
        General_Information.setnote(note);
        General_Information.setid(id);
        General_Information.setRgNummber(number);
        General_Information.setfax(fax);
        General_Information.setAddresss2(Address2);
        General_Information.setState(state);
        General_Information.ClickCountry();
        General_Information.ClickEdit();
}
}
