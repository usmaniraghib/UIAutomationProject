package com.raghib.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
//import java.util.concurrent.TimeUnit;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPage {
    /*
Navigate to the interested webpage for e.g. www.amazon.com

Collect all the links from the webpage. All the links are associated with the Tag ‘a‘
 */

    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get(url);
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));

        int size = links.size();

        System.out.println("Size of a tag : "+size);

        Thread.sleep(5000);
        driver.quit();
    }
}
