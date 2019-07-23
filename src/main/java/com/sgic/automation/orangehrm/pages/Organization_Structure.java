package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Organization_Structure extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(Organization_Structure.class);
    private static By Organization_Structure_Header = By.xpath("//h1");
    private static By EditButton = By.id("btnEdit");
    private static By AButton = By.id("treeLink_addChild_1");
    private static By U_Id = By.id("txtUnit_Id");
    private static By Name = By.id("txtName");
    private static By Description = By.id("txtDescription");
    private static By Save = By.id("btnSave");


    public static boolean isOrganization_Structure_Header(){

        return getDriver().findElement(Organization_Structure_Header).isDisplayed();
    }
    public static void ClickEditButton(){
        getDriver().findElement(EditButton).click();
        LOGGER.info("Button_Edit_Button_Click*** ");
    }
    public static void ClickA_Button(){
        getDriver().findElement(AButton).click();
        LOGGER.info("Button_A_Button_Click*** ");
    }
    public static void setU_Id(String txid) {
        getDriver().findElement(U_Id).sendKeys(txid);
        LOGGER.info(" Send Key ID");
    }
    public static void setname(String txname) {
        getDriver().findElement(Name).sendKeys(txname);
        LOGGER.info(" Send Key Name");
    }
    public static void setDescription(String txDescription) {
        getDriver().findElement(Description).sendKeys(txDescription);
        LOGGER.info(" Send Key Name");
    }
    public static void ClickSave(){
        getDriver().findElement(Save).click();
        LOGGER.info("Button_Save_Button_Click*** ");
    }
    public static void Organization_Structure(String id, String name, String Dc){
        Organization_Structure.ClickEditButton();
        Organization_Structure.ClickA_Button();
        Organization_Structure.setU_Id(id);
        Organization_Structure.setname(name);
        Organization_Structure.setDescription(Dc);
        Organization_Structure.ClickSave();
    }
}
