package com.orangeHrm.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public void validLogin(){
        //1. Open browser
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //2. Enter valid credentials
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));

        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");

        //3. Click login
        WebElement logInButton = driver.findElement(By.tagName("button"));
        logInButton.click();

        driver.quit();


    }
}
