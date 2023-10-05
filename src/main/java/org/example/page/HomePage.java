package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Método genérico llamado clickLink
    //Método genérico que usaremos para todos nuestros enlaces.
    private void clickLink(String textLink){
        driver.findElement(By.linkText(textLink)).click();
    }

    public LoginPage clickFormAuthentication(){
        //driver.findElement(formAuthenticationLink).click(); // Esto encontrará el elemento web.
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    //
    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }




}
