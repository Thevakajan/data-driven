package com.sgic.automation.orangehrm.TestData;


import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class Organization_Structure_Data extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(ClientData.class);

    public Organization_Structure_Data() {
        super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");
    }
    @DataProvider
    public Object[][] Structure_Data() {

        int rows = getRowCount("Structure_Data_Xl");
        int col = getColumnCount("Structure_Data_Xl");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("LocationsX", i, j);
            }
        }
        return data;
    }
}
