package com.cbt.tests.eu2_homework;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestCases9_12 {

    @DataProvider(name = "test1")
    public Object [][] createData(){
        return new Object [][] {{"200"},{"301"},{"404"},{"500"}};
    }

    @Test (dataProvider = "test1")
    public void testCase9to12(String str){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Status Codes")).click();

        driver.findElement(By.linkText(str)).click();
        String result = driver.findElement(By.xpath("//p")).getText();

        driver.quit();

        Assert.assertTrue(result.contains(str));
    }

}
