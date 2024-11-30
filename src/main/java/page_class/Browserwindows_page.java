package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_class.base_class;

public class Browserwindows_page extends base_class
{
public Browserwindows_page()
{
	PageFactory.initElements(driver, this);
}
  @FindBy(xpath = "//*[@data-target=\'#alerts\']")
  private WebElement Alerts_frame;
  
  @FindBy(xpath = "//*[@href='#tab_11']")
  private WebElement Browserwindow;
  
  @FindBy(xpath = "//*[@id=\"tab_11\"]/div[1]/a")
  private WebElement newtab; 
  
  @FindBy(xpath = "//*[@id=\"tab_11\"]/div[2]/a") 
  private WebElement newwindow;
  
  @FindBy(xpath = "//*[@id=\"tab_11\"]/div[3]/a")
  private WebElement newwindowmessage;
  
  public void clickonAlerts_frame()
  {
	  Alerts_frame.click();
  }
  public void clickonBrowserwindow()
  {
	  Browserwindow.click();
  }
  public void clickonnewtab()
  {
	  newtab.click();
  }
  public void clickonnewwindow()
  {
	  newwindow.click();
  }
  public void clickonnewwindowmessage()
  {
	  newwindowmessage.click();
  }
}
