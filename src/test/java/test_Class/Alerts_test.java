package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_class.base_class;
import page_class.Alerts_page;

public class Alerts_test extends base_class
{
	Alerts_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getLaunch("Url");
		ob=new Alerts_page();
	}
	@Test(priority = 0)
	public void clickonAlerts_frame()
	{
		ob.clickonAlerts_frame();
	}
	@Test(priority = 1)
	public void clickonclick1() throws InterruptedException
	{
		ob.clickonclick1();
	}
	@Test(priority = 2)
	public void clickonclick2()
	{
		ob.clickonclick2();
	}
	@Test(priority = 3)
	public void clickonclick3()
	{
		ob.clickonclick3();
	}
	@Test(priority = 4)
	public void clickonclick4()
	{
		ob.clickonclick4();
	}
//6583768365863
}
