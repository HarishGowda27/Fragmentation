package test_flex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.PageLocatorsflex;

public class Frag_Flex_mp4_Size_5p {
	
	static WebDriver driver = null;
	
	@Test
	public static void start() throws InterruptedException  {
		
		
		PageLocatorsflex.Driver(driver);
	  
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		PageLocatorsflex.Navigate(driver);
		
		PageLocatorsflex.Username(driver).sendKeys("admin");
		
		PageLocatorsflex.Password(driver).sendKeys("pixfix@123");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PageLocatorsflex.Submit(driver).click();
		
		PageLocatorsflex.jobs_dropdown(driver).click();
		
		PageLocatorsflex.Flex_job(driver).click();
		
		PageLocatorsflex.New_job(driver).click();
		
		PageLocatorsflex.Job_Name(driver).sendKeys("Frag_5p_mp4_Size");
		
		PageLocatorsflex.Job_Type_TestPattern(driver).click();
		
		PageLocatorsflex.Scroll_page(driver);
		
		//pro1
		PageLocatorsflex.Show_profile(driver).click();
				
		PageLocatorsflex.HD(driver);
		
		//pro2
		PageLocatorsflex.Show_profile(driver).click();
		
		PageLocatorsflex.NTSC(driver).click();
		//pro3
		PageLocatorsflex.Show_profile(driver).click();
		
		PageLocatorsflex.PAL(driver);
		//pro4
		PageLocatorsflex.Show_profile(driver).click();
		
		PageLocatorsflex.Bcast(driver);
		//pro5
		PageLocatorsflex.Show_profile(driver).click();
		
		PageLocatorsflex.P2P(driver);
		
		//PageLocatorsflex.Cancel(driver).click();
		PageLocatorsflex.Scroll_page(driver);
		
		PageLocatorsflex.output_FileStream(driver).click();
		
		PageLocatorsflex.Ouput_Name(driver).sendKeys("file_stream");
		
		PageLocatorsflex.Ouput_Storage_path_NTSC(driver).sendKeys("device/Statix_Folder/Frag_Size_NTSC_MP4.mp4");
		
		PageLocatorsflex.Ouput_Storage_path_PAL(driver).sendKeys("device/Statix_Folder/Frag_Size_PAL_MP4.mp4");
		
		PageLocatorsflex.Ouput_Storage_path_Bcast(driver).sendKeys("device/Statix_Folder/Frag_Size_Bcast_MP4.mp4");
		
		PageLocatorsflex.Ouput_Storage_path_P2P(driver).sendKeys("device/Statix_Folder/Frag_Size_P2P_MP4.mp4");
		
		PageLocatorsflex.Ouput_Storage_path_HD(driver).sendKeys("device/Statix_Folder/Frag_Size_HD_MP4.mp4");
		
		PageLocatorsflex.Slice_Size(driver);
		
		PageLocatorsflex.Add_Out(driver).click();
		
		PageLocatorsflex.Save(driver).click();
	  
	  
  }
}
