package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(id = "doubleClickBtn")
    WebElement doubleClickBtn;

    public ButtonsPage doubleClick() {
        new Actions(driver).doubleClick(doubleClickBtn).perform();
        return this;
    }

    @FindBy(id = "doubleClickMessage")
    WebElement doubleClickMessage;

    public ButtonsPage verifyDoubleClickMessage(String message) {
        shouldHaveText(doubleClickMessage, message, 5000);
        return this;
    }

    @FindBy(id = "rightClickBtn")
    WebElement rightClickBtn;

    public ButtonsPage rightClick() {
        //pause(100);
        new Actions(driver).contextClick(rightClickBtn).perform();
        return this;
    }

    @FindBy(xpath = "//button[.='Click Me']")
    WebElement dynamicClickBtn;

    public ButtonsPage dynamicClick() {
        click(dynamicClickBtn);
        return this;
    }

    @FindBy(id = "rightClickMessage")
    WebElement rightClickMessage;

    public ButtonsPage verifyRightClickMessage(String message) {
        shouldHaveText(rightClickMessage, message, 5000);
        return this;
    }

    @FindBy(id = "dynamicClickMessage")
    WebElement dynamicClickMessage;

    public ButtonsPage verifyDynamicClickMessage(String message) {
        shouldHaveText(dynamicClickMessage, message, 5000);
        return this;
    }
}
