import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "WebContent\\WEB-INF\\lib\\win\\chromedriver.exe");
	driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void homeToSearch() throws Exception {
    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
    driver.findElement(By.linkText("Search")).click();
    driver.findElement(By.linkText("Home Page")).click();
  }
  
  @Test
  public void homeToSummit() throws Exception {
    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
    driver.findElement(By.linkText("Sign up")).click();
    driver.findElement(By.linkText("Home Page")).click();
  }
  
  @Test
  public void homeToContact() throws Exception {
    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
    driver.findElement(By.linkText("Contact us")).click();
    driver.findElement(By.linkText("Home Page")).click();
  }
  
  @Test
  public void homeToSearchToSummit() throws Exception {
    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
    driver.findElement(By.linkText("Search")).click();
    driver.findElement(By.xpath("//a[@href='/CSCI4830_TheRestReserv/insert_RestReserv.html']")).click();
    driver.findElement(By.linkText("Home Page")).click();
  }
  
  @Test
  public void homeToSummitToSearch() throws Exception {
    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
    driver.findElement(By.linkText("Sign up")).click();
    driver.findElement(By.xpath("//a[@href='/CSCI4830_TheRestReserv/search_RestReserv.html']")).click();
    driver.findElement(By.linkText("Home Page")).click();
  }
  
  @Test
	public void testHeaderSigh() throws Exception {
	    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
	    driver.findElement(By.xpath("//img")).click();
	    driver.findElement(By.xpath("//img")).click();
	    driver.findElement(By.xpath("//i")).click();
	    driver.findElement(By.linkText("Sign up")).click();
  }
  
  @Test
	public void testHeaderSearch() throws Exception {
	    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
	    driver.findElement(By.xpath("//img")).click();
	    driver.findElement(By.xpath("//img")).click();
	    driver.findElement(By.xpath("//i")).click();
	    driver.findElement(By.linkText("Search")).click();
}
  @Test
	public void testHeaderContact() throws Exception {
	    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
	    driver.findElement(By.xpath("//img")).click();
	    driver.findElement(By.xpath("//img")).click();
	    driver.findElement(By.xpath("//i")).click();
	    driver.findElement(By.linkText("Contact us")).click();
}

  
  @Test
  public void testUntitledTestCase2() throws Exception {
    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/insert_RestReserv.html");
    driver.manage().window().maximize();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("Bob Smith");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("bobsmith123@gmail.com");
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("402-123-4567");
    driver.findElement(By.name("restname")).click();
    driver.findElement(By.name("restname")).clear();
    driver.findElement(By.name("restname")).sendKeys("Outback");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    driver.findElement(By.linkText("Search Data")).click();
    driver.findElement(By.linkText("Home Page")).click();
  }
  
  @Test
  public void testUntitledTestCase3() throws Exception {
    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//img")).click();
    driver.findElement(By.xpath("//img")).click();
    driver.findElement(By.xpath("//i")).click();
    driver.findElement(By.linkText("Sign up")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.xpath("//section/h1")).click();
    driver.findElement(By.linkText("Search Data")).click();
    driver.findElement(By.name("keyword")).click();
    driver.findElement(By.name("keyword")).clear();
    driver.findElement(By.name("keyword")).sendKeys("@");
    driver.findElement(By.xpath("//input[@value='Search']")).click();
    driver.findElement(By.linkText("Search Data")).click();
    driver.findElement(By.linkText("Home Page")).click();
  }
  
  @Test
  public void testSearchName() throws Exception {
    driver.get("http://ec2-18-220-194-215.us-east-2.compute.amazonaws.com:8080/CSCI4830_TheRestReserv/project.html");
    driver.findElement(By.xpath("//img")).click();
    driver.findElement(By.xpath("//img")).click();
    driver.findElement(By.xpath("//i")).click();
    driver.findElement(By.linkText("Sign up")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.xpath("//section/h1")).click();
    driver.findElement(By.linkText("Search Data")).click();
    driver.findElement(By.name("keyword")).click();
    driver.findElement(By.name("keyword")).clear();
    driver.findElement(By.name("keyword")).sendKeys("@");
    driver.findElement(By.xpath("//input[@value='Search']")).click();
    driver.findElement(By.linkText("Search Data")).click();
    driver.findElement(By.linkText("Home Page")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Contact us')])[2]")).click();
    driver.findElement(By.linkText("Home Page")).click();
    driver.findElement(By.xpath("//i")).click();
    driver.findElement(By.linkText("Search")).click();
    driver.findElement(By.name("keyword")).click();
    driver.findElement(By.name("keyword")).clear();
    driver.findElement(By.name("keyword")).sendKeys("jenny");
    driver.findElement(By.xpath("//input[@value='Search']")).click();
    driver.findElement(By.linkText("Search Data")).click();
    driver.findElement(By.linkText("Home Page")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
