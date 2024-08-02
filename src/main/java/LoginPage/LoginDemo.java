package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://epitage.cleanalgo.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@epitage.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
        driver.findElement(By.xpath("//button[@id=':r2:']")).click();
        Thread.sleep(3000);
        String a = driver.findElement(By.xpath("//div[@class='MuiAlert-message mui-1xsto0d']")).getText();
        System.out.println(a);

    }

}
