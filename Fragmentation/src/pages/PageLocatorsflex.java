package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PageLocatorsflex {

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
	
	//Flex jobs versa_active
	public  static WebElement Flex_job(WebDriver driver)
	{
		element = driver.findElement(By.id("flex_active"));
		return element;
	}	
	
	//New job
	public  static WebElement New_job(WebDriver driver)
	{
		element = driver.findElement(By.linkText("New"));
		return element;
	}	
	
	//job_name job_name
	public  static WebElement Job_Name(WebDriver driver)
	{
		element = driver.findElement(By.id("job_name"));
		return element;
	}	
	
	//job type raw_sdmi_src_btn
	public  static WebElement Job_Type_TestPattern(WebDriver driver)
	{
		element = driver.findElement(By.id("raw_sdmi_src_btn"));
		return element;
	}
	
	//scroll
	public  static WebElement Scroll_page(WebDriver driver)
	{
		JavascriptExecutor jsss1 = (JavascriptExecutor) driver;
		jsss1.executeScript("scroll(0,500)");
		return element;
	}
	
	//Cancel
	public  static WebElement Cancel(WebDriver driver)
	{
		 element = driver.findElement(By.id("cancel_preset"));
		return element;
	}

	
	//job type filestream_src_btn
		public  static WebElement Job_Type_Filestream(WebDriver driver)
		{
			element = driver.findElement(By.id("filestream_src_btn"));
			return element;
		}
	
	//File path /storage/device/SmokeQA/big_buck_bunny_1080p.mp4 input_file_name
		public  static WebElement file_path(WebDriver driver)
		{
			element = driver.findElement(By.id("input_file_name"));
			return element;
		}
	
	// show_profile
		public  static WebElement Show_profile(WebDriver driver)
		{
			element = driver.findElement(By.id("show_profile"));
			return element;
		}
		
	// Select profile pfmt_profile_preset
		public  static WebElement Select_profile(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("OTT_NTSC_720x480");
			return element;
			
		}
		
	//Select output type sink_file_stream_archive NTSC
		public  static WebElement NTSC(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("OTT_NTSC_720x480");
			return element;
		}
		
		
	//Select output type sink_file_stream_archive HD
		public  static WebElement HD(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("OTT_HD_640x360");
			return element;
		}
	
	//Select output type sink_file_stream_archive PAL
		public  static WebElement PAL(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("OTT_PAL_224x176");
			return element;
		}
		
	//Bcast_1920x1080 Bcast
		public  static WebElement Bcast(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("Bcast_1920x1080");
			return element;
		}

	// P2P
		public  static WebElement P2P(WebDriver driver)
		{
			Select dropdown = new Select(driver.findElement(By.id("pfmt_profile_preset")));  
			dropdown.selectByVisibleText("P2P_1920x1080");
			return element;
		}
		
		
	//Select output sink_file_stream_archive
		public  static WebElement output_FileStream(WebDriver driver)
		{
			element = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/div/div/div/div/form/div[5]/div[10]/div/div/div/div/div[4]/div[3]/div[2]/div[1]/a"));
			return element;
			
		}
		
	//Output Name cluster_name
		public  static WebElement Ouput_Name(WebDriver driver)
		{
			element = driver.findElement(By.id("cluster_name"));
			return element;
			
		}
		
	//save_job Savejob
		public  static WebElement Save(WebDriver driver)
		{
			element = driver.findElement(By.id("save_job"));
			return element;
			
		}
		
	//gstaf_sink_file_location_1 HD
		public  static WebElement Ouput_Storage_path_HD(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_1"));
			return element;
											
		}
		
	//Output Storage path-1NTSC
		public  static WebElement Ouput_Storage_path_NTSC(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_2"));
			return element;
					
		}
		
	//Output Storage path-2PAL
		public  static WebElement Ouput_Storage_path_PAL(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_3"));
			return element;
							
		}
	//Output Storage path-Bcast
		public  static WebElement Ouput_Storage_path_Bcast(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_4"));
			return element;
									
		}
	
	//gstaf_sink_file_location_4 p2p
		public  static WebElement Ouput_Storage_path_P2P(WebDriver driver)
		{
			element = driver.findElement(By.id("gstaf_sink_file_location_4"));
			return element;
									
		}		
				
		
	//file_sink_slicing Slicing SIZE Size
		public  static WebElement Slice_Size(WebDriver driver)
		{	
			Select dropdown = new Select(driver.findElement(By.id("file_sink_slicing")));  
			dropdown.selectByVisibleText("Size");
			return element;			
		}
		
	//max slice file_sink_max_slice_size
		public  static WebElement Slice_max_Size(WebDriver driver)
		{	
			driver.findElement(By.id("file_sink_max_slice_size")).clear();
			driver.findElement(By.id("file_sink_max_slice_size")).sendKeys("1");
			return element;		
		}
		
		
		
	//file_sink_slicing Slicing SIZE Time
		public  static WebElement Slice_Time(WebDriver driver)
		{	
			Select dropdown = new Select(driver.findElement(By.id("file_sink_slicing")));  
			dropdown.selectByVisibleText("Time");
			return element;			
		}
		
	//file_sink_slicing Slicing SIZE Clock
		public  static WebElement Slice_Clock(WebDriver driver)
		{	
			Select dropdown = new Select(driver.findElement(By.id("file_sink_slicing")));  
			dropdown.selectByVisibleText("Clock");
			Select dropdownc = new Select(driver.findElement(By.id("file_sink_slicing_clock")));  
			dropdownc.selectByVisibleText("5");
			return element;
				
		}
	
	//Add create_output
		public  static WebElement Add_Out(WebDriver driver)
		{	
			element = driver.findElement(By.id("create_output"));
			return element;			
		}
	//start job_counter_start_0
		public  static WebElement Start(WebDriver driver)
		{	
			element = driver.findElement(By.id("job_counter_start_0"));
			return element;			
		}	
		
	//stop job_counter_stop_0
		public  static WebElement Stop(WebDriver driver)
		{	
			element = driver.findElement(By.id("job_counter_stop_0"));
			return element;			
		}	
		
}
