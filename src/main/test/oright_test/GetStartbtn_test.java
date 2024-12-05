package oright_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import oright_pages.GetStartbtn;

public class GetStartbtn_test extends BaseLibrary{
	GetStartbtn obj;
	@BeforeTest
	public void getLaunchUrl_testingbaba()
	{
		getLaunchUrl("https://www.oright.in/kamdhenu/login");
		obj = new GetStartbtn();
	}
	
	@Test(priority=1)
	public void gettitle_oright()
	{
		obj.getTitle();
	}
	@Test(priority=2)
	public void getstarted_oright()
	{
		obj.getstart();
	}
	@Test(priority=3)
	public void getlogin_oright()
	{
		obj.fillDetails();
	}
	
}