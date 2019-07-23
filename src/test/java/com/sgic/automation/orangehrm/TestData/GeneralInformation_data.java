package com.sgic.automation.orangehrm.TestData;


import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class GeneralInformation_data extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(GeneralInformation_data.class);

    public GeneralInformation_data() {
        super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");
    }

    @DataProvider(name = "GenderalInformation")
    public Object[][] GenderalInformation() {

        int rows = getRowCount("GeneralInformation");
        int col = getColumnCount("GeneralInformation");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("GeneralInformation", i, j);
            }
        }
        return data;
    }
}
