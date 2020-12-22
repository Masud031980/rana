package zoopla.uk.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SuperClass {
	public static WebDriver  driver;
	public static  Logger logger;
	public static Properties configprop;
	
	public SuperClass() {
		logger = Logger.getLogger("QA-Masud");
		PropertyConfigurator.configure("Log4j.properties");	
		
		}
	public static void initalization() throws Throwable    {
	    configprop = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configprop.load(configPropfile);
		String br = configprop.getProperty("browser");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
			driver =new ChromeDriver();
		}
		else if (br.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", configprop.getProperty("edgepath"));
			driver = new EdgeDriver();
			
		}
	     
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}

}
