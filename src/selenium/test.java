package selenium;


		import org.openqa.selenium.Dimension;
		import org.openqa.selenium.Point;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		
		public class test {
			public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new FirefoxDriver();
			Thread.sleep(3000);
			driver.get("http://www.facebook.com");
			Thread.sleep(3000);
			Dimension d=new Dimension(300,500);
			driver.manage().window().setSize(d);
			Thread.sleep(3000);
			Point p=new Point(150,300);
			driver.manage().window().setPosition(p);
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.manage().window().minimize();
			Thread.sleep(3000);
			

	}

}
