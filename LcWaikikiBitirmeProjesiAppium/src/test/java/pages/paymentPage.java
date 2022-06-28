package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class paymentPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public paymentPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkPaymentPage(){

    }
}
