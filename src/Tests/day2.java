package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {


    @Test (groups={"Smoke"}, dataProvider = "getData")
    public void personalLoan (String userName) {

        System.out.println("Personal Loan Upto 5 Lakhs");
        System.out.println(userName);
    }

    @DataProvider
    public Object[] getData(){

        Object [] data = new Object[2];

        data[0] = "Deep";
        data[1] = "Nagda";
        return data;
    }
}
