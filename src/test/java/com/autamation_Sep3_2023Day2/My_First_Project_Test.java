package com.autamation_Sep3_2023Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_First_Project_Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //CTRL+Shift+o
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver(); //CTRL+Shift+o
		driver1.manage().window().maximize();
		driver1.get("https://flipkart.com");
		driver1.quit();

		WebDriver driver2 = new FirefoxDriver(); //CTRL+Shift+o
		driver2.manage().window().maximize();
		driver2.get("https://youtube.com");
		driver2.quit();

	}

}
