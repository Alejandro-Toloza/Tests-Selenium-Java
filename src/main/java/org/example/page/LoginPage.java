package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userNameField = By.id("username");
    private By userPasswordField = By.id("password");
    private By loginButton  = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userName(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void userPassword(String password){
        driver.findElement(userPasswordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButoon(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

}
