import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickup {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverWait wait;
     driver = new ChromeDriver();
     driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
     driver.findElement(By.xpath("//*[@id='datepicker']")).click();
     
     //here we should have to wait because selenium have to wait to check for calender
       
     wait = new WebDriverWait(driver,Duration.ofSeconds(15));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='ui-datepicker-title']")));
      
      String CurrentMonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
      String CurrentYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
      
      //here we use while loop because we pickup the current date to other date
      while(!(CurrentMonth.equals("June")  &&  CurrentYear.equals("2025"))){
    	 //! here we use for up to all false statement it will repeated then once it will true it will take given date
     //driver.findElement(By.xpath("//a[@data-handler='next']")).click();
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-handler='next']"))).click();
    	   CurrentMonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
           CurrentYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText(); 
      }
    //then finally we need to select the day of date
 driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='20']")).click();
 //driver.quit();
	}

}
