package SAmple;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest 
{
	@Test
public void regression()
{
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
}
	@Test
public void systemttest() {
	System.out.println("systemtest passed");
}
@Test
public void systemttest1() {
	System.out.println("systemtest passed1");
}
	@Test
public void systemttest2() {
	System.out.println("systemtest passed1");
}	
	public void systemttest3() {
	System.out.println("systemtest passed1");
}	
}
