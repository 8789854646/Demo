package jsp;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class A {
static {
	
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
   }

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.next();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/search?q="+name);
	String title=driver.getTitle();
	System.out.println(title);
	
	}

}
