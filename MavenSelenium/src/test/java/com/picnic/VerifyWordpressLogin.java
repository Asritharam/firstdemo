package com.picnic;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.picnic.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
 
/**
* @author Mukesh_50
*
*/
public class VerifyWordpressLogin 
{
 
@Test
public void verifyValidLogin()
{
System.setProperty("webdriver.gecko.driver","C:/Users/aravindhl/eclipse-SeliniumProject/seliniumproject/drivers/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.google.com");
 

 
driver.manage().window().maximize();
 
driver.get("http://demosite.center/wordpress/wp-login.php");
 
LoginPage login=new LoginPage(driver);
 
 
 
login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
}

