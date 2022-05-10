import java.nio.file.Path;
import java.sql.Driver;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assistant {
	


	public static void main(String[] args) { 
		
	Scanner scan = new Scanner(System.in); 
		
	System.out.println("Hello Sir how may I assist you today?");
	String name = scan.nextLine();
		
		System.out.println(name);
		
		if (name.equalsIgnoreCase("open google")) {
			
			google(); 
		} 
		
		else {
			
			System.out.println("Skip Google");
			
		}
			
		if (name.equalsIgnoreCase("Open Youtube")) {
			
			googleSearchYoutube(); 
			
		}
		
		else {
			System.out.println("Skip Youtube");
		}
		
		if (name.equalsIgnoreCase(name)) {
			
			googleSearch(name); 
		}
		
		else {
			System.out.println("wtf"); 
		}
	
			
		

}

	public static void google() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriverFolder\\chromedriver.exe"); 
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get ("http://www.google.com");
		
		System.out.println("Google Opened"); 
		
		}
	
	
	public static void googleSearch(String s) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriverFolder\\chromedriver.exe"); 
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get ("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(s);
		
		System.out.println("Google check type question"); 
		
		driver.findElement(By.xpath("//input[@name=\"btnK\"]")).sendKeys(Keys.ENTER);
		
		System.out.println("Google Search completed"); 
		
	}
	
	
public static void googleSearchYoutube() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriverFolder\\chromedriver.exe"); 
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get ("http://www.youtube.com");
		
		driver.manage().window().maximize();
		
		System.out.println("Youtube Opened"); 
		
		
		
	
}
}


