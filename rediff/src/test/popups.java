package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popups {
	
	@Test
	public void TestPopups() throws Exception {

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	    driver.findElement(By.name("proceed")).click(); // click on Go btn
	    Thread.sleep(5000);

	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());

	    String text = alert.getText();

	    if (text.equals("Please enter a valid user name")) {
	        System.out.println("correct alert messg");
	    } else {
	        System.out.println("in-correct alert messg");
	    }

	    alert.accept(); // click on OK btn
	    // alert.dismiss(); //click on cancel btn
	}

}
