package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Print {

	public void tiraPrint(WebDriver driver, String nomePrint) {

		// Casting
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(scrFile,
					new File("C:\\Users\\tassi\\workspace\\mercadolivre\\Evidencias", nomePrint + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}