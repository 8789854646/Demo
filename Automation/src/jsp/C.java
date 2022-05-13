package jsp;

import org.openqa.selenium.WebDriver;

public class C {
	static void test(WebDriver driver) 
	{
	driver.get("https://www.google.com/");

	System.out.println(driver.getTitle());
	driver.close();
		

	}

}
