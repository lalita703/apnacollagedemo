package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 import base_class.base_class;
import page_class.Testbox_page;

public class Testbox_test extends base_class
{

	Testbox_page ob;
	@BeforeTest
	public void getLaunchUrl()
	{
		getLaunch("Url");
		ob= new Testbox_page();	}
	@Test(priority = 0)
	public void clickonclose() throws InterruptedException
	{
		Thread.sleep(1000);
		ob.clickonclose();
	}@Test(priority = 1)
	public void clickonpratice()
	{
		ob.clickonpractice();
	}
	@Test(priority = 2)
	public void clickonelement() throws InterruptedException
	{
		Thread.sleep(1000);
		ob.clickonelement();
	}
	@Test(priority = 3)
	public void clickontextbox() throws InterruptedException
	{ 
		ob.clickontextbox();
	}
	@Test(priority = 4)
	public void clickonsubmit()
	{
		ob.filldetails();
	}
	//@Test(priority = 5)
//	public void validate()
//	{
//		ob.validate();
//	}
	}

