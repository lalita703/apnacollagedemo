package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base_class.base_class;
import page_class.Webtable_page;

public class Webtable_test extends base_class {

	Webtable_page ob;

	@BeforeTest
	public void getLaunchUrl() {
		getLaunch("Url");
		ob = new Webtable_page();
	}

	@Test(priority = 0)
	public void clickonclose() throws InterruptedException {
		ob.clickonclose();
	}

	@Test(priority = 1)
	public void clickonpractice() {
		ob.clickonpractice();
	}

	@Test(priority = 2)
	public void clickonelement() throws InterruptedException {
		ob.clickonelement();
		
	}

	@Test(priority = 3)
	public void clickonfilldetails() throws InterruptedException 
	{
      ob.clickonfilldetails();
	}

	 
}
