package com.pom.pageclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunPage {
	
	@FindBy(name = "username")
    WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
	WebElement forgetpass;
	
	public LoginFunPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void EnterUsername(String user) {
	username.sendKeys(user);
		
   	}
	
	public void EnterPassword(String pass) {
	password.sendKeys(pass);
	
	}
	public void EnterLoginbtn() {
		loginbtn.click();
	}
	public void Enterforgetpas() {
		forgetpass.click();
	}
	
}
