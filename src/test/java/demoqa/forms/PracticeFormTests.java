package demoqa.forms;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.PracticeFormPage;
import demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).getForms().hideAds();
        new SidePanel(app.driver, app.wait).selectPracticeFormMenu().hideAds();
    }

    @Test
    public void practiceFormPositiveTest(){
        new PracticeFormPage(app.driver, app.wait)
                .enterPersonalData("Kate", "Hudson", "kate_hudson@mail.de", "1234567890")
                .selectGender("Female")
                .chooseDateAsString("05 April 1987")
                //.chooseDate("05", "April", "1987")
                .enterSubjects(new String[]{"Maths", "English"})
                .chooseHobbys(new String[]{"Sports", "Music"})
                .uploadPicture("C:\\Users\\baben\\Downloads\\test_image.png")
                .enterCurrentAddress("Blumen avenue, 45/8")
                .enterState("NCR")
                .enterCity("Delhi")
                .submitForm()
                .verifySuccessRegistration("Thanks for submitting the form")
                ;
    }

    @Test
    @Parameters({"firstName", "lastName", "email", "phone"})
    public void practiceFormParameterPositiveTest(String firstName, String lastName, String email, String phone){
        new PracticeFormPage(app.driver, app.wait)
                .enterPersonalData(firstName, lastName, System.currentTimeMillis() + email, phone)
                .selectGender("Female")
                .chooseDateAsString("05 April 1987")
                //.chooseDate("05", "April", "1987")
                .enterSubjects(new String[]{"Maths", "English"})
                .chooseHobbys(new String[]{"Sports", "Music"})
                .uploadPicture("C:\\Users\\baben\\Downloads\\test_image.png")
                .enterCurrentAddress("Blumen avenue, 45/8")
                .enterState("NCR")
                .enterCity("Delhi")
                .submitForm()
                .verifySuccessRegistration("Thanks for submitting the form")
                ;
    }
}
