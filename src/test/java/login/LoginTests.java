package login;

import base.BaseTests;
import org.example.page.LoginPage;
import org.example.page.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccesfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.userName("tomsmith");
        loginPage.userPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButoon();
        //AssertEquals:
        assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area!\n" +
                "×","Error enb el mensaje");
        System.out.println(secureAreaPage.getAlertText());
        //AssertTrue:
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!\n" +
                "×"),"Error enb el mensaje");
        System.out.println(secureAreaPage.getAlertText());

    }


}
