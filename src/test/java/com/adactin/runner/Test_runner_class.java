package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basic_class.Base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",

		glue = "com.sd" ,
		
		plugin = "html:Cucumber_Reports/Rep.html"

)

public class Test_runner_class {

	public static WebDriver driver; // -----> null

	@BeforeClass
	public static void set_up() {
		
	driver= Base_class.browser("chrome");	

	//	System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber_Automations\\driver\\chromedriver.exe");
		

	//	WebDriver driver = new ChromeDriver();

	}

	@AfterClass
	public static void tear_Down() {

		driver.close();

	}

}
