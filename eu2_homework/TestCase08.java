package com.cbt.tests.eu2_homework;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase08 {

    @Test
    public void test(){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.linkText("Autocomplete")).click();
        driver.findElement(By.cssSelector("#myCountry")).sendKeys("United States of America");
        driver.findElement(By.cssSelector(".btn")).click();
        String actualResult = driver.findElement(By.cssSelector("#result")).getText();
        String expextedResult = "You selected: United States of America";

        Assert.assertEquals(actualResult, expextedResult,"verifying the message");


    }
}
