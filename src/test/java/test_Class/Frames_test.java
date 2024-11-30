package test_Class;

import org.testng.annotations.BeforeTest;

import base_class.base_class;
import page_class.Frames_page;

public class Frames_test extends base_class
{

	Frames_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getLaunch("Url");
	}
}

