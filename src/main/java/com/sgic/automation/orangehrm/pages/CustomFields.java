package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * @Author Jenisha
 */

public class CustomFields extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(CustomFields.class);
  private static By customFieldHeading=By.xpath("//*[@id=\"heading\"]");
  private static By getCustomFieldDeleteHeading=By.xpath("//*[@id=\"customFieldListPane\"]/div[1]/h1");
  private static By customField=By.id("menu_pim_listCustomFields");
  private static By addBtn=By.id("buttonAdd");
  private static By fieldName1=By.id("customField_name");
  private static By screen1 =By.id("customField_screen");
  private static By type1 =By.id("customField_type");
  private static By save =By.id("btnSave");
  private static By addConfirmation=By.xpath("//*[@id=\"customFieldList\"]/tbody/tr[1]/td[2]/a");
  private static By selectOne =By.xpath("//*[@id=\"customFieldList\"]/tbody/tr/td[1]");
  private static By delete =By.id("buttonRemove");
  private static By okBtn=By.id("dialogDeleteBtn");
  private static By selectCustomField=By.xpath("//*[@id=\"customFieldList\"]/tbody/tr/td[2]/a");



  /*
  Click custom field
   */
  public static void clickCustomField(){

    getDriver().findElement(customField).click();
    LOGGER.info("Custom Fields page clicked");
  }
  public static void clickAddBtn(){

    getDriver().findElement(addBtn).click();
    LOGGER.info("Add button clicked");
  }

  /*
  verify custom field
   */
  public static boolean isCustomFieldDisplay(){

    return getDriver().findElement(customFieldHeading).isDisplayed();
  }
  /*
  Type field name method
   */
  public static void setFieldName(String fieldName) {
    getDriver().findElement(fieldName1).sendKeys(fieldName);
    LOGGER.info("Type field name");
  }

  /*
  Screen drop down method
   */
  public static boolean isScreenDropDownDisplayed() {
    return getDriver().findElement(screen1).isDisplayed();
  }

  public static String getSelectedOption() {
    Select dropDownOption = new Select(getDriver().findElement(screen1));
    return dropDownOption.getFirstSelectedOption().getText();
  }


  public static void setScreenDropDownOption(String screen) {
    Select screenDropDownOption = new Select(getDriver().findElement(screen1));
    screenDropDownOption.selectByVisibleText(screen);
    LOGGER.info("Select screen drop down option");
  }

  // Type dropdown method
  public static boolean isTypeDropDownDisplayed() {
    return getDriver().findElement(type1).isDisplayed();
  }
  public static String getTypeDropDownOption() {
    Select dropDownOption = new Select(getDriver().findElement(type1));
    return dropDownOption.getFirstSelectedOption().getText();
  }

  public static void setTypeDropDownOption(String type) {
    Select screenDropDownOption = new Select(getDriver().findElement(type1));
    screenDropDownOption.selectByVisibleText(type);
    LOGGER.info("Select type drop down option");
  }
  /*
  Save Details
   */
  public static void clickSave(){

    getDriver().findElement(save).click();
    LOGGER.info("save button clicked");
  }
  public static void addCustomFieldForm(String fieldName, String screen, String type){
    CustomFields.setFieldName(fieldName);
    CustomFields.setScreenDropDownOption(screen);
    CustomFields.setTypeDropDownOption(type);
    LOGGER.info("Custom Fields added");
  }

  public static boolean isAddConfirmationDisplay(){

    return getDriver().findElement(addConfirmation).isDisplayed();
  }
  public static void clickBtn(){

    getDriver().findElement(fieldName1).click();
    LOGGER.info("Add button clicked");
  }
  public static void clickSelectOne(){

    getDriver().findElement(selectOne).click();
    LOGGER.info("Select one option");
  }
  public static void clickDeleteBtn(){

    getDriver().findElement(delete).click();
    LOGGER.info("Delete one Custom field name");
  }
  public static void clickOkBtn(){

    getDriver().findElement(okBtn).click();
    LOGGER.info("Ok button for delete clicked");
  }

  public static boolean isDeleteCustomFieldDisplay(){

    return getDriver().findElement(getCustomFieldDeleteHeading).isDisplayed();
  }
  public static void clickSelectCustomField(){

    getDriver().findElement(selectCustomField).click();
    LOGGER.info("One custom field name clicked");
  }

  public static void clearFieldName(){

    getDriver().findElement(fieldName1).clear();
    LOGGER.info("Field name cleared");
  }





}
