package com.cbt.tests.eu2_homework;

import com.cbt.utilities.BrowserFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase06 {

    @Test
    public void testCase6() throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        Faker faker = new Faker();

        driver.get("https://www.tempmailaddress.com");

        String email = driver.findElement(By.id("email")).getText();

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.partialLinkText("Sign Up")).click();

        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys(faker.name().fullName());

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys(email);

        driver.findElement(By.cssSelector("[type='submit']")).click();

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String actualMessage = driver.findElement(By.tagName("h3")).getText();

        Assert.assertEquals(actualMessage,expectedMessage,"verifying the displayed message");

        driver.get("https://www.tempmailaddress.com");
        Thread.sleep(3000);

        WebElement ourMail = driver.findElement(By.cssSelector("table.table.table-hover>thead~tbody>tr:nth-of-type(1)"));

        Assert.assertTrue(ourMail.isDisplayed());
        ourMail.click();

        String actualSender = driver.findElement(By.id("odesilatel")).getText();
        String expectedSender = "do-not-reply@practice.cybertekschool.com";
        Assert.assertEquals(actualSender,expectedSender,"verifying the sender");

        String expectedSubject = "Thanks for subscribing to practice.cybertekschool.com!";
        String actualSubject = driver.findElement(By.id("predmet")).getText();
        Assert.assertEquals(actualSubject, expectedSubject,"verifying the subject");

        driver.quit();

    }
}
