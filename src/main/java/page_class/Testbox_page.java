  package page_class;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_class.base_class;

public class Testbox_page extends base_class {
	public Testbox_page() {
		PageFactory.initElements(driver, this);
	}
    String path="C:\\Users\\Gadget gully\\eclipse-workspace\\15SepSelenium_Automation\\testdata\\getReadData1.xlsx";
	@FindBy(xpath = "//*[text()='×']")
	private WebElement closebtn;

	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement pratice;

	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
    
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement textbox;

	@FindBy(xpath = "//*[@id=\"fullname1\"]")
	private WebElement fullname;

	@FindBy(xpath = "//*[@id='fullemail1']")
	private WebElement email;

	@FindBy(xpath = "//*[@id='fulladdresh1']")
	private WebElement cadd;

	@FindBy(xpath = "//*[@id='paddresh1']")
	private WebElement padd;

	@FindBy(xpath = "//input[@value=\"Submit\"]")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
	private WebElement list;

	public void clickonclose() {
		closebtn.click();
	}

	public void clickonpractice() {
		pratice.click();
	}

	public void clickonelement() {
		element.click();
	}

	public void clickontextbox() throws InterruptedException {
		textbox.click();
		Thread.sleep(3000);
	}

	public void filldetails() {
		fullname.sendKeys("Lalita Yadav");
		System.out.println(getReadData(path,0, 1, 0));
	System.out.println(getReadData(path,0, 0, 0));
	System.out.println(getReadData(path,0, 1, 1));
		email.sendKeys(getReadData(path, 0, 1, 1));
		cadd.sendKeys(getReadData(path, 0, 1, 2));
	    padd.sendKeys("Agra");
	    submit.click();
}
//	public void validate()
//	{
//		SoftAssert softassert =new SoftAssert();
//		ArrayList<String> expected = new ArrayList<String>();
//		ArrayList<String>actual=new ArrayList<String>();
//		for(int i=0;i<4;i++)
//		{
//			expected.add(getReadData(0, 1, i));
//		}
//			for(int i=1;i<list.size();i=i+2)
//			{
//		actual.add(list.get(i).getText());
//		}
//			for(int i=0;i<expected.size(); i++)
//			{
//			//Assert.assertEquals(actual.get(i),expected.get(i));
//			softassert.assertEquals(actual.get(i), expected.get(i));
//
//	}
//			softassert.assertAll();
//			System.out.println("successfully validate");
	}  
//}
 
