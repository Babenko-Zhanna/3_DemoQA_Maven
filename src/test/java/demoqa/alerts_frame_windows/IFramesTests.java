package demoqa.alerts_frame_windows;

import demoqa.core.TestBase;
import demoqa.pages.FramesPage;
import demoqa.pages.HomePage;
import demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFramesTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).getAlertsFrameWindows().hideAds();
        new SidePanel(app.driver, app.wait).selectFrames().hideAds();
    }

    @Test
    public void iFramePositiveTest() {
        new FramesPage(app.driver, app.wait)
                .getListOfFrames();
    }

    @Test
    public void switchToIFrameByIndexPositiveTest() {
        new FramesPage(app.driver, app.wait)
                .switchToIFrameByIndex(2)
                .verifyIFrameText("This is a sample page");
    }

    @Test
    public void switchToIFrameByNamePositiveTest() {
        new FramesPage(app.driver, app.wait)
                .switchToIFrameByName("frame1")
                .verifyIFrameText("This is a sample page");
    }
}
