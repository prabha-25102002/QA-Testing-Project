package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PRABHA\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/your-account");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String a=driver.getTitle();
        WebElement search= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        search.sendKeys("iphone 14");
        search.sendKeys(Keys.RETURN);
        WebElement product= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
        product.click();
        Thread.sleep(3000);
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        cart.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
