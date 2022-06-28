package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class productPage {
    By shouldSeeProductPage= MobileBy.id("com.lcwaikiki.android:id/toolbarTitle");
    By clickFilterButon=MobileBy.id("com.lcwaikiki.android:id/filter_product");
    By clickColour=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Renk\")");
    By searchColour=MobileBy.id("com.lcwaikiki.android:id/searchFilterEditText");
    By selectColour=MobileBy.id("com.lcwaikiki.android:id/checked_color_text");
    By clickApplyButton=MobileBy.id("com.lcwaikiki.android:id/subFilterButton");
    By clickshowProduct=MobileBy.id("com.lcwaikiki.android:id/buttonFilter");
    By shouldSeeProductDetail=MobileBy.id("com.lcwaikiki.android:id/productImage");
    By clickProduct=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]");
    By clickShowDeatil=MobileBy.id("com.lcwaikiki.android:id/scrollCardView");
    By clickProductSize=MobileBy.xpath("(//android.widget.FrameLayout[@content-desc=\"Stokta\"])[2]");
    By clickAddCart=MobileBy.id("com.lcwaikiki.android:id/productDetailBasket");

    By clickCartButton=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Git\")");




    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public productPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void shouldSeeProductsPage(){
        elementHelper.checkElementPresence(shouldSeeProductPage);
    }
    public void clickFilterButton(){
        elementHelper.click(clickFilterButon);
    }
    public void clickColour(String colour){
        elementHelper.click(clickColour);
        elementHelper.sendKey(searchColour,colour);
        elementHelper.click(selectColour);
        elementHelper.click(clickApplyButton);
        elementHelper.click(clickshowProduct);
    }
    public void shouldSeeProductDetailPage(){
        elementHelper.checkElementPresence(shouldSeeProductDetail);
    }
    public void clickName(){
        elementHelper.click(clickProduct);
    }
    public void clickProductSize(){
        elementHelper.click(clickShowDeatil);
        elementHelper.click(clickProductSize);

    }
    public void clickAddCart(){
        elementHelper.click(clickAddCart);
    }
    public void clickCartButton(){
        elementHelper.click(clickCartButton);
    }





}
