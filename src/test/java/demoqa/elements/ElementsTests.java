package demoqa.elements;

import demoqa.core.TestBase;
import demoqa.pages.ButtonsPage;
import demoqa.pages.HomePage;
import demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).getElements().hideAds();
        new SidePanel(app.driver, app.wait).selectButtons().hideAds();
    }

    @Test
    public void doubleClickButtonPositiveTest(){
        new ButtonsPage(app.driver, app.wait)
                .doubleClick()
                .verifyDoubleClickMessage("You have done a double click")
                ;
    }

    @Test
    public void rightClickButtonPositiveTest() {
        new ButtonsPage(app.driver, app.wait)
                .rightClick()
                .verifyRightClickMessage("You have done a right click")
                ;
    }

    @Test
    public void dynamicClickButtonPositiveTest() {
        new ButtonsPage(app.driver, app.wait)
                .dynamicClick()
                .verifyDynamicClickMessage("You have done a dynamic click")
                ;
    }
}
