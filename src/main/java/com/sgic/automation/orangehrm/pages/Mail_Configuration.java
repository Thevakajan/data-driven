package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Mail_Configuration extends PageBase {
    private  static final Logger LOGGER = Logger.getLogger(Mail_Configuration.class);
    private static By btnEdit= By.id("editBtn");
    private static By Mail_Sent = By.id("emailConfigurationForm_txtMailAddress");
    private static By Path_to_Sendmail = By.id("emailConfigurationForm_txtSendmailPath");
    private static By checkbox_Send_Test_Email= By.id("emailConfigurationForm_chkSendTestEmail");
    private static By Test_Email_Address= By.id("emailConfigurationForm_txtTestEmail");


    public static void ClickEditButton(){
        getDriver().findElement(btnEdit).click();
        LOGGER.info("Button_Edit_Button_Click*** ");
    }
    public static void setmail_sent(String mailsent) {
        getDriver().findElement(Mail_Sent).sendKeys(mailsent);
        LOGGER.info("Typeing Mail Sent As");
    }
    public static void setPath_to_send_mail(String p_mailsent) {
        getDriver().findElement(Path_to_Sendmail).sendKeys(p_mailsent);
        LOGGER.info("Path to Sendmail");
    }
    public static void ClickCheckBox(){
        getDriver().findElement(checkbox_Send_Test_Email).click();
        LOGGER.info("Button_Send Test Email_Click*** ");
    }
    public static void setTest_Email_Address(String Address) {
        getDriver().findElement(Test_Email_Address).sendKeys(Address);
        LOGGER.info("Path to Sendmail");
    }

    public static void MailConfiguration(String mailsentas, String PathMail, String TestEmail){
        Mail_Configuration.ClickEditButton();
        Mail_Configuration.setmail_sent(mailsentas);
        Mail_Configuration.setPath_to_send_mail(PathMail);
        Mail_Configuration.ClickCheckBox();
        PageBase.implicitWait(2);
        Mail_Configuration.setTest_Email_Address(TestEmail);
        Mail_Configuration.ClickEditButton();
    }
}
