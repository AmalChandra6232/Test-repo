import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		String dot="17/11/2021";
		String date,month,year;
		String dateArray[]=dot.split("/");
		date=dateArray[0];
		month=dateArray[1];
		year=dateArray[2];
		
		String caldt,calmonth=null,calyear,calyearmonth;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		calyearmonth=driver.findElement(By.className("monthTitle")).getText();
		
		String monthYearArray[]=calyearmonth.split(" ");
		calyear=monthYearArray[1];
		System.out.println("Displayed Year::" +calyear);
		System.out.println("Given Year::" + year);

		while(calyear.equals(year))
		{
			driver.findElement(By.className("next")).click();
			calyearmonth=driver.findElement(By.className("monthTitle")).getText();
			String monthYearArray_New[]= calyearmonth.split(" ");
			calmonth =monthYearArray_New[0];
			calyear =monthYearArray_New[1];
			System.out.println("Displayed Year::" +calyear);
			System.out.println("Displayed Month::" +calmonth);

		}
		System.out.println("Displayed Year::" +calyear);
		System.out.println("Given Year::" + year);

		while(calmonth.equals(month))
		{
			driver.findElement(By.className("monthTitle")).getText();
			String monthYearArray_month[]=calyearmonth.split(" ");
			calmonth=monthYearArray_month[0];
			calyear =monthYearArray_month[1];
			System.out.println("Displayed Year::" +calyear);
			System.out.println("Displayed Month::" +calmonth);

			System.out.println("Displayed Month::" +calmonth);
			System.out.println("Given Month::" + month);
			
			WebElement cal=driver.findElement(By.xpath("//table[@class='rb-monthTable first last']"));
			List<WebElement> rows=cal.findElements(By.tagName("tr"));
			for (int i = 1; i < rows.size(); i++) 
			{
				List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < cols.size(); j++) 
				{
					caldt=cols.get(j).getText();
					if (caldt.equals(date)) 
					{
						cols.get(j).click();
						break;
					}
				}
			}


			
			
		}

	}

}

//<input type="text" id="onward_cal" class="db" readonly="readonly" tabindex="3" data-caleng="">
//<td class="monthTitle" colspan="5">Nov 2021</td>
//<button>&gt;</button>
