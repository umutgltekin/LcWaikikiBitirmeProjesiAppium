package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class loginPage {
    By shouldSeeLoginPage= MobileBy.id("com.lcwaikiki.android:id/headerLogin");
    By enterMail=MobileBy.id("com.lcwaikiki.android:id/edtEmail");
    By enterPassword=MobileBy.id("com.lcwaikiki.android:id/edtPassword");
    By clikLoginPageLoginButton=MobileBy.id("com.lcwaikiki.android:id/buttonLogin");
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public loginPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void shouldSeeLoginPage() {
        elementHelper.checkElementPresence(shouldSeeLoginPage);
    }
    public void enterEmail(String mail) {
        elementHelper.sendKey(enterMail,mail);
    }
    public void enterPassword(String password) {
        elementHelper.sendKey(enterPassword,password);
    }
    public void clickLoginpageButton() {
        elementHelper.click(clikLoginPageLoginButton);
    }
}

