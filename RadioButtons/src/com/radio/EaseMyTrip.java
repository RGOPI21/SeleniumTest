package com.radio;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EaseMyTrip {

	@Test
	 public void TestRadioBtn() throws Exception {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.easemytrip.com/flights.html?msclkid=081ed1b9b7961030af2cb93eb5f683ca&utm_source=bing&utm_medium=cpc&utm_campaign=Bing_Search_AllAudience_%20Brand%20(EaseMyTrip.Com)&utm_term=easemytrip&utm_content=EaseMyTrip%20Exact");
	
	 driver.findElement(By.xpath("//label[normalize-space()='Defence Forces']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//label[normalize-space()='Students']")).click();
	 Thread.sleep(5000);
	
	 int radiobtn = driver.findElements(By.xpath("//input[@type='radio']")).size();
	 System.out.println("Number Of Radio Buttons: " + radiobtn);
	 driver.quit();
	
	 }
}
