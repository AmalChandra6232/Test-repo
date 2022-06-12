import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Launch the browser and up the url(http://www.opesmount.in/grocerystore1/)
Get the title of the page
Verify the title and url of the application
Close the browser*/

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String expectedTitle="Grocerystore";
		if (expectedTitle.equals(title)){
		 System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is Incorrect");
		}
		String expectedUrl = "http://www.opesmount.in/grocerystore1/";
		if (expectedUrl.equals(url)){
			 System.out.println("URL is correct");
			}
			else
			{
				System.out.println("URL is Incorrect");
			}
		driver.close();
	}

}
