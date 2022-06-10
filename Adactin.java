package mini_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ab\\eclipse-workspace\\Maven_Project1\\Driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
        
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Abinaya37");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Abinaya@3737");
		
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		
		System.out.println("First page Started Successfully");
		
		WebElement d1 = driver.findElement(By.xpath("//select[@name='location']"));
		Select s1 = new Select(d1);
		s1.selectByIndex(3);
	
		WebElement d2 = driver.findElement(By.id("hotels"));
		Select s2 = new Select(d2);
		s2.selectByVisibleText("Hotel Hervey");

		WebElement d3 = driver.findElement(By.id("room_type"));
		Select s3 = new Select(d3);
		s3.selectByIndex(2);

		WebElement d4 = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(d4);
		s4.selectByIndex(6);
		
		WebElement date=driver.findElement(By.name("datepick_in"));
		date.clear();
		date.sendKeys("24/05/2022");
		WebElement date1=driver.findElement(By.name("datepick_out"));
		date1.clear();
		date1.sendKeys("28/05/2022");
		
		WebElement d5 = driver.findElement(By.name("adult_room"));
		Select s5 = new Select(d5);
		s5.selectByIndex(2);
		
		WebElement d6 = driver.findElement(By.name("child_room"));
		Select s6 = new Select(d6);
		s6.selectByIndex(2);
		
		WebElement b1 = driver.findElement(By.name("Submit"));
		b1.click();
		
		System.out.println("Second Page : Completed");
		
		WebElement b2 = driver.findElement(By.id("radiobutton_0"));
		b2.click();
		
		WebElement b3 = driver.findElement(By.id("continue"));
		b3.click();
		
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("Abinaya");
		
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("N");
	
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("N0.122,saravana nagar, kundrathur");
	
		WebElement cn = driver.findElement(By.name("cc_num"));
		cn.sendKeys("0987 6543 2109 8765");
	
		WebElement cct = driver.findElement(By.id("cc_type"));
		Select cct1 = new Select(cct);
		cct1.selectByIndex(3);
		
		WebElement ed = driver.findElement(By.name("cc_exp_month"));
		Select ed1 = new Select(ed);
		ed1.selectByIndex(11);
		
		WebElement ey = driver.findElement(By.name("cc_exp_year"));
		Select ey1 = new Select(ey);
		ey1.selectByValue("2022");	
	
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("098");
		
		WebElement bn = driver.findElement(By.id("book_now"));
		bn.click();
		Thread.sleep(6000);
		
		System.out.println("Third Page : Completed");
		
		WebElement iti = driver.findElement(By.name("my_itinerary"));
		iti.click();
		
		WebElement button = driver.findElement(By.name("ids[]"));
		button.click();
		
		WebElement cancel = driver.findElement(By.name("cancelall"));
		cancel.click();
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement log = driver.findElement(By.name("logout"));
		log.click();
		
		System.out.println("Completed Successfully");
	}
	
	

}
