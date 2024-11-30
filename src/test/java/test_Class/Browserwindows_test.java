package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_class.base_class;
import page_class.Browserwindows_page;

public class Browserwindows_test extends base_class 
{
	Browserwindows_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getLaunch("Url");
	  ob= new Browserwindows_page();
	}
	@Test(priority = 0)
	public void clickonAlerts_frame()
	{
		ob.clickonAlerts_frame();
	}
	@Test(priority = 1)
	public void clickonBrowserwindow()
	{
		ob.clickonBrowserwindow();
	}
	@Test(priority = 2)
	public void clickonnewtab()
	{
		ob.clickonnewtab();
	}
	@Test(priority = 3)
	public void clickonnewwindow()
	{
		ob.clickonnewwindow();
	}
	@Test(priority = 4)
	public void clickonnewwindowmessage()
	{
		ob.clickonnewwindowmessage();
	}
}
