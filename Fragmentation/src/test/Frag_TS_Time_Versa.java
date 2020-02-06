package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pages.PageLocators;

public class Frag_TS_Time_Versa {

		static WebDriver driver = null; 
		
		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\System\\ADSoftware\\Chromedriver\\chromedriver.exe");
		
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
		
		//pro5
		PageLocators.Add_profile(driver).click();
		
		PageLocators.profile_Bcast_Profile(driver).click();
		
		
		
		PageLocators.Cancel(driver).click();
		
		PageLocators.Next_Profile(driver).click();
		
		PageLocators.File_stream_Output(driver).click();
		
		PageLocators.File_stream_Name(driver).sendKeys("HD_PAL_NTSC_P2P_Bcast");
		
  		PageLocators.Scroll(driver);
  		
		PageLocators.muxer_ts(driver).click();
		//pro1 HD
		PageLocators.File_stream_path_HD(driver).sendKeys("device/Statix_Folder/hd_TIME.ts");
		
		PageLocators.File_stream_HD_muxer_value(driver).sendKeys("6500");

		PageLocators.Add_track(driver).click();
		
		PageLocators.Add_video(driver).click();
		
		PageLocators.Add_track(driver).click();
		
		PageLocators.Add_audio(driver).click();
		
		PageLocators.OK_button(driver).click();
		//pro2 PAL
		PageLocators.Scroll(driver);
		
		PageLocators.File_stream_path_PAL(driver).sendKeys("device/Statix_Folder/pal_TIME.ts");
		
		PageLocators.File_stream_value_PAL(driver).sendKeys("2000");

		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[5]/div[11]/div/div[2]/div/div/div[5]/div[2]/a")).click();
		Select dropdown = new Select(driver.findElement(By.id("mpeg_ts_tracks_2_1")));  
		dropdown.selectByVisibleText("1_Audio");
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[5]/div[11]/div/div[2]/div/div/div[5]/div[2]/a")).click();
		Select dropdown1 = new Select(driver.findElement(By.id("mpeg_ts_tracks_2_1")));  
		dropdown1.selectByVisibleText("1_Video");
		//pro3 NTSC
		PageLocators.Scroll(driver);
		
		PageLocators.File_stream_path_NTSC(driver).sendKeys("device/Statix_Folder/ntsc_TIME.ts");
		
		PageLocators.File_stream_value_NTSC(driver).sendKeys("2000");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[5]/div[16]/div/div[2]/div/div/div[5]/div[2]/a")).click();
		Select dropdown2 = new Select(driver.findElement(By.id("mpeg_ts_tracks_3_1")));  
		dropdown2.selectByVisibleText("1_Audio");
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[5]/div[16]/div/div[2]/div/div/div[5]/div[2]/a")).click();
		Select dropdown3 = new Select(driver.findElement(By.id("mpeg_ts_tracks_3_1")));  
		dropdown3.selectByVisibleText("1_Video");
		//pro4 P2P
		PageLocators.Scroll(driver);
		
		PageLocators.File_stream_path_P2P(driver).sendKeys("device/Statix_Folder/p2p_TIME.ts");
		
		PageLocators.File_stream_P2P_Value(driver).sendKeys("6500");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[5]/div[21]/div/div[2]/div/div/div[5]/div[2]/a")).click();
		Select dropdown4 = new Select(driver.findElement(By.id("mpeg_ts_tracks_4_1")));  
		dropdown4.selectByVisibleText("1_Audio");
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[5]/div[21]/div/div[2]/div/div/div[5]/div[2]/a")).click();
		Select dropdown5 = new Select(driver.findElement(By.id("mpeg_ts_tracks_4_1")));  
		dropdown5.selectByVisibleText("1_Video");
		//pro5 Bcast
		PageLocators.Scroll(driver);
		
		PageLocators.File_stream_path_Bcast(driver).sendKeys("device/Statix_Folder/Bcast_TIME.ts");
		
		PageLocators.File_stream_Bcast_muxer_Value(driver).sendKeys("8500");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[5]/div[26]/div/div[2]/div/div/div[5]/div[2]/a")).click();
		Select dropdown6 = new Select(driver.findElement(By.id("mpeg_ts_tracks_5_1")));  
		dropdown6.selectByVisibleText("1_Audio");
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[7]/div/div/div[5]/div[26]/div/div[2]/div/div/div[5]/div[2]/a")).click();
		Select dropdown7 = new Select(driver.findElement(By.id("mpeg_ts_tracks_5_1")));  
		dropdown7.selectByVisibleText("1_Video");
		
		PageLocators.Job_Slicing_Time(driver);
		
		PageLocators.Add_output(driver).click();
		
		PageLocators.Job_Name(driver).sendKeys("_Frag_TS_Versa_Time");
		
		PageLocators.Add_job(driver).click();
		
		Thread.sleep(1000);
		
		PageLocators.Job_Start(driver).click();
		
		Thread.sleep(5000);
		
		PageLocators.Job_Stop(driver).click();
		driver.close();
		
	}

}
