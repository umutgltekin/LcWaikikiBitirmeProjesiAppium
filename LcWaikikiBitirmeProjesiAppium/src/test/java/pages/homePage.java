package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;


public class homePage {
    By clikcSkipButton=MobileBy.id("com.lcwaikiki.android:id/tvNext");
    By userNavigatesToLCWaikiki=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/ivTutorial\")");
   By clickLoginButton=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Profil\")");
    By shouldSeeHomePage=MobileBy.id("com.lcwaikiki.android:id/barcodeTitleText");
    By clikcCategoryButton=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By clickgiyimButton=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Giyim\")");
    By draganddrop1=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tunik\")");
    By dragAndDrop2=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bluz\")");
    By clickProduct=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bluz\")");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public homePage(AppiumDriver driver) {
        this.driver = driver;

        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void userNavigatestoLCWaikiki(){
        elementHelper.checkElementPresence(userNavigatesToLCWaikiki);

    }
    public void clikSkipButton(){
        elementHelper.click(clikcSkipButton);
    }

    public void clickLoginButton() {
        elementHelper.click(clickLoginButton);

    }

    public void shouldSeeHomePage(){
        elementHelper.checkElementPresence(shouldSeeHomePage);
    }
    public void clickButton(){
        elementHelper.click(clikcCategoryButton);
    }
    public void clickgiyimButton(){
    elementHelper.click(clickgiyimButton);

    TouchAction action=new TouchAction(driver);
    action.press(PointOption.point(426,1516)).waitAction(waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(348,878)).release().perform();
    }
    public void clickProduct(){
        elementHelper.click(clickProduct);
    }


}
