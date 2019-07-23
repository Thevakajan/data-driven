package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.testng.annotations.DataProvider;

public class KPIsData {


//    @DataProvider
//    public Object[][] KPIAdd() {
//        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\OrangeHrm.xlsx");
//        int rows = exConfig.getRowCount(1);

//
//        Object[][] data = new Object[1][4];
//        for (int i = 1; i < rows; i++) {
//            data[0][0] = exConfig.getData("KPI", i, 0);
//            data[0][1] = exConfig.getData("KPI", i, 1);
//            data[0][2] = exConfig.getData("KPI", i, 2);
//            data[0][3] = exConfig.getData("KPI", i, 3);
//
//        }
//        return data;
//    }

    @DataProvider
    public Object[][] KPIAdd() {
        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\OrangeHrm.xlsx");
        int rows = exConfig.getRowCount("KPI");

        Object[][] data = new Object[1][4];
        for (int i = 1; i < rows; i++) {
            data[0][0] = exConfig.getData("KPI", i, 0);
            data[0][1] = exConfig.getData("KPI", i, 1);
            data[0][2] = exConfig.getData("KPI", i, 2);
            data[0][3] = exConfig.getData("KPI", i, 3);

        }
        return data;
    }

}
