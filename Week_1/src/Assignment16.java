import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Launch the website “https://demoqa.com/browser-windows” 
   open the child window – “new window”.
   print the main window handle and child window handles in the console
   Switch to the opened child window and print the heading.
   close the child window
   Switch back to main window  and quit the browser
 */

public class Assignment16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String mainwindow = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		System.out.println("main window is " + mainwindow);
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println("Heading of child window is " + text.getText());
				driver.close();
				System.out.println("Child window closed");
			}
		}

		driver.switchTo().window(mainwindow);
		driver.quit();

	}

}

//<button id="tabButton" type="button" class="btn btn-primary">New Tab</button>
