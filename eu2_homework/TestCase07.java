package com.cbt.tests.eu2_homework;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase07 {

    @Test
    public void TestCase(){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.linkText("File Upload")).click();
        WebElement chooseFile = driver.findElement(By.cssSelector("input[name='file']"));

        chooseFile.sendKeys("C:\\Users\\patri\\OneDrive\\Escritorio\\New folder\\Summary.txt");

        driver.findElement(By.id("file-submit")).click();

        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "File Uploaded!");

        Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "Summary.txt");

        driver.quit();
    }



}
