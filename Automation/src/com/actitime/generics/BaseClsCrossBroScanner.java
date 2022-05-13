package com.actitime.generics;

	import java.util.Scanner;
    import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.testng.Reporter;
	import org.testng.annotations.AfterMethod;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.BeforeTest;
     import org.testng.annotations.Parameters;

    public class BaseClsCrossBroScanner {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}
	 public WebDriver driver;
	 @Parameters("browser")
	 @BeforeTest
	 public void openBrowser(String browser) {
		 System.out.println("Enter the browser name");
		 Scanner sc=new Scanner(System.in);
		 String s1=sc.nextLine();
		 Reporter.log("Open Browser",true);
		 if (browser.equals(s1)) {
		 driver=new ChromeDriver();
		 }
		 else if (browser.equals(s1)) {
			driver=new FirefoxDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	 @AfterTest
	 public void closeBrowser() {
		 Reporter.log("Close Browser",true);
		 driver.close();
	 }
	 @BeforeMethod
	 public void login() {
		 Reporter.log("Login",true);
		 driver.get("https://demo.actitime.com/");
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 
	 }
	 @AfterMethod
		public void logout() {
			Reporter.log("Logout",true);
			driver.findElement(By.id("logoutLink")).click();
		}
	}



