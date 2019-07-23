package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import java.io.File;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
/*
@Author Jenisha
verify data import page functions
 */
public class DataImportPage extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(DataImportPage.class);
  private static By dataImport=By.id("menu_admin_pimCsvImport");
  private static By dataImportHeading=By.id("pimCsvImportHeading");
  private static By chooseFile=By.id("pimCsvImport_csvFile");
 // private static By download=By.xpath("//*[@id=\"frmPimCsvImport\"]/fieldset/ul/li[7]/a");
  private static By upload=By.id("btnSave");
  private static By verifyUpload=By.xpath("//*[@id=\"pimCsvImport\"]/div[2]/script");

  public static void dataImportPage(){

    getDriver().findElement(dataImport).click();
    LOGGER.info("Data import page clicked");
  }
  public static boolean isDataImportDisplayed(){
    return getDriver().findElement(dataImportHeading).isDisplayed();
  }

  public static void fileUpload(String fileName){
    getDriver().findElement(chooseFile).sendKeys(PageBase.uploadFilepath+ File.separator+ fileName);
    LOGGER.info("File Choose");
  }



  public static void clickUpload(){

    getDriver().findElement(upload).click();
    LOGGER.info("File uploaded");
  }

//  public static boolean verifyFileUpload(){
//    return getDriver().findElement(verifyUpload).getText();
//  }
public static String verifyFileUpload() {

    return getDriver().findElement(verifyUpload).getText();

}




}
