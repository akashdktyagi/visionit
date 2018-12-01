package src.com.visionit.studentscode.nikita.product.CScart.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_cscart_loginpage {
	WebDriver driver;
	public PO_cscart_loginpage(WebDriver driver) {
		
		this.driver = driver;
		
	}
@FindBy(how=How.LINK_TEXT,using="My Account")
 WebElement acc_click;

@FindBy(how=How.LINK_TEXT,using="Sign in")
WebElement Sign_In_click;

@FindBy(how=How.XPATH,using="//*[@id=\"login_main_login\"]")
WebElement UserName;

@FindBy(how=How.XPATH,using="//*[@id=\"psw_main_login\"]")
WebElement Password;

@FindBy(how=How.XPATH,using="//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div[1]/div/div/div/form/div[3]/div[1]/button")
WebElement Sign1_Click;
public WebElement getAcc_click() {
	return acc_click;
}

public void MyAccount() {
	acc_click.click();
}
public void SignIn() {
	Sign_In_click.click();
	
	
}
public void SetUserName(String username) {
	UserName.clear();
	UserName.sendKeys(username);

}

public void SetPassword(String password) {
	Password.clear();
	Password.sendKeys(password);	
}
public void Sign1_Click() {
	Sign1_Click.click();
}
	
}
