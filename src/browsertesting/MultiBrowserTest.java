package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    public static void main(String[] args) {
        //set up browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong browser entered");
        }
        //open Url
        driver.get(baseUrl);
        //print title page
        System.out.println(driver.getTitle());
        //print current URl
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());
        //get username to username field
        driver.findElement(By.name("user[email]")).sendKeys("sbparikh@gmail.com");
        //get password to password field
        driver.findElement(By.name("user[password]")).sendKeys("abc123");
        //close browser
        driver.close();
    }
}