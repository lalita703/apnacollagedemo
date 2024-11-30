package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_class.base_class;

public class UploadAnddownload_page extends base_class {
	public UploadAnddownload_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;

	@FindBy(xpath = "//*[@href='#tab_8']")
	private WebElement UploadAnddownload;

	@FindBy(xpath = "//*[@class=\'btn btn-primary my-3\']")
	private WebElement Download;

	@FindBy(xpath = "//*[@class='form-control-file']")
	private WebElement choosefile;

	public void clickonelement() {
		element.click();
	}

	public void clickonUploadAnddownload() {
		UploadAnddownload.click();
	}

	public void clickonDownload() {
		Download.click();
	}

	public void clickonchoosefile() {
		choosefile.click();
	}
}
