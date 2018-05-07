import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class ExpediaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kchin_000\\geckodriver.exe");
		/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);*/

        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.expedia.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='tab-flight-tab-hp']")).click();
        driver.findElement(By.xpath("//*[@id='flight-origin-hp-flight']")).sendKeys("IAD");
        driver.findElement(By.xpath("//*[@id='flight-origin-hp-flight']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//*[@id='flight-origin-hp-flight']")).sendKeys(Keys.TAB);
        driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("ORD");
        driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(Keys.TAB);
        driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(Keys.TAB);
        driver.findElement(By.id("flight-departing-hp-flight")).sendKeys(Keys.TAB);
        
        while(!driver.findElement(By.xpath("/html/body/section/div/div/div/section/div[1]/div[2]/div[2]/section[1]/form/fieldset[2]/div/div[2]/div/div/div/div[2]/table/caption")).getText().contains("Aug"))
        {
        	
        	driver.findElement(By.xpath("/html/body/section/div/div/div/section/div[1]/div[2]/div[2]/section[1]/form/fieldset[2]/div/div[2]/div/div/div/button[2]")).click();
        }
        
        
       // List<WebElement> dates = driver.findElements(By.className("datepicker-cal-date"));
        int count = driver.findElements(By.className("datepicker-cal-date")).size();
        
        for(int i=0; i<count; i++){
        	
        	String text = driver.findElements(By.className("datepicker-cal-date")).get(i).getText();
        	if (text.equalsIgnoreCase("21"));
        	
        	{
        		driver.findElements(By.className("datepicker-cal-date")).get(i).click();
        		break;
        	}
        }
        
       // driver.close();
        /*Select dropdown = new Select(driver.findElement(By.id()));
        dropdown.selectByIndex(1);   */     
	}

}
