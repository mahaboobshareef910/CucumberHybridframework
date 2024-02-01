import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
      driver  = new FirefoxDriver();
      /*driver.get("https://demo.guru99.com/V1/index.php");
      driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("mngr550546");
      driver.findElement(By.xpath("//*[@name='password']")).sendKeys("suhEnar");
      //driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
      WebElement element = driver.findElement(By.xpath("//*[@name='btnLogin']"));
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();", element);
      driver.quit();*/
      driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
      driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("20/06/2025");
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("document.getElementById('dob').value='20/06/2025';");
      Thread.sleep(10000);
      //driver.quit();
		 }

}
