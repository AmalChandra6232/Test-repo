import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Launch a new Chrome browser. 
 * Open Shop.DemoQA.com Get Page Title name and Title length Print Page Title and Title length on the Eclipse Console.
 *  Get Page URL and verify if it is a correct page opened Get Page Source (HTML Source code)
 *   and Page Source length Print Page Length on Eclipse Console. Close the Browser.
 */

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://shop.demoqa.com");
		String Title=driver.getTitle();
		System.out.println("Title name: "+Title);
		System.out.println("Title length= "+Title.length());
		String url=driver.getCurrentUrl();
		String expectedUrl = "https://shop.demoqa.com/";
		if (expectedUrl.equals(url)){
			 System.out.println("URL is correct");
			}
			else
			{
				System.out.println("URL is Incorrect");
			}
		String PageSource=driver.getPageSource();
		System.out.println("PageSource length= "+PageSource.length());
		driver.close();
	}

}
