package com.BasePage;

import io.opentelemetry.sdk.internal.AttributesMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class BasePage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // maximize window for browser
        //driver.manage().window().maximize();

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


        List<WebElement> divElement = driver.findElements(By.xpath("/html/body/gg-app/div/main/div/gg-sidebar/div/div[3]"));
//*[@id="mainbody"]/div/gg-sidebar/div/div[3]
        divElement.get(0).click();

        // WebElement DivElement = driver.findElement(By.className("tw-flex-1"));
       // DivElement.click();

        //closing web browser
        //driver.quit();


    }
}