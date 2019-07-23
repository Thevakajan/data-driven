package com.sgic.automation.orangehrm.TestData;


import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class LocationsData extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(ClientData.class);

    public LocationsData() {
        super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");
    }
    @DataProvider
    public Object[][] Location() {

        int rows = getRowCount("LocationsX");
        int col = getColumnCount("LocationsX");


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
