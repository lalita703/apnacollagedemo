package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_class.base_class;
import page_class.Rediobuttons_page;

public class Rediobuttons_test extends base_class {
	Rediobuttons_page ob;

	@BeforeTest
	public void getLaunchUrl() {
		getLaunch("Url");
		ob = new Rediobuttons_page();
	}

	@Test(priority = 0)
	private void clickonclose() throws InterruptedException {
		ob.clickonclose();
	}

	@Test(priority = 1)
	private void clickonpractice() {
		ob.clickonpractice();
	}

	@Test(priority = 2)
	private void clickonelement() {
		ob.clickonelement();
	}

	@Test(priority = 3)

	private void clickonRediobtn() throws InterruptedException
	{
		ob.clickonRediobtn();
	}

	@Test(priority = 4)
	private void clickonyesbtn() {
		ob.clickonyesbtn();
	}

	@Test(priority = 5)
	private void clickonimpressive() {
		ob.clickonimpressive();
	}

	@Test(priority = 6)
	private void clickonno() {
		ob.clickonnobtn();
	}

}
