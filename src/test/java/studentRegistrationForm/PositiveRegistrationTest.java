package studentRegistrationForm;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.Keys.CONTROL;
public class PositiveRegistrationTest extends BaseClassStudentRegistration{

@Test
    void positiveFullRegistration(){
    open("/automation-practice-form");
    executeJavaScript("$('#fixedban').remove()");
    executeJavaScript("$('footer').remove()");
    $("input#firstName").setValue("Kostos");
    $("input#lastName").setValue("Dubinin");
    $("input#userEmail").setValue("name@test.ru");
    $("#genterWrapper").$(byText("Male")).click();
    $("input#userNumber").setValue("7999123445");
    $("#dateOfBirthInput").sendKeys(CONTROL + "A");
    $("#dateOfBirthInput").sendKeys("01.01.1995");
    $("#dateOfBirthInput").pressEnter();
    $("#subjectsContainer input").setValue("Maths").pressEnter();
    $("#hobbies-checkbox-1").parent().click();
    $("#uploadPicture").uploadFromClasspath("im.png");
    $("#currentAddress").setValue("Test");
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
