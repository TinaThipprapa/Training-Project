package Run;

import org.testng.annotations.Test;

import Com.pages.Homepage;
import Common.Browser;

import org.testng.annotations.DataProvider;

public class DatasetofFacebook extends Browser{
	
  @Test(dataProvider = "signin")
  public void f(String email, String pass) throws InterruptedException {
	  Homepage home = new Homepage(driver);
	  home.EmailidField(email);
	  home.PasswordField(pass);
	  home.LoginBT();
	  driver.navigate().back();
	  home.clearEmail();
	  Thread.sleep(6000);
  }
  // Scenario 
  // When user enter valid email and valid password
  // when user enter invalid email and valid password
  // when user enter invalid email and invalid password
  // when user enter password but do not enter password
  // When user
  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "jafiefj@iga.com", "a" },
      new Object[] { "tina@gmail.com", "b" },
      new Object[] {"diadfjidf@gami.com","c"},
    };
  }
}
