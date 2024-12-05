package oright_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class GetStartbtn extends BaseLibrary{
	String path = "C:\\Users\\sachi\\eclipse-workspace\\OrightTask\\testdata\\username.xlsx";
	
	public GetStartbtn()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/app-login-platform/footer/button")
	private WebElement startbtn;
	@FindBy(xpath="//*[@id=\"phoneOrUsernameInput\"]")
	private WebElement txtbox;
	@FindBy(xpath="//*[@class=\"custom-btn btn-disabled\"]")
	private WebElement nextbtn;
	
	@FindBy(xpath="//*[@type=\"password\"]")
	private WebElement passwd;
	@FindBy(xpath="//*[@placeholder=\"Customer Code\"]")
	private WebElement customercode;
	@FindBy(xpath="//*[@class=\"custom-btn btn-disabled\"]")
	private WebElement loginbtn;
	
	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println("title is:"+title);
	}
	public void getstart()
	{
		startbtn.click();
	}
	public void fillDetails()
	{
		txtbox.sendKeys(getReaddata(path, 0, 0, 1));
		nextbtn.click();	
		passwd.sendKeys(getReaddata(path,0,1,1));
		customercode.sendKeys(getReaddata(path,0,2,1));
		loginbtn.click();
	}
	
}