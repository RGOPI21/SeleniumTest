package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // OrangeHRM URL
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source Length: " + driver.getPageSource());

        // OpenCart URL
        driver.navigate().to("https://demo.opencart.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source Length: " + driver.getPageSource());

        // Navigate Back
        driver.navigate().back();
        System.out.println("Navigated back to Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Navigate Forward
        driver.navigate().forward();
        System.out.println("Navigated forward to Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Bing URL
        driver.navigate().to("http://www.bing.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source Length: " + driver.getPageSource());

        // Refresh Bing
        driver.navigate().refresh();
        System.out.println("Refreshed Page Title: " + driver.getTitle());
        System.out.println("Current URL after Refresh: " + driver.getCurrentUrl());

        // FreeCRM URL
        driver.navigate().to("https://www.freecrm.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source Length: " + driver.getPageSource());

        // Half.ebay.com URL
        driver.navigate().to("http://www.half.ebay.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source Length: " + driver.getPageSource());

        // Close the browser
        driver.quit();
    }
}
