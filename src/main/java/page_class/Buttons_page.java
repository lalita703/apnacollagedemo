package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 import base_class.base_class;

public class Buttons_page extends base_class
{
	public Buttons_page()
	{
		PageFactory.initElements(driver, this);
 	}
	@FindBy(xpath ="//button[text()='×']")
	private WebElement closebtn;

	@FindBy(xpath ="//a[text()='Practice']")
	private WebElement pratice;

	@FindBy(xpath ="//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath = "//*[@href='#tab_5']")
	private WebElement buttons;
	
	@FindBy(xpath = "ondblclick=\"doubletext()\"")
	private WebElement doubleclick;
	
	@FindBy(xpath = "//*[@oncontextmenu='righttext()']")
	private WebElement rightclick;
	
	@FindBy(xpath = "//*[@onclick='clicktext()']")
	private WebElement clickme;
	
	public void clickonclose() throws InterruptedException
	{
		Thread.sleep(1000);
		closebtn.click();
	}
	public void clickonpratice()  
	{
 		pratice.click();
	}
	public void clickonelement()
	{
		element.click();
    }
	public void clickonbuttons() 
	{
 		buttons.click();
	}
	public void doubleclick_perform() 
	{
		 doubleclick.click();
	}
	public void clickme()
	{
	  clickme.click();
	}
	public void clickonrightclick()
	{
		rightclick.click();
 	}
      }
