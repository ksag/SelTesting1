import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kchin_000\\geckodriver.exe");
		/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);*/
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[2]")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("chintalapalli@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Database2018");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        
        Scanner input = new Scanner(System.in);
        String Item;
        //System.out.println("Enter the Item to search");        
        
        
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
        Item = "TV";
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Item);
        //System.out.println("Item"+Item);
        
        driver.findElement(By.xpath("//input[@class='nav-input']")).click();
        driver.findElement(By.xpath("//input[@name='s-ref-checkbox-3578043011']")).click();
       // driver.manage().window().equals(Item);
        /*try {
			driver.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        System.out.println(driver.findElement(By.xpath("//input[@name='s-ref-checkbox-3578043011']")).isSelected());
        
        WebElement element = driver.findElement(By.xpath("//html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[2]/span"));
        WebDriverWait wait = new WebDriverWait(driver, 20); //here, wait time is 20 seconds

        wait.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 20 seconds
        element.isSelected();
        
        WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[2]/div[2]/div/div[2]/div"));
        WebDriverWait wait2 = new WebDriverWait(driver, 20); //here, wait time is 20 seconds

        wait2.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 20 seconds
        element2.isSelected(); 
        
        WebElement element1 = driver.findElement(By.xpath("//html/body/div[1]/header/div/div[1]/div[4]/div[2]/div[2]/div/div[2]/a[24]/span"));
        WebDriverWait wait1 = new WebDriverWait(driver, 20); //here, wait time is 20 seconds

        wait1.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 20 seconds
        element1.click();
        //driver.findElement(By.xpath("//html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[2]/span")).isSelected();
       // driver.findElement(By.xpath("//html/body/div[1]/header/div/div[1]/div[4]/div[2]/div[2]/div/div[2]/a[24]/span")).click();
        //driver.get("Gifts");

	}

}
