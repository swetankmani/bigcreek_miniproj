package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.crm.qa.util.TestUtil;

public class Bigcreek_Elementry {


	public static ScreenshotUtil scr =   new ScreenshotUtil();

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sweta\\OneDrive\\Swetank\\Automation\\Selenium\\SeleniumDemo\\Server\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.forsyth.k12.ga.us/bigcreek");

		scr.captureScreenshot(driver, "home");
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2676")));
		action.build().perform();
		driver.findElement(By.id("navs-87")).click();
		scr.captureScreenshot(driver, "Administration");

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2676")));
		action.build().perform();
		driver.findElement(By.id("navs-2680")).click();
		scr.captureScreenshot(driver, "Office Staff");


		//Policies and Regulations

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2676")));
		action.build().perform();
		driver.findElement(By.id("navs-88")).click();
		scr.captureScreenshot(driver, "Policies and Regulations");

		//School Suplies

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2676")));
		action.build().perform();
		driver.findElement(By.id("navs-2681")).click();
		scr.captureScreenshot(driver, "School Supllies");

		//Attendance Lines
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2676")));
		action.build().perform();
		driver.findElement(By.id("navs-2677")).click();
		scr.captureScreenshot(driver, "Attendance Lines");
		driver.navigate().back();

		//Bus Routes
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2676")));
		action.build().perform();
		driver.findElement(By.id("navs-2678")).click();
		scr.captureScreenshot(driver, "Bus Routes");
		driver.navigate().back();


		//Staff Directory

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2676")));
		action.build().perform();
		driver.findElement(By.id("navs-5495")).click();
		scr.captureScreenshot(driver, "Staff Directory");

		//Academics

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		//Lerners Profile

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-2684")).click();
		scr.captureScreenshot(driver, "Learners Profile");
		driver.navigate().back();

		//kindergarten

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-91")).click();
		scr.captureScreenshot(driver, "Kindergarten");

		//1st Grade

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-92")).click();
		scr.captureScreenshot(driver, "1st Grade");

		//2nd Grade

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-93")).click();
		scr.captureScreenshot(driver, "2nd Grade");

		//3rd Grade

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-94")).click();
		scr.captureScreenshot(driver, "3rd Grade");

		//4th Grade

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-95")).click();
		scr.captureScreenshot(driver, "4th Grade");

		//5th Grade

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-96")).click();
		scr.captureScreenshot(driver, "5th Grade");

		//Special Areas

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-97")).click();
		scr.captureScreenshot(driver, "Special Areas");

		//Online Learning Program

		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-4431")).click();
		scr.captureScreenshot(driver, "Online Learning Program");
		driver.navigate().back();

		//State Standards			
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-2685")).click();
		scr.captureScreenshot(driver, "Special Areas");
		driver.navigate().back();

		//Testing Calendar			
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2675")));
		action.build().perform();
		driver.findElement(By.id("navs-3876")).click();
		scr.captureScreenshot(driver, "Testing Calendar");
		driver.navigate().back();

		//Student Services		
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		//ESOL
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-2887")).click();
		scr.captureScreenshot(driver, "ESOL");

		//EIP
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-4241")).click();
		scr.captureScreenshot(driver, "EIP");

		//Gifted Education
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-2889")).click();
		scr.captureScreenshot(driver, "Gifted Eduction");

		//Media Center
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-99")).click();
		scr.captureScreenshot(driver, "Media Center");


		//Instructional Technology
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-100")).click();
		scr.captureScreenshot(driver, "Instructional Technology");


		//Special Education
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-2888")).click();
		scr.captureScreenshot(driver, "Special Education");

		//Custodial Services
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-109")).click();
		scr.captureScreenshot(driver, "Custodial Services");

		//School Nurse
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-108")).click();
		scr.captureScreenshot(driver, "School Nurse");

		//School Nutrition
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-107")).click();
		scr.captureScreenshot(driver, "School Nutrition");


		//Transportation
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-4627")).click();
		scr.captureScreenshot(driver, "Transportation");

		//Instructional Coaches
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-4759")).click();
		scr.captureScreenshot(driver, "Instructional Coaches");


		//SRO
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-4761")).click();
		scr.captureScreenshot(driver, "SRO");

		//School Social Worker
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-5051")).click();
		scr.captureScreenshot(driver, "School Social Worker");

		//After School Program
		action.moveToElement(driver.findElement(By.cssSelector("#navc-2686")));
		action.build().perform();
		driver.findElement(By.id("navs-5315")).click();
		scr.captureScreenshot(driver, "After School Program");

		//Families and Partners

		action.moveToElement(driver.findElement(By.cssSelector("#navc-102")));
		action.build().perform();

		//PTO

		action.moveToElement(driver.findElement(By.cssSelector("#navc-102")));
		action.build().perform();
		driver.findElement(By.id("navs-103")).click();
		scr.captureScreenshot(driver, "PTO");

		//Local School Council
		action.moveToElement(driver.findElement(By.cssSelector("#navc-102")));
		action.build().perform();
		driver.findElement(By.id("navs-104")).click();
		scr.captureScreenshot(driver, "Local School Council");


		//Partners in Education
		action.moveToElement(driver.findElement(By.cssSelector("#navc-102")));
		action.build().perform();
		driver.findElement(By.id("navs-105")).click();
		scr.captureScreenshot(driver, "Partners in Educations");

		//My Payments Plus
		action.moveToElement(driver.findElement(By.cssSelector("#navc-102")));
		action.build().perform();
		driver.findElement(By.id("navs-4070")).click();
		scr.captureScreenshot(driver, "My Payments Plus");

		//Parent Online Resources
		action.moveToElement(driver.findElement(By.cssSelector("#navc-102")));
		action.build().perform();
		driver.findElement(By.id("navs-4785")).click();
		scr.captureScreenshot(driver, "Parent Online Resources");

		//Digital Citizenship
		action.moveToElement(driver.findElement(By.cssSelector("#navc-102")));
		action.build().perform();
		driver.findElement(By.id("navs-5107")).click();
		scr.captureScreenshot(driver, "Digital Citizenship");
		driver.navigate().back();


		//Volunteers at Big Creek
		action.moveToElement(driver.findElement(By.cssSelector("#navc-102")));
		action.build().perform();
		driver.findElement(By.id("navs-5399")).click();
		scr.captureScreenshot(driver, "Volunteers at Big Creek");

		//After School Activities
		action.moveToElement(driver.findElement(By.cssSelector("#navc-102")));
		action.build().perform();
		driver.findElement(By.id("navs-5520")).click();
		scr.captureScreenshot(driver, "After School Activities");
		driver.quit();
		
		System.out.println("End of Script");

	}


}
