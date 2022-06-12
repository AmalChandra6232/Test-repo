import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://buffalocart.com/demo/billing/public/login");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click(); 

	}

}
//<input id="username" type="text" class="form-control" name="username" value="" required="" autofocus="">
//<input id="password" type="password" class="form-control" name="password" value="" required="">
//<button type="submit" class="btn btn-primary">
                              

