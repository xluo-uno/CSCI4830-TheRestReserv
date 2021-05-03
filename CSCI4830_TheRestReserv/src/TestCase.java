import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase 
{
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	 private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void test() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "lib\\win\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testSearch1() throws Exception {
		driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
		Thread.sleep(1000);
		driver.findElement(By.id("Search")).click();
	}
	
	@Test
	public void testSearch() throws Exception {
		driver.get("https:// (ec2 server");
		Thread.sleep(1000);
		driver.findElement(By.id("Sign Up")).click();
	}
	
	@After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	
}
