package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class EmployeeAttendanceInOut extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(EmployeeAttendanceInOut.class);


    private static By empTimeBtn = By.xpath("//*[@id=\"menu_time_viewTimeModule\"]/b");
    private static By empAttendBtn = By.id("menu_attendance_Attendance");
    private static By empInOut = By.id("menu_attendance_punchIn");
    private static By InBtn = By.id("btnPunch");
    private static By OutBtn = By.id("btnPunch");

    /**
     * addAttendance
     */

    public static boolean employeeTimeBtnDisplay(){return getDriver().findElement(empTimeBtn).isDisplayed();}

    public static void employeenameTimeBtnClick(){getDriver().findElement(empTimeBtn).click();
        LOGGER.info("Employee Time Button clicked");}
    public static void employeeAttendanceBtnClick(){getDriver().findElement(empAttendBtn).click();
        LOGGER.info("Employee Attendance Button click ");}

    public static void employeeAttendanceInOutClick(){getDriver().findElement(empInOut).click();
        LOGGER.info("Employee Attendance InOut Button click ");}
    public static void employeeAttendanceInBtnClick(){getDriver().findElement(InBtn).click();
        LOGGER.info("Employee In Button Clicked ");}
    public static void employeeAttendanceOutBtnClick(){getDriver().findElement(OutBtn).click();
        LOGGER.info("Employee Out Button Clicked ");}
}

