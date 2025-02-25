package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframes;

    public FramesPage getListOfFrames() {
        int numberOfFrames = ((Long) js.executeScript("return window.length")).intValue();
        //System.out.println(numberOfFrames);
        if(iframes == null || iframes.isEmpty()){
            System.out.println("No iFrame was found using @FindBy");
            return this;
        }
        System.out.println("Number of iFrames on the page is: [" + numberOfFrames + "]");
        System.out.println("Number of iFrames on the page is: [" + iframes.size() + "]");

        for(WebElement iFrame : iframes) {
            String iFrameID = iFrame.getAttribute("id");
            String iFrameSRC = iFrame.getAttribute("src");
            System.out.println("IFrame found ID: [" + (iFrameID != null ? iFrameID : "No ID") + "], SRC: [" + (iFrameSRC != null ? iFrameSRC : "No SRC") + "]");
        }
        return this;
    }

    public FramesPage switchToIFrameByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }

    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;

    public FramesPage verifyIFrameText(String text) {
        shouldHaveText(sampleHeading, text, 5000);
        return this;
    }

    public FramesPage switchToIFrameByName(String name) {
        //scrollTo(500);
        driver.switchTo().frame(name);
        return this;
    }
}
