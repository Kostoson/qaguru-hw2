package studentRegistration.tests;

import org.junit.jupiter.api.Test;
import studentRegistration.tests.BaseClassStudentRegistration;


public class PositiveRegistrationTest extends BaseClassStudentRegistration {

//todo переставить точки в вызовах методов
    @Test
    void positiveFullRegistration() {

        studentRegistrationPage.
                openPage().
                closingBanners().
                setFirstName("Kostos").
                setLastName("Dubinin").
                setEmail("name@test.ru").
                setGender("Male").
                setPhoneNumber("7999123445").
                setBirthdayDate("20", "January", "1995").
                setSubject("Maths").
                setHobby("Sports").
                uploadPicture("im.png").
                setAddress("Test").
                setStateCity("NCR").
                setCity("Delhi").
                submitButtonClick();

        studentRegistrationPage.verifyRegistrationModalAppear().
                tableVerifyResultAppears("Student Name", "Kostos Dubinin").
                tableVerifyResultAppears("Student Email", "name@test.ru").
                tableVerifyResultAppears("Gender", "Male").
                tableVerifyResultAppears("Mobile", "7999123445").
                tableVerifyResultAppears("Date of Birth", "20 January,1995").
                tableVerifyResultAppears("Subjects", "Maths").
                tableVerifyResultAppears("Hobbies", "Sports").
                tableVerifyResultAppears("Picture", "im.png").
                tableVerifyResultAppears("Address", "Test").
                tableVerifyResultAppears("State and City", "NCR Delhi");

    }
}
