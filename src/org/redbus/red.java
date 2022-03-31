package org.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class red {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Redbus\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.redbus.in/");
WebElement from = driver.findElement(By.xpath("//input[@type='text']"));
from.sendKeys("chennai");
WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
to.sendKeys("nagapattinam");






}


}
