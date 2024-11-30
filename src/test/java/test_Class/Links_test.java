package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_class.base_class;
import page_class.Links_page;
public class Links_test extends base_class
{
	Links_page ob;
	@BeforeTest
	public void getLaunchUrl()
	{
		getLaunch("Url");
		ob=new Links_page();
	}
	@Test(priority = 0)
	public void clickonclose() throws InterruptedException 
	{
		ob.clickonclose();
	}@Test(priority = 1)
	public void clickonpratice() throws InterruptedException
	{
		ob.clickonpractice();
	}
	@Test(priority = 2)
	public void clickonelement()
	{
		ob.clickonelement();
	}
	@Test(priority = 3)
	public void clickonlinks() throws InterruptedException
	{
		ob.clickonlinks();
	}
	@Test(priority = 4)
	public void clickondemopage()
	{
		ob.clickondemopage();
	}
	@Test(priority = 5)
	public void clickoncreated()
	{
		ob.clickoncreated();
	}
	@Test(priority = 6)
	public void clickonnocontent()
	{
		ob.clickonnocontent();
	}
	@Test(priority = 7)
	public void clickonmoved()
	{
		ob.clickonmoved();
	}
	@Test(priority = 8)
	public void clickonbadrequest()
	{
		ob.clickonbadrequest();
	}
	@Test(priority = 9)
	public void clickonUnauthorized()
	{
	  ob.clickonUnauthorized();
	}
	@Test(priority = 10)
	public void clickonForbidden()
	{
		ob.clickonForbidden();
	}
	@Test(priority = 11)
	public void clickonnotFound()
	{
		ob.clickonnotFound();
	}
}
