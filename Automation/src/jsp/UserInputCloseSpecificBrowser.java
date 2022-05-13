package jsp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserInputCloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Specific Browser no");
		int n=sc.nextInt();
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> allWh = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<>(allWh);
		System.out.println(ar);
		
		for (String wh :ar) {
			driver.switchTo().window(wh);
			
			if ((ar.get(n)).equals(wh))
			{
				System.out.println("Selected Specific Browser "+wh+ " is closed");
			    driver.close();
			}
		}
		
        
	}

}
