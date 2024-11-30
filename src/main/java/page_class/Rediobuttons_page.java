package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base_class.base_class;

public class Rediobuttons_page extends base_class {
	public Rediobuttons_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement closebtn;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement pratice;

	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;

	@FindBy(xpath ="//*[@href=\"#tab_3\"]")
	private WebElement Rediobtn;

	@FindBy(xpath ="//*[@id=\"yes\"]")
	private WebElement yesbtn;

	@FindBy(xpath ="//*[@id=\"impressive\"]")
	private WebElement impressive;

	@FindBy(xpath ="//*[@id=\"no\"]")
	private WebElement nobtn;

	public void clickonclose() throws InterruptedException 
	{
		Thread.sleep(1000);
		closebtn.click();
	}

	public void clickonpractice() {
		pratice.click();
	}

	public void clickonelement() {
		element.click();
	}

	public void clickonRediobtn() throws InterruptedException
	{
		Thread.sleep(1000);
		Rediobtn.click();
	}

	public void clickonimpressive() {
		impressive.click();
	}

	public void clickonyesbtn() {
		yesbtn.click();
	}

	public void clickonnobtn() {
		nobtn.click();
	}

}
