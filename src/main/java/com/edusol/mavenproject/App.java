package com.edusol.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "F:\\Salenium Project\\SeleniumProject\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window();
		
    }
}
