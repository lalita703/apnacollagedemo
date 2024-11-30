package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_class.base_class;
import page_class.UploadAnddownload_page;

public class UploadAnddownload_test extends base_class {
	UploadAnddownload_page ob;

	@BeforeTest
	public void getlaunchUrl() {
		getLaunch("Url");
		ob = new UploadAnddownload_page();
	}

	@Test(priority = 0)
	public void clickonelement() {  
		ob.clickonelement();
	}

	@Test(priority = 2)
	public void clickonUploadAnddownload() {
		ob.clickonUploadAnddownload();
	}

	@Test(priority = 3)
	public void clickonDownload() {
		ob.clickonDownload();
	}

	@Test(priority = 4)
	public void clickonchoosefile() {
		ob.clickonchoosefile();
	}
}
