package page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_class.base_class;

public class Frames_page extends base_class
{
public Frames_page() 
{
	PageFactory.initElements(driver, this);
}
  @FindBy(xpath = "//*[@data-target=\'#alerts\']")
  private WebElement Alerts_frame;

  @FindBy(xpath = "")
  private Webtable_page  frames;


}
