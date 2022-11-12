package Utility;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class captureScreenshots extends TestBase {
public static void screenshot(String name) throws Exception
{
	File Scource =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("/Users/Hp/eclipse-workspace/Framework/Screenshots/"+name+".jpeg");
    FileHandler.copy(Scource, dest);

}




}
