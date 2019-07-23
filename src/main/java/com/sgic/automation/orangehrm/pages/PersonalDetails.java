package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import java.io.File;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class PersonalDetails extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(PersonalDetails.class);
  private static By personalDetailsHeading=By.xpath("//*[@id=\"pdMainContainer\"]/div[1]/h1");
  private static By LicenceNo=By.id("personal_txtLicenNo");
  private static By editBtn=By.id("btnSave");
  private static By saveBtn=By.id("btnSave");
  private static By addAttachmentBtn=By.id("btnAddAttachment");
  private static By fileUpload=By.id("ufile");
  private static By comments=By.id("txtAttDesc");
  private static By upload=By.id("btnSaveAttachment");
  private static By selectFile=By.xpath("//*[@id=\"tblAttachments\"]/tbody/tr/td[1]/input");
  private static By deleteBtn=By.id("btnDeleteAttachment");
  private static By editAttachment=By.xpath("//*[@id=\"tblAttachments\"]/tbody/tr/td[8]/a");
  private static By attachmentComment=By.id("btnCommentOnly");

  public static boolean isPersonalDetailsDisplayed(){
    return getDriver().findElement(personalDetailsHeading).isDisplayed();
  }
  public static void setLicenceNo(int num) {
    getDriver().findElement(LicenceNo).sendKeys();
    LOGGER.info("Type licence number");
  }

  public static void clickEditBtn(){
    getDriver().findElement(editBtn).click();
    LOGGER.info("Edit button clicked");
  }

  public static void clickSaveBtn(){
    getDriver().findElement(saveBtn).click();
    LOGGER.info("Save button clicked");
  }

  public static void clickAddBtn(){
    getDriver().findElement(addAttachmentBtn).click();
    LOGGER.info("Add button clicked");
  }

  public static void fileUpload(String fileName){
    getDriver().findElement(fileUpload).sendKeys(PageBase.uploadFilepath+ File.separator+ fileName);
    LOGGER.info("File Choose");
  }
  public static void setComment(String comment) {
    getDriver().findElement(comments).sendKeys(comment);
    LOGGER.info("Type comment");
  }

  public static void clickUploadBtn(){
    getDriver().findElement(upload).click();
    LOGGER.info("Upload button clicked");
  }
  public static void clickFile(){
    getDriver().findElement(selectFile).click();
    LOGGER.info("File clicked");
  }
  public static void clickDeleteBtn(){
    getDriver().findElement(deleteBtn).click();
    LOGGER.info("Delete button clicked");
  }
  public static void clickEdit(){
    getDriver().findElement(editAttachment).click();
    LOGGER.info("Edit clicked");
  }
  public static void clearComment(){
    getDriver().findElement(comments).clear();
    LOGGER.info("Comment cleared");
  }
  public static void resetComment(String comment) {
    getDriver().findElement(comments).sendKeys(comment);
    LOGGER.info("Edit comment");
  }
  public static void clickAttachmentComment(){
    getDriver().findElement(attachmentComment).click();
    LOGGER.info("Edit comment clicked");
  }








}
