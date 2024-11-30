
package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base_class.base_class;

public class Webtable_page extends base_class
{
	public Webtable_page() 
	{
		PageFactory.initElements(driver, this);
 	}
	@FindBy(xpath ="//button[text()='×']")
	private WebElement closebtn;

	@FindBy(xpath ="//a[text()='Practice']")
	private WebElement pratice;

	@FindBy(xpath ="//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath ="//*[@href=\"#tab_4\"]")
	private WebElement webtable;
	
	@FindBy(xpath = "//*[@id=\"tab_4\"]/div/iframe")
	private WebElement frame;
	
	@FindBy(xpath ="//*[@id=\"name\"]")
	private WebElement name;

	@FindBy(xpath ="//*[@name=\"email\"]")
	private WebElement email;

	@FindBy(xpath ="//*[text()='Save']")
	private WebElement save;
	
	public void clickonclose() throws InterruptedException
	{
		Thread.sleep(2000);
		closebtn.click();
	}
	public void clickonpractice() {
		pratice.click();
	}
	public void clickonelement() throws InterruptedException
	{
	Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		webtable.click();
	}
	public void clickonfilldetails() throws InterruptedException
	{
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		name.sendKeys("lalita yadav");
		Thread.sleep(1000);
		email.sendKeys("lalitayadav@gmail.com");
		save.click();
	}
	
	}
    

