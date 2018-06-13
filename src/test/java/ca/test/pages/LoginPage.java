package ca.test.pages;

import ca.test.utils.CommonUtils;
import ca.test.utils.KnowsTestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    CommonUtils utils = new CommonUtils();

    @FindBy(id = "modal-login-button")
    public WebElement login;

    @FindBy(id = "usernameLogin")
    public WebElement username;

    @FindBy(id = "loginPassword")
    public WebElement password;

    @FindBy(id = "btn_login")
    public WebElement ClickLogin;

    //    initialize the constructor

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void clicklogin(){
        utils.waitForElements(login ,KnowsTestContext.timeout, KnowsTestContext.driver);
        login.click();


    }

    public void enterusername(String user){
        utils.waitForElements(username , KnowsTestContext.timeout , KnowsTestContext.driver);
        username.sendKeys(user);
    }

    public void enterpassword(String pass) {
        utils.waitForElements(password , KnowsTestContext.timeout , KnowsTestContext.driver);
        password.sendKeys(pass);
    }

    public void clickonlogin(){
        utils.waitForElements(ClickLogin , KnowsTestContext.timeout , KnowsTestContext.driver);
        ClickLogin.click();
    }
}
