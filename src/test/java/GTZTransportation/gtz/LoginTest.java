package GTZTransportation.gtz;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import GTZTransportation.pages.LoginPage;

public class LoginTest extends BaseClass {

	LoginPage login;

	public LoginTest() {
		super();
	}

	@BeforeClass
	public void setup() {

		initialization();
		login = new LoginPage();

	}

	@Test
	public void Verifytitle() {
		login.LoginPageTitle();
	}

}
