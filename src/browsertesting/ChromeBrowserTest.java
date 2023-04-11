package browsertesting;
/**Project-5 - Project Name: com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/users/sign_in
 * 1. Setup chrome browser
 2. Open URL
 3. Print the title of the page
 4. Print the current url
 5. Print the page source
 6. Enter the email to email field
 7. Enter the password to password field
 8. Close the browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // set up browser
        WebDriver driver = new ChromeDriver();
        //open Url
        driver.get(baseUrl);
        //print title page
        System.out.println(driver.getTitle());
        //print current url
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        //get username to username field
        driver.findElement(By.name("user[email]")).sendKeys("sbparikh@gmail.com");
        //get password to password field
        driver.findElement(By.name("user[password]")).sendKeys("abc123");
        //close browser
        driver.close();


    }
}
