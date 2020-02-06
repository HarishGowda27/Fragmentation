package test;//tc

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.PageLocators;

public class Frag_MKV_Clock {
	

	static WebDriver driver = null; 
	
	public static void main(String[] args) throws InterruptedException {
		
	PageLocators.Driver(driver);
	
	driver = new ChromeDriver();
	
	PageLocators.Navigate(driver);
	
	driver.manage().window().maximize();
	
	PageLocators.Username(driver).sendKeys("admin");
	
	PageLocators.Password(driver).sendKeys("pixfix@123");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	PageLocators.Submit(driver).click();
	
	PageLocators.jobs_dropdown(driver).click();
	
	PageLocators.Versa_job(driver).click();
	
	PageLocators.Versa_job_new(driver).click();
	
	PageLocators.test_pattern(driver).click();
	
	PageLocators.add_input(driver).click();
	
	PageLocators.input_next(driver).click();
	
	PageLocators.process_next(driver).click();
	
	//pro1
	PageLocators.Add_profile(driver).click();
	
	PageLocators.profile_HD_Profile(driver);
	
	//pro2
	PageLocators.Add_profile(driver).click();
	
	PageLocators.profile_PAL_Profile(driver).click();
	
	//pro3
	PageLocators.Add_profile(driver).click();
	
	PageLocators.profile_NTSC_Profile(driver).click();
	
	//pro4
	PageLocators.Add_profile(driver).click();
	
	PageLocators.profile_P2P_Profile(driver).click();
	
	
	PageLocators.Cancel(driver).click();
	
	PageLocators.Next_Profile(driver).click();
	
	PageLocators.File_stream_Output(driver).click();
	
	PageLocators.File_stream_Name(driver).sendKeys("HD_PAL_NTSC_P2P");
	
	//pro1_HD
	PageLocators.mp4_pro1_path(driver).sendKeys("device/Statix_Folder/Clock_mkv_HD.mkv");
	//pro2_PAL
	PageLocators.mp4_pro2_path(driver).sendKeys("device/Statix_Folder/Clock_mkv_PAL.mkv");
	//pro3_PAL
	PageLocators.mp4_pro3_path(driver).sendKeys("device/Statix_Folder/Clock_mkv_NTSC.mkv");
	//pro3_PAL
	PageLocators.mp4_pro4_path(driver).sendKeys("device/Statix_Folder/Clock_mkv_P2P.mkv");
	
	//muxer 
	PageLocators.muxer_mkv(driver).click();
	
	//Slice
	PageLocators.Job_Slicing_clock(driver);
	//add
	driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[10]/a[2]")).click();
	
	PageLocators.Job_Name(driver).sendKeys("_Frag_mkv_Versa_Clock");
	
	PageLocators.Add_output(driver);
	
	PageLocators.Add_job(driver).click();
	
	Thread.sleep(1000);
	
	PageLocators.Job_Start(driver).click();
	
	Thread.sleep(5000);
	
	PageLocators.Job_Stop(driver).click();
	driver.close();
	}

}
