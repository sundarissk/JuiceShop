package js_action_util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takescreenshot {
	

	public static void takesshot(WebDriver driver,String filename) throws IOException {

		// 1.take screenshot and store it as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// 2. Open the current date and time
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		// 3. Location to save screenshot
		File tar = new File("C:\\Users\\skuma\\eclipse-workspace\\JuiceShop_sel\\src\\test\\resources\\Screenshots"
				+ filename +" "+timestamp+ ".jpeg");
		// 4.  now copy the screenshot to desired location using copyfile method
		FileUtils.copyFile(src, tar);

	}




}
