package com.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ChromeDriverTest {

    private WebDriver driver;
    private static final String URL = "https://www.tvnet.lv";
    private static final String SEARCH_QUERY = "ChromeDriver";

    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\beate\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    @Test
    public void testGoogleSearch_submitQuery() {
        driver.get(URL);

        //driver.findElement();
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}