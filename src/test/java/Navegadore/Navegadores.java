package Navegadore;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegadores {

	public static WebDriver driver;
	String url = "https://correios.com.br/";

	@BeforeClass
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

}
