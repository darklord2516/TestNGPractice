package Tests;

import org.testng.annotations.Test;

public class day4 {

    @Test(groups={"Smoke"}, enabled = true)
    public void WebLoginHomeLoan () {
        System.out.println("Website Login for Home Loan");
    }

    @Test
    public void MobileLoginHomeLoan() {
        System.out.println("Mobile Login for Home Loan");
    }

    @Test
    public void APILoginHomeLoan() {
        System.out.println("API Login for Home Loan");
    }

}
