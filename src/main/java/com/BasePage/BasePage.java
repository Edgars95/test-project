package com.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BasePage {

    //
    private static WebDriverWait wait;

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // maximize window for browser
        //driver.manage().window().maximize();

        //
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open web page
        driver.get("https://boardgamegeek.com");

        // click on a button from the web page
        WebElement acceptCookiesButton = driver.findElement(By.cssSelector("button[class*='fc-button fc-cta-consent fc-primary-button']"));
        // Click on the "I'm OK with that" button
        acceptCookiesButton.click();

        // click on a second button from the web page
        WebElement additionalButton = driver.findElement(By.cssSelector("button[class*='c-bn']"));
        //click on additional cookie button
        additionalButton.click();

        //Toggle menu button
        WebElement ToggleMenu = driver.findElement(By.cssSelector("button[class*='btn btn-empty header-icon tw-mr-2 tw-self-center tw-rounded tw-p-1.5 tw-leading-none" +
                " tw-outline-none hover:tw-bg-purple-dark hover:tw-text-white focus:tw-bg-purple-dark focus:tw-text-white xl:tw-hidden']"));
        ToggleMenu.click();

        //choose primary game from the list

        //closing web browser
        driver.quit();


    }
}