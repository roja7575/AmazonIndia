package Utilities;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import basepackage.Basec;
import basepage.baseclass;

public class ReportingManager {

		//public static String screenshotName;

		public static String captureScreenshot() throws IOException {

			String screenshotPath = "";

			//1. take screenshot object
			TakesScreenshot scrShot = (TakesScreenshot) baseclass.driver;

			File sourceFile = scrShot.getScreenshotAs(OutputType.FILE);
		
	
			File destinationPath = new File("C:\\SeleniumPractice\\Screeshots\\"
					+ "ScreenCapture" + System.currentTimeMillis() + ".png");
		
			// 4. copy the source file into destination path
			FileUtils.copyFile(sourceFile, destinationPath);

			
			//5. capturing the  in string
			screenshotPath = destinationPath.getAbsolutePath();

			return screenshotPath;
		}

	}



