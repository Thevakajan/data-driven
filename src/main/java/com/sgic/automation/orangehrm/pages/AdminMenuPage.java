package com.sgic.automation.orangehrm.pages;


import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;



public class AdminMenuPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AdminMenuPage.class);
    private static By btnAdmin=By.id("menu_admin_viewAdminModule");
    private static By btnJobMenu=By.id("menu_admin_Job");
    private static By btnJobtitle=By.id("menu_admin_viewJobTitleList");
    private static By btnJPayGrades=By.id("menu_admin_viewPayGrades");
    private static By btnEmployeeStatus=By.id("menu_admin_employmentStatus");
    private static By btnJobCategories=By.id("menu_admin_jobCategory");
    private static By btnWorkShift=By.id("menu_admin_workShift");
    private static By MenuOrganization=By.id("menu_admin_Organization");
    private static By MenuGeneralInformation=By.id("menu_admin_viewOrganizationGeneralInformation");
    private static By MenuQualifications=By.id("menu_admin_Qualifications");
    private static By MenuSkills=By.id("menu_admin_viewSkills");
    private static By MenuEducation=By.id("menu_admin_viewEducation");
    private static By MenuLicenses=By.id("menu_admin_viewLicenses");
    private static By MenuLanguages=By.id("menu_admin_viewLanguages");
    private static By MenuMemberships=By.id("menu_admin_membership");
    private static By MenuNationalities=By.id("menu_admin_nationality");
    private static By MenuConfiguration=By.id("menu_admin_Configuration");
    private static By MenuEmail_c_m=By.id("menu_admin_listMailConfiguration");
    private static By MenuregisterOAuthClient=By.id("menu_admin_registerOAuthClient");
    private static By MenuLocations=By.id("menu_admin_viewLocations");
    private static By MenuStructure=By.id("menu_admin_viewCompanyStructure");
    public static void ClickMenuStructure(){
        getDriver().findElement(MenuStructure).click();
        LOGGER.info("Button_MenuLocations_Click*** ");
    }

    //admim Menu Click Theva Test Cash script

    public static void ClickLocations(){
        getDriver().findElement(MenuLocations).click();
        LOGGER.info("Button_MenuLocations_Click*** ");
    }
    public static void ClickregisterOAuthClient(){
        getDriver().findElement(MenuregisterOAuthClient).click();
        LOGGER.info("Button_MenuregisterOAuthClient_Click*** ");
    }
    public static void ClickMenuConfiguration(){
        getDriver().findElement(MenuConfiguration).click();
        LOGGER.info("Button_MenuConfiguration_Click*** ");
    }
    public static void ClickMenuEmail_Config(){
        getDriver().findElement(MenuEmail_c_m).click();
        LOGGER.info("Button_MenuEmail_Subscriptions ");
    }
//    public static void ClickMenuLocalization(){
//        getDriver().findElement(MenuLocalization).click();
//        LOGGER.info("Button_MenuLocalization ");
//    }
    public static void ClickMenuMembership(){
        getDriver().findElement(MenuMemberships).click();
        LOGGER.info("Button_MenuMemberships_Click*** ");
    }
    public static void ClickMenuNationalities(){
        getDriver().findElement(MenuNationalities).click();
        LOGGER.info("Button_Menu_Nationalities_Click*** ");
    }
    public static void ClickMenuLicenses(){
        getDriver().findElement(MenuLicenses).click();
        LOGGER.info("Button_MenuLicenses_Click*** ");
    }
    public static void ClickMenuLanguages(){
        getDriver().findElement(MenuLanguages).click();
        LOGGER.info("Button_MenuLanguages_Click*** ");
    }
    public static void ClickMenuEducation(){
        getDriver().findElement(MenuEducation).click();
        LOGGER.info("Button_MenuEducation_Click*** ");
    }
    public static void ClickMenuSkills(){
        getDriver().findElement(MenuSkills).click();
        LOGGER.info("Button_MenuSkill_Click*** ");
    }
    public static void clickMenuOrganization(){
        getDriver().findElement(MenuOrganization).click();
        LOGGER.info("Button_Menu_Organization_Click*** ");
}
    public static void clickMenuQualifications(){
        getDriver().findElement(MenuQualifications).click();
        LOGGER.info("Button_MenuQualifications_Click*** ");
    }
    public static void clickMenuGeneralInformation(){
        getDriver().findElement(MenuGeneralInformation).click();
        LOGGER.info("Button_MenuGeneralInformation_Click*** ");
    }
    public static void clickAdmin(){
        getDriver().findElement(btnAdmin).click();
        LOGGER.info("Button_Add_Button_Click*** ");
    }
    public static void clickJobMenu(){
        getDriver().findElement(btnJobMenu).click();
        LOGGER.info("Button_JobMenu_Button_Click*** ");
    }
    public static void clickJobTitle(){
        getDriver().findElement(btnJobtitle).click();
        LOGGER.info("Button_JobTitle_Button_Click*** ");
    }
    public static void clickJPayGrades(){
        getDriver().findElement(btnJPayGrades).click();
        LOGGER.info("Button_Jobpaygrades_Button_Click*** ");
    }
    public static void clickEmployeeStatus(){
        getDriver().findElement(btnEmployeeStatus).click();
        LOGGER.info("Button_EmployeesStatus_Button_Click*** ");
    }
    public static void clickJobCategories(){
        getDriver().findElement(btnJobCategories).click();
        LOGGER.info("Button_JobCategories_Button_Click*** ");
    }
    public static void clickWorkShift(){
        getDriver().findElement(btnWorkShift).click();
        LOGGER.info("Button_WorkShit_Button_Click*** ");
    }


}

