package com.cbt.tests.eu2_homework;

import com.cbt.utilities.BrowserFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCases1to5 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = BrowserFactory.getDriver("chrome");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

    @Test
    public void testCase1() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[name='birthday']")).sendKeys("wrong_dob");

        String expectedText = "The date of birth is not valid";

        String actualText = driver.findElement(By.xpath("//*[text()='The date of birth is not valid']")).getText();

        Assert.assertEquals(actualText, expectedText, "verify that we have The date of birth is not valid");
    }

    @Test
    public void testCase2() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        Thread.sleep(2000);

        List<WebElement> checkboxElements = driver.findElements(By.cssSelector(".form-check-label"));
        for (WebElement c : checkboxElements) {
            Assert.assertTrue(c.isDisplayed());
        }

    }

    @Test
    public void testCase3() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("A");

        String expectedText = "first name must be more than 2 and less than 64 characters long";

        String actualText = driver.findElement(By.xpath("(//small[contains(text(),'first name must be')])[1]")).getText();

        Assert.assertEquals(actualText, expectedText, "verifying the text");
    }

    @Test
    public void testCase4() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("A");

        String expectedText = "The last name must be more than 2 and less than 64 characters long";

        String actualText = driver.findElement(By.xpath("(//small[contains(text(),'The last name must be')])[1]")).getText();

        Assert.assertEquals(actualText, expectedText, "verifying the text");
    }

    @Test
    public void testCase5() throws InterruptedException {

        Faker faker = new Faker();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Registration Form")).click();
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.cssSelector("[name='firstname']"));
        firstName.sendKeys(faker.name().firstName());
        WebElement lastName = driver.findElement(By.cssSelector("[name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement userName = driver.findElement(By.cssSelector("[name='username']"));
        userName.sendKeys(faker.name().firstName()+"2"+faker.name().lastName());
        WebElement email = driver.findElement(By.cssSelector("[name='email']"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement password = driver.findElement(By.cssSelector("[name='password']"));
        password.sendKeys(faker.internet().password());
        WebElement phoneNumber = driver.findElement(By.cssSelector("[name='phone']"));
        phoneNumber.sendKeys("122-987-3456");

        driver.findElement(By.cssSelector("[value='male']")).click();

        WebElement dateOfBirth = driver.findElement(By.cssSelector("[name='birthday']"));
        dateOfBirth.sendKeys("12/23/1980");

        WebElement department = driver.findElement(By.cssSelector("[name='department']"));
        Select selectDepartment = new Select(department);
        selectDepartment.selectByValue("MCTC");

        WebElement jobTitle = driver.findElement(By.cssSelector("[name='job_title']"));
        Select selectJobTitle = new Select(jobTitle);
        selectJobTitle.selectByIndex(4);

        WebElement progLang = driver.findElement(By.id("inlineCheckbox2"));
        progLang.click();

        WebElement signUp = driver.findElement(By.cssSelector(".btn"));
        signUp.click();

        String expectedText = "You've successfully completed registration!";
        String actualText = driver.findElement(By.xpath("//p")).getText();

        Assert.assertEquals(actualText,expectedText,"verify the displayed text");


    }






}
