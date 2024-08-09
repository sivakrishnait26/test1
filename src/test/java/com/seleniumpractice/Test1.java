package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sivak\\OneDrive\\Desktop\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxttrendz.ccbp.tech/login");
        WebElement usernameEl = driver.findElement(By.id("username"));
        usernameEl.sendKeys("rahul");
        WebElement passwordEl = driver.findElement(By.id("password"));
        passwordEl.sendKeys("rahul@2021");
        WebElement loginBtnEl = driver.findElement(By.xpath("//button[@class='login-button']"));
        loginBtnEl.click();
        String expecedText = "Clothes That Get YOU Noticed";
        //String actualText = driver.findElement(By.xpath();
        //if(expectedUrl.equals(currentUrl)) {
        	//System.out.println("Navigation of homepage is successful");
        
	
	//}
        
        driver.quit();
        }

}
