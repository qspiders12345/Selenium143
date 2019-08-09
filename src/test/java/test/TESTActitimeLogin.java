package test;

import java.io.IOException;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMActitimeLogin;

public class TESTActitimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		POMActitimeLogin login=new POMActitimeLogin(driver);
		login.loginMethod();
	}
}