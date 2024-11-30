package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_class.base_class;

public class Links_page extends base_class {
	public Links_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement closebtn;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement pratice;

	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;

	@FindBy(xpath = "//*[@href='#tab_6']")
	private WebElement links;

	@FindBy(xpath = "//*[@id=\"tab_6\"]/p[1]/a")
	private WebElement demopage;

	@FindBy(xpath = "//*[@id=\"tab_6\"]/ul/li[1]/a")
	private WebElement created;

	@FindBy(xpath = "//*[@onclick=\"Content()\"]")
	private WebElement nocontent;

	@FindBy(xpath = "//*[@onclick=\"Moved()\"]")
	private WebElement moved;

	@FindBy(xpath = "//*[@onclick=\"Request()\"]")
	private WebElement badrequest;

	@FindBy(xpath = "//*[@onclick=\"Unauthorized()\"]")
	private WebElement Unauthorized;

	@FindBy(xpath = "//*[@onclick=\"Forbidden()\"]")
	private WebElement Forbidden;

	@FindBy(xpath = "//*[@onclick=\"Found()\"]")
	private WebElement notFound;

	public void clickonclose() throws InterruptedException {
		Thread.sleep(1000);
		closebtn.click();
	}

	public void clickonpractice() throws InterruptedException {
		Thread.sleep(1000);
		pratice.click();
	}

	public void clickonelement() {
		element.click();
	}

	public void clickonlinks() throws InterruptedException {
		Thread.sleep(1000);
		links.click();
	}

	public void clickondemopage() {
		demopage.click();
	}

	public void clickoncreated() {
		created.click();
	}

	public void clickonnocontent() {
		nocontent.click();
	}

	public void clickonmoved() {
		moved.click();
	}

	public void clickonbadrequest() {
		badrequest.click();
	}

	public void clickonUnauthorized() {
		Unauthorized.click();
	}

	public void clickonForbidden() {
		Forbidden.click();
	}

	public void clickonnotFound() {
		notFound.click();
	}
}
