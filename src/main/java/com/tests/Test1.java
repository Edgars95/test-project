package com.tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//šis ir jaunais tests!!

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Open web page
        driver.get("https://boardgamegeek.com");

        // define a button from the web page
        WebElement acceptCookiesButton = driver.findElement(By.cssSelector("button[class*='fc-button fc-cta-consent fc-primary-button']"));
        // Click on the "I'm OK with that" button
        acceptCookiesButton.click();

        //Define a second button from the web page
        WebElement additionalButton = driver.findElement(By.cssSelector("button[class*='c-bn']"));
        //click on additional button
        additionalButton.click();

        //Toggle menu button from the web page
        WebElement ToggleMenu = driver.findElement(By.cssSelector("button[class*='btn btn-empty header-icon tw-mr-2 tw-self-center tw-rounded tw-p-1.5 tw-leading-none tw-outline-none hover:tw-bg-purple-dark hover:tw-text-white focus:tw-bg-purple-dark focus:tw-text-white xl:tw-hidden']"));
        //click on additional button
        ToggleMenu.click();


        //kāpēc web page refrešojas un kā to apstadināt + kā uztaisīt taimeri katrai darbībai, vai kā to sauc?
        //closing web browser
        //driver.quit();


    }
}