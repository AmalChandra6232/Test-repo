
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
	 * launch https://www.google.com/
	 * maximise the window
	 * Enter iphone in the search box using actions class
	 * 
	 * Launch http://www.facebook.com/
	 * move to the element username
	 * click
	 * enter Hello in Capital Letters in the text box where email id has to be entered
	 * double click the text entered 
	 * perform a right click on the text box*/	


public class Assignment13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
        WebElement search=driver.findElement(By.name("q"));
        Actions obj=new Actions(driver);
        obj.sendKeys(search, "iphone");
        obj.build().perform();
        driver.navigate().to("https://www.facebook.com/login.php");
        WebElement username=driver.findElement(By.name("email"));
        obj.
        moveToElement(username).click()
        .keyDown(Keys.SHIFT).sendKeys("hello")
        .keyUp(Keys.SHIFT)
        .doubleClick().contextClick()
        .build().perform();
        
	}

}

//<input class="gLFyf gsfi" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwjTr_-rq4_0AhVli8MKHWpEAk8Q39UDCAQ">
//<input id="input" type="search" autocomplete="off" spellcheck="false" role="combobox" aria-live="polite" placeholder="Search Google or type a URL">
//<input type="text" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt" name="email" id="email" tabindex="0" placeholder="Email address or phone number" value="" autofocus="1" autocomplete="username" aria-label="Email address or phone number">


