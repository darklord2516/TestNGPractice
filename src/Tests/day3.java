package Tests;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

    @Parameters({"URL"})
    @Test(groups={"Smoke"})
    public void WebLoginCarLoan (String siteURL) {
        System.out.println("Website Login for Car Loan");
        System.out.println(siteURL);
    }

    @Test
    public void MobileLoginCarLoan() {
        System.out.println("Mobile Login for Car Loan");
    }

    @Test
    public void APILoginCarLoan() {
        System.out.println("API Login for Car Loan");
    }
}
