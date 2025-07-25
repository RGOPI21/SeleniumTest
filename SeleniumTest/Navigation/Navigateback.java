package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateback {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        driver.navigate().to("https://login.yahoo.com/");
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        
        driver.navigate().back();
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        driver.quit();
    }
}

