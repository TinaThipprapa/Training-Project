package Run;

import org.testng.annotations.Test;

import Com.pages.Homepage;
import Common.Browser;


public class Home_site extends Browser {
	
  @Test
  public void f() {
	  Homepage home = new Homepage(driver);
	  home.EmailidField("noondfe62@gmail.com");
	  home.PasswordField("dfuefha");
	  home.LoginBT();
  }
  
}
