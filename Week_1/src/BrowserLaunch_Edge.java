import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch_Edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
	}

}
