package com.pom.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pom.baseclass.Baseclass;
import com.pom.pageclass.LoginFunPage;

public class TestCaseNo1 extends Baseclass {

	@Test(description = "Login Functionality")
	public void Login() {
    LoginFunPage lf = new LoginFunPage(driver);
	lf.EnterUsername("Admin");
	lf.EnterPassword("admin123");
	lf.EnterLoginbtn();
	//lf.Enterforgetpas();
		
		
	}
}
