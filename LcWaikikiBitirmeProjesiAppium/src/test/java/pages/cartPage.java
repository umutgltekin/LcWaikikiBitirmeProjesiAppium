package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class cartPage {
    By checkCArtPage= MobileBy.id("com.lcwaikiki.android:id/toolbarTitle");
    By checkProductSize=MobileBy.id("com.lcwaikiki.android:id/itemBasketSizeText");
    By checkProductName=MobileBy.id(("com.lcwaikiki.android:id/itemBasketTitleText"));
    By checkProductNummberOf=MobileBy.id("com.lcwaikiki.android:id/itemBasketCountText");
    By clickPaymentPage=MobileBy.id("com.lcwaikiki.android:id/tv_go_checkout");
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public cartPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkCartPage(){
        elementHelper.checkElementPresence(checkCArtPage);
    }
    public void checkProductSize(String size){
        elementHelper.checkElementWithText(checkProductSize,size);
    }
    public void checkProductName(String name){
        elementHelper.checkElementWithText(checkProductName,name);
    }
    public void checkProductNummberOf(int nummber){
        elementHelper.checkElementWithText(checkProductNummberOf, String.valueOf(nummber));
    }
    public void clickPaymentPageButton(){
        elementHelper.click(clickPaymentPage);

    }
}
