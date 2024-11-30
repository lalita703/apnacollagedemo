package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_class.base_class;

public class Alerts_page extends base_class
{
public Alerts_page()
{
	 PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@data-target=\'#alerts\']")
private WebElement Alerts_frame;

 @FindBy(xpath = "//*[@href='#tab_12']")
 private WebElement Alerts;
 
 @FindBy(xpath = "//*[@onclick='myalert()']")
 private WebElement click1;
 
 @FindBy(xpath = "//*[@onclick='aftersec5()']")
 private WebElement click2;
 
 @FindBy(xpath = "//*[@onclick='myconfirm()']")
 private WebElement click3;
 
 @FindBy(xpath = "//*[@onclick='myprompt()']")
 private WebElement click4;
 
 public void clickonAlerts_frame()
 {
	  Alerts_frame.click();
 }
 public void clickonclick1() throws InterruptedException
 {
	 Thread.sleep(1000);
	 click1.click();
 }
 public void clickonclick2()
 {
	 click2.click();
 }
 public void clickonclick3()
 {
	 click3.click();
 }
 public void clickonclick4()
 {
	 click4.click();
 }
}
//truwgsdjgfuyfsf


