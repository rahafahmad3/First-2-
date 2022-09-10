package testproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://127.0.0.1:5500/Qa-Automation-the-table-to-be-tested/index.html");
 List <WebElement> items = driver.findElements(By.cssSelector(".container td:nth-of-type(3)"));
 for (int i = 0 ; i < items.size() ; i++) {
	 int sum =0;
	//System.out.println( items.get(i).getText());
	//sum = sum + items.get(i)
	sum = sum + Integer.parseInt(items.get(i).getText());
	//System.out.println(sum);
	 
	//System.out.println(driver.findElement(By.id("total")).getText());
	driver.findElement(By.id("total")).getText().split(":")[1].trim();
 }
}}

