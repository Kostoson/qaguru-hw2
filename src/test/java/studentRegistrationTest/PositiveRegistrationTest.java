package studentRegistrationTest;

import org.junit.jupiter.api.Test;
import pages.StudentRegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PositiveRegistrationTest extends BaseClassStudentRegistration {


    @Test
    void positiveFullRegistration() {


        studentRegistrationPage.
                openPage().
                setFirstName("Kostos").
                setLastName("Dubinin").
                setEmail("name@test.ru").
                setGender("Male").
                setPhoneNumber("7999123445").
                setBirthdayDate("20", "January", "1995").
                setSubject("Maths").
                setHobbie("Sports").
                uploadPicture("im.png").
                setAddress("Test").
                stateCity("NCR");




        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".table-responsive").shouldHave(text("Kostos Dubinin"),
                text("name@test.ru"),
                text("Kostos Dubinin"),
                text("Male"),
                text("7999123445"),
                text("01 January,1995"),
                text("Maths"),
                text("Sports"),
                text("im.png"),
                text("Test"),
                text("NCR Delhi")
        );

    }
}
