package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_class.base_class;
import page_class.logIn_page;

public class login_Test extends base_class {
	logIn_page ob;

	@BeforeTest
	public void getLauncUrl() {
		getLaunch("Url");
		ob = new logIn_page();
	}

	@Test(priority = 0)
	public void clickonclose() {
		ob.clickonclosepratice();
	}

	@Test(priority = 1)
	public void getTitleofthepage() {
		ob.getTitle();
	}

	@Test(priority = 2)
	public void geturlofthepage() {
		ob.getturl();
	}

}
