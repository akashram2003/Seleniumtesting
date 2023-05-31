package com.selenium.demoapp2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Daytwo {

	public static void main(String[] args) throws InterruptedException {
		
		//setting web driver
		WebDriverManager.edgedriver().setup();
		//start edge driver
		WebDriver driver=new EdgeDriver();
		//url
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		//TO maximize driver screen
		driver.manage().window().maximize();

		//time take with 5 seconds
		Thread.sleep(5000);
		
		//Scroll to bottom
		
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1000)", "");
				
	   //to find element to copy xpath and to add details sendkeys		
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Akash");
		//to snedkeys of lastname.
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("A");
		// to sendkeys of email id
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727822tu602@skct.edu.in");
		//for password
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456");
		//for subcribe click yes
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		//for terms keys clicks
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		//for continue keys submit
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).submit();
		
		
		
		//to close web driver
		
		    //driver.close();

	}

}
