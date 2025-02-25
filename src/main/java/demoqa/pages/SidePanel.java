package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //* Login
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement login;

    public LoginPage selectLogin() {
        //click(login);
        clickWithJS(login, 0, 500);
        return new LoginPage(driver, wait);
    }

    //* Alerts
    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        clickWithJS(alerts, 0, 500);
        return new AlertsPage(driver,wait);
    }

    //* Frames
    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;

    public FramesPage selectFrames() {
        clickWithJS(frames, 0, 500);
        return new FramesPage(driver,wait);
    }

    //* BrowserWindows
    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;

    public BrowserWindowsPage selectBrowserWindows() {
        clickWithJS(browserWindows, 0, 500);
        return new BrowserWindowsPage(driver, wait);
    }

    //* Select Menu
    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;

    public WidgetsPage selectSelectMenu() {
        clickWithJS(selectMenu, 0, 800);
        return new WidgetsPage(driver, wait);
    }

    //* Auto Complete
    @FindBy(xpath = "//span[.='Auto Complete']")
    WebElement autoCompleteMenu;

    public AutoCompletePage selectAutoCompleteMenu() {
        click(autoCompleteMenu);
        return new AutoCompletePage(driver, wait);
    }

    //* Buttons
    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttonsMenu;

    public ButtonsPage selectButtons() {
        click(buttonsMenu);
        return new ButtonsPage(driver, wait);
    }

    //* Practice Form
    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceFormMenu;

    public PracticeFormPage selectPracticeFormMenu() {
        click(practiceFormMenu);
        return new PracticeFormPage(driver, wait);
    }
}
