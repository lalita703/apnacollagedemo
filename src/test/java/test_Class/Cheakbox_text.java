package test_Class;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.BaseLibrary;
import page_class.Cheakbox_page;

public class Cheakbox_text extends BaseLibrary {
	Cheakbox_page ob;
	@BeforeTest
	public void getLaunchUrl(String string) {
		getLaunchUrl("Url");
 		ob = new Cheakbox_page();
	}

	@Test(priority = 0)
	public void clickonclose() throws InterruptedException {
		ob.clickonclose();
	}

	@Test(priority = 1)
	public void clickonpractice() {
		ob.clickonppractice();
	}

	@Test(priority = 2)
	public void clickonelement() {
		ob.clickonelement();
	}

	@Test(priority = 3)
	public void clickoncheakbox() {
		ob.clickoncheakbox();
	}

	@Test(priority = 4)
	public void clickonmobile() {
		ob.clickonmobile();
	}

	@Test(priority = 5)
	public void clickonleptop() {

	}

}
