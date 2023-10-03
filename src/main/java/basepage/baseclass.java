package basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	public static WebDriver driver;

	
	
		
	public static void launchApplication() 
	{
			
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
			 driver.get("https://studio.cucumber.io/users/sign_in");
			 driver.manage().window().maximize();
			 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	 
	}
			
		// 5mina please
		
	public static void closeApplication() 
	{
		
			driver.close();
	}

}


