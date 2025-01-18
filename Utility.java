package HomePage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void screenshot(WebDriver driver) throws IOException {

		TakesScreenshot ts = ((TakesScreenshot) driver);
		File src = ts.getScreenshotAs(OutputType.FILE);

		File trg = new File("D:\\Lavanya_SeleniumDemos\\Homepage.jpeg");
		//File trg = new File(System.getProperty("user.dir") + "\\Screenshots\\" + ".png");
		FileHandler.copy(src, trg);

	}

}
