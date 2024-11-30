package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base_class.base_class;
import page_class.Buttons_page;

public class Buttons_test extends base_class
{
	Buttons_page ob;
	@BeforeTest
	public void getLaunchUrl()
	{
		getLaunch("Url");
		ob=new Buttons_page();
	}
	@Test(priority = 0)
	public void clickonclose() throws InterruptedException
	{
		ob .clickonclose();
	}
	@Test(priority = 1)
	public void clickonPractice()
	{
	 ob.clickonpratice();
	}
	@Test(priority = 2)
	public void clickonelement() throws InterruptedException
	{
		Thread.sleep(1000);
		ob.clickonelement();
	}
	@Test(priority = 3)
	public void clickonbuttons() throws InterruptedException
	{
		Thread.sleep(1000);
		ob.clickonbuttons();
	}
	@Test(priority = 4)
	public void clickondoubleclickme() 
	{
		ob.doubleclick_perform();
	}
	@Test(priority = 5)
	public void clickme()
	{
		ob.clickme();
	}
	@Test(priority = 6)
	public void clickonrightclickme()
	{
		ob.clickonrightclick();
	}
}
