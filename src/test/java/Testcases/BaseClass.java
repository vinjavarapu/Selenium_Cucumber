package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;
    public void Setup() {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();


    }
    public void Login() {

        driver.findElement(By.name("uid")).sendKeys("mngr265608");
        driver.findElement(By.name("password")).sendKeys("surekha1@");
        driver.findElement(By.name("btnLogin")).click();


    }
    public void Quitwindows() {

        driver.quit();
    }


}
