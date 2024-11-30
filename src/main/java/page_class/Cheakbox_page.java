package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base_class.base_class;

public class Cheakbox_page extends base_class {
	public Cheakbox_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[ text()='×']")
	private WebElement closebtn;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement pratice;

	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;

	@FindBy(xpath = "//a[text()='check box']")
	private WebElement cheakbox;

	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/iframe")
	private WebElement frame;

	@FindBy(xpath = "/html/body/label")
	private WebElement mobile;

	@FindBy(xpath = "//*[@id=\"mylaptop\"]")
	private WebElement leptop;

	@FindBy(xpath = "//*[@id=\"mydesktop\"]")
	private WebElement desktop;

	public void clickonclose() throws InterruptedException
	{
		Thread.sleep(1000);
		closebtn.click();
	}

	public void clickonppractice() {
		pratice.click();
	}

	public void clickonelement() {
		element.click();
	}

	public void clickoncheakbox() {
		cheakbox.click();
	}

	public void clickonmobile() {
		driver.switchTo().frame(frame);
		mobile.click();
		//driver.switchTo().defaultContent();
		leptop.click();
		desktop.click();
	}

}
