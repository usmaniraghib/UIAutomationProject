package com.raghib.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class InvokingMultipleWindowsOrTabs {
    /*import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
	driver.findElement(withTagName("label").above());
	*/
    public static String location1 = "https://rahulshettyacademy.com/angularpractice/";
    public static String location2 = "https://rahulshettyacademy.com/";
    public static String nameBoxXPath = "//body/app-root[1]/form-comp[1]/div[1]/form[1]/div[1]/input[1]";
    public static String courseCssSelector = "a[href*='https://courses.rahulshettyacademy.com/p/']";

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        Duration duration = Duration.ofSeconds(30);
        driver.manage().timeouts().implicitlyWait(duration);
        driver.manage().timeouts().pageLoadTimeout(duration);

        driver.get(location1);
        driver.manage().window().maximize();

        driver.switchTo().newWindow(WindowType.TAB);
        //driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> it = windowId.iterator();
        String parentWindowId = it.next();
        String childWindowId = it.next();

        driver.switchTo().window(childWindowId);

        driver.get(location2);
        String courseName = driver.findElements(By.cssSelector(courseCssSelector)).get(1).getText();
        System.out.println("courseName : "+courseName);

        driver.switchTo().window(parentWindowId);

        driver.findElement(By.xpath(nameBoxXPath)).sendKeys(courseName);

        Thread.sleep(5000);
        driver.quit();
    }
}
