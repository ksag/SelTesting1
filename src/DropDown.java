import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kchin_000\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.cheaptickets.com/");
        //driver.findElement(By.id("tab-flight-tab-hp")).click();
       // driver.findElement(By.xpath("//*[@id="tab-flight-tab"]/span[3]")args.)
        
        driver.findElement(By.className("tab-label")).click();
        
        Select select = new Select(driver.findElement(By.id("flight-adults-hp-flight")));
        select.selectByValue("4");
        //driver.close();
      


	}

}
