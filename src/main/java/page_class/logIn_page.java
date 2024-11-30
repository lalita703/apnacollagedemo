 package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_class.base_class;
 
public class logIn_page extends base_class {
	public logIn_page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[ text()='×']")
	private WebElement closebtn;

	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement pratice;

	public void clickonclosepratice() {
		closebtn.click();
		pratice.click();
	}

	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title of the page" + title);
	}

	public void getturl() {
		String Url = driver.getCurrentUrl();
		System.out.println("Url of the page is" + Url);
	}
 }
