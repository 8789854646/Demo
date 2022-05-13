package jsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserMtrListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		String s1=sc.nextLine();
		driver.get("file:///D:/Selenium/MultipleListbox.html");
		int a=0;
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> userOptions = s.getOptions();
		int count = userOptions.size();
		for(int i=0;i<count;i++)
		{
			String text = userOptions.get(i).getText();
			if (text.equals(s1)) {
				a++;
				
			}
		}
		if (a==0) {
			System.out.println(s1+" Provided option is not present in the listbox");
			
		}
		else if (a==1) {
		System.out.println(s1+" is present without duplicates");	
		}
		else if (a>1) {
			System.out.println(s1+" is present with duplicates");
		}
        driver.close();
	}

}
