package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Add_OAuth_Client extends PageBase {
    private  static final Logger LOGGER = Logger.getLogger(Add_OAuth_Client.class);
    private static By ID = By.id("oauth_client_id");
    private static By Secret = By.id("oauth_client_secret");
    private static By Redirect_URI = By.id("oauth_redirect_uri");
    private static By Save = By.id("btnSave");

    public static void ClickSave(){
        getDriver().findElement(Save).click();
        LOGGER.info("Button_Save_Button_Click ");
    }
    public static void setid(String id) {
        getDriver().findElement(ID).sendKeys(id);
        LOGGER.info("Typeing ID");
    }
    public static void setSecret(String secret ) {
        getDriver().findElement(Secret ).sendKeys(secret );
        LOGGER.info("Typeing Secret ");
    }
    public static void setRedirect_URI(String RedirectURI ) {
        getDriver().findElement(Redirect_URI ).sendKeys(RedirectURI );
        LOGGER.info("Typeing Redirect_URI ");
    }

    public static void Client(String id, String serete, String url){
        Add_OAuth_Client.setid(id);
        Add_OAuth_Client.setSecret(serete);
        Add_OAuth_Client.setRedirect_URI(url);
    }

}
