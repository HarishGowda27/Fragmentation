package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PageLocators {

private static WebElement element = null;

//Driver
		public  static WebElement Driver(WebDriver driver)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\System\\ADSoftware\\Chromedriver\\chromedriver.exe");
			return element;
		}

	//server IP
	public  static WebElement Navigate(WebDriver driver)
	{
		driver.navigate().to("http://10.0.0.202/");
		return element;
	}

	//username
	public  static WebElement Username(WebDriver driver)
	{
	    element = driver.findElement(By.name("username"));
		return element;
	}
	
	//password
	public  static WebElement Password(WebDriver driver)
	{
	    element = driver.findElement(By.name("password"));
		return element;
	}
	
	//submit 
	public  static WebElement Submit(WebDriver driver)
	{
	    element = driver.findElement(By.name("submit"));
		return element;
	}
	
	//jobs pixflex-menu-jobs
	public  static WebElement jobs_dropdown(WebDriver driver)
	{
	    element = driver.findElement(By.id("pixflex-menu-jobs"));
		return element;
	}
	
	//Versa jobs versa_active
	public  static WebElement Versa_job(WebDriver driver)
	{
	    element = driver.findElement(By.id("versa_active"));
		return element;
	}
	
	//New job btn btn-primary pixflex-cursor pixflex-tooltip
	public  static WebElement Versa_job_new(WebDriver driver)
	{
	    element = driver.findElement(By.linkText("New"));
		return element;
	}
	
	//Test Pattern versa_src_test_pattern
	public  static WebElement test_pattern(WebDriver driver)
	{
	    element = driver.findElement(By.id("versa_src_test_pattern"));
		return element;
	}
	
	//Add Input add_pfmt_input
	public  static WebElement add_input(WebDriver driver)
	{
	    element = driver.findElement(By.id("add_pfmt_input"));
		return element;
	}
	
	//Next input_next
	public  static WebElement input_next(WebDriver driver)
	{
	    element = driver.findElement(By.id("input_next"));
		return element;
	}
	
	//Process Next process_next
	public  static WebElement process_next(WebDriver driver)
	{
	    element = driver.findElement(By.id("process_next"));
		return element;
	}
	
	//Add profile show_profile
	public  static WebElement Add_profile(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div/div/div/form/div[3]/div/div[2]/div/div[6]/div/div[2]/a"));
		return element;
	}
	
	//Select HD_profile pfmt_profile_preset
	public  static WebElement profile_HD_Profile(WebDriver driver)
	{
		Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
		dropdown.selectByVisibleText("OTT_HD_854x480");
		return element;
	}
	
	//Select PAL_profile 
	public  static WebElement profile_PAL_Profile(WebDriver driver)
	{
		Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
		dropdown.selectByVisibleText("OTT_PAL_720x576");
		return element;
	}
	
	//Select NTSC_profile 
		public  static WebElement profile_NTSC_Profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("OTT_NTSC_720x480");
			return element;
		}	
	
	//Select P2P_profile P2P_1920x1080
		public  static WebElement profile_P2P_Profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("P2P_1920x1080");
			return element;
		}
		
	//Select Bcast_profile
		public  static WebElement profile_Bcast_Profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("Bcast_1920x1080");
			return element;
		}
		
	//Cancel profile cancel_preset
		public  static WebElement Cancel(WebDriver driver)
		{
			 element = driver.findElement(By.id("cancel_preset"));
			return element;
		}
		
	//Profile Next profile_next
		public  static WebElement Next_Profile(WebDriver driver)
		{
			 element = driver.findElement(By.id("profile_next"));
			return element;
		}
		
	//Output FileStream sink_file_stream_archive
		public  static WebElement File_stream_Output(WebDriver driver)
		{
			 element = driver.findElement(By.id("sink_file_stream_archive"));
			return element;
		}
		
	//Output FileStream_name cluster_name
		public  static WebElement File_stream_Name(WebDriver driver)
		{
			 element = driver.findElement(By.id("cluster_name"));
			return element;
		}
		
	//muxer type ts**
		public  static WebElement muxer_ts(WebDriver driver)
		{

			Select dropdown = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdown.selectByVisibleText("MPEG TS");
			return element;
		}
		
	//muxer type mp4**
		public  static WebElement muxer_mp4(WebDriver driver)
		{

			Select dropdowna1 = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdowna1.selectByVisibleText("MP4");
			return element;
		}
	
	//muxer type mkv**
		public  static WebElement muxer_mkv(WebDriver driver)
		{

			Select dropdowna1 = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdowna1.selectByVisibleText("MKV");
			return element;
		}
		
	//muxer type mov**
		public  static WebElement muxer_mov(WebDriver driver)
		{

			Select dropdowna1 = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdowna1.selectByVisibleText("MOV");
			return element;
		}
			
	//muxer type mov**
		public  static WebElement muxer_flv(WebDriver driver)
		{

			Select dropdowna1 = new Select(driver.findElement(By.id("gstaf_format_mux")));  
			dropdowna1.selectByVisibleText("FLV");
			return element;
		}
		
  //Output FileStream_pro1_hd gstaf_sink_file_location_1
		public  static WebElement File_stream_path_HD(WebDriver driver)
		{
			 element = driver.findElement(By.id("gstaf_sink_file_location_1"));
			return element;
		}
  //output FileStream_pro1_hd_muxer muxer_ts_bitrate_1
			public  static WebElement File_stream_HD_muxer_value(WebDriver driver)
				{
					element = driver.findElement(By.id("muxer_ts_bitrate_1"));
					return element;
				}
  //output Filestream_pro1_Add_track	
			public  static WebElement Add_track(WebDriver driver)
			{
				element = driver.findElement(By.linkText("Add Track"));
				return element;
			}
  //output Filestream video_track mpeg_ts_tracks_1_1
			public  static WebElement Add_video(WebDriver driver)
			{
				Select dropdown = new Select(driver.findElement(By.id("mpeg_ts_tracks_1_1")));  
				dropdown.selectByVisibleText("1_Video");
				return element;
			}
  //output Filestream audio_track mpeg_ts_tracks_1_1
			public  static WebElement Add_audio(WebDriver driver)
			{
				Select dropdown = new Select(driver.findElement(By.id("mpeg_ts_tracks_1_1")));  
				dropdown.selectByVisibleText("1_Audio");
				return element;
			}
			
  //mp4 location pro1
			public  static WebElement mp4_pro1_path(WebDriver driver)
			{
				element = driver.findElement(By.id("gstaf_sink_file_location_1"));
				return element;
			}
 //mp4 location pro2
			public  static WebElement mp4_pro2_path(WebDriver driver)
			{
				element = driver.findElement(By.id("gstaf_sink_file_location_2"));
				return element;
			}
 //mp4 location pro3
			public  static WebElement mp4_pro3_path(WebDriver driver)
			{
				element = driver.findElement(By.id("gstaf_sink_file_location_3"));
				return element;
			}
 //mp4 location pro4
			public  static WebElement mp4_pro4_path(WebDriver driver)
			{
				element = driver.findElement(By.id("gstaf_sink_file_location_4"));
				return element;
			}
			
			
			
			
			
		
	//okay
			public  static WebElement OK_button(WebDriver driver)
			{
				element = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/button"));
				return element;
			}
		
		
		
	//Output FileStream_pro2_pal gstaf_sink_file_location_1
		public  static WebElement File_stream_path_PAL(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_2"));
			return element;
		}
		
	//Output Filestream_pro2_pal muxer_ts_bitrate_2
		public  static WebElement File_stream_value_PAL(WebDriver driver)
		{
			element = driver.findElement(By.id("muxer_ts_bitrate_2"));
			return element;
		}
		
		
	//Output FileStream_pro3_ntsc gstaf_sink_file_location_1
		public  static WebElement File_stream_path_NTSC(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_3"));
			return element;
		}
		
	//muxer_ts_bitrate_3
	//Output Filestream_pro2_pal_muxer_value muxer_ts_bitrate_2
		public  static WebElement File_stream_value_NTSC(WebDriver driver)
		{
				element = driver.findElement(By.id("muxer_ts_bitrate_3"));
				return element;
		}
		
		
		
		
		
	//scroll
		public  static WebElement Scroll(WebDriver driver)
		{
			JavascriptExecutor jsss1 = (JavascriptExecutor) driver;
	  		jsss1.executeScript("scroll(0,1000)");
	  		return element;
		}
		
		
		
		
		
	//Output FileStream_pro3_P2P gstaf_sink_file_location_1
		public  static WebElement File_stream_path_P2P(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_4"));
			return element;
		}
		
	//Output FileStream_pro3_P2P_muxer_value	
		public  static WebElement File_stream_P2P_Value(WebDriver driver)
		{
			element = driver.findElement(By.id("muxer_ts_bitrate_4"));
			return element;
		}
	
		
		
	//Output FileStream_pro3_Bcast gstaf_sink_file_location_1
		public  static WebElement File_stream_path_Bcast(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_5"));
			return element;
		}
	
	//Output FileStream_pro3_Bcast_muxer_value	
		public  static WebElement File_stream_Bcast_muxer_Value(WebDriver driver)
		{
			element = driver.findElement(By.id("muxer_ts_bitrate_5"));
			return element;
		}
		
	//ADD Output create_output
		public  static WebElement Add_output(WebDriver driver)
		{
			element = driver.findElement(By.id("create_output"));
			return element;
		}
				
	//ADD Job job_create
		public  static WebElement Add_job(WebDriver driver)
		{
			element = driver.findElement(By.id("job_create"));
			return element;
		}
		
	//Job_Name job_name
		public  static WebElement Job_Name(WebDriver driver)
		{
		
			element = driver.findElement(By.id("job_name"));
			return element;
		}
	
		
	
	//Start job job_counter_start_0
		public  static WebElement Job_Start(WebDriver driver)
		{
			element = driver.findElement(By.id("job_counter_start_0"));
			return element;
		}
		
	//Stop job job_counter_stop_0
		public  static WebElement Job_Stop(WebDriver driver)
		{
			element = driver.findElement(By.id("job_counter_stop_0"));
			return element;
		}
		
		
	//Slicing file_sink_slicing
		//size
		public  static WebElement Job_Slicing_Size(WebDriver driver)
		{
			Select dropdowna = new Select(driver.findElement(By.id("file_sink_slicing")));  
			dropdowna.selectByVisibleText("Size");
			//max size
			driver.findElement(By.id("file_sink_max_slice_size")).clear();
			driver.findElement(By.id("file_sink_max_slice_size")).sendKeys("1");
			return element;
		}
		
		//time
		public  static WebElement Job_Slicing_Time(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("file_sink_slicing")));  
			dropdown.selectByVisibleText("Time");
			return element;
		}
		//clock
		public  static WebElement Job_Slicing_clock(WebDriver driver)
		{
			Select dropdownb = new Select(driver.findElement(By.id("file_sink_slicing")));  
			dropdownb.selectByVisibleText("Clock");
			//Slice_Dur_file_sink_slicing_clock
			Select dropdownc = new Select(driver.findElement(By.id("file_sink_slicing_clock")));  
			dropdownc.selectByVisibleText("5");
			return element;
		}
	
	
	
	//Flex jobs versa_active
	public  static WebElement Flex_job(WebDriver driver)
	{
		element = driver.findElement(By.id("flex_active"));
		return element;
	}	
	
	
}
