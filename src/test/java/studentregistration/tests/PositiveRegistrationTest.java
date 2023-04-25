package studentregistration.tests;

import com.github.javafaker.Address;
import org.junit.jupiter.api.Test;
import studentregistration.pages.StudentRegistrationPage;
import studentregistration.utils.RandomUtil;


public class PositiveRegistrationTest extends BaseClassStudentRegistration {
    StudentRegistrationPage studentRegistrationPage = new StudentRegistrationPage();


    RandomUtil randomUtil = new RandomUtil();
    String firstName = randomUtil.getRandomFirstName(),
            lastName = randomUtil.getRandomLastName(),
            email = randomUtil.getRandomEmail(),
            phoneNumber = randomUtil.getRandomPhoneNumber(10),
            gender = randomUtil.getRandomGender(),
            subject = randomUtil.getRandomSubject(),
            hobby = randomUtil.getRandomHobby(),
            picture = "im.png",
            state = randomUtil.getRandomState(),
            city = randomUtil.getRandomCity(),
            day = randomUtil.getRandomDay(),
            month = randomUtil.getRandomMonth(),
            year = randomUtil.getRandomYear(),
            address = randomUtil.getRandomAddress();



    @Test
    void positiveFullRegistration() {

        studentRegistrationPage
                .openPage()
                .closingBanners()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhoneNumber(phoneNumber)
                .setBirthdayDate(day, month, year)
                .setSubject(subject)
                .setHobby(hobby)
                .uploadPicture(picture)
                .setAddress(String.valueOf(address))
                .setStateCity(state)
                .setCity(city)
                .submitButtonClick();

        studentRegistrationPage.verifyRegistrationModalAppear()
                .tableVerifyResultAppears("Student Name", firstName + " " + lastName)
                .tableVerifyResultAppears("Student Email", email)
                .tableVerifyResultAppears("Gender", gender)
                .tableVerifyResultAppears("Mobile", phoneNumber)
                .tableVerifyResultAppears("Date of Birth", day +" " + month + "," + year)
                .tableVerifyResultAppears("Subjects", subject)
                .tableVerifyResultAppears("Hobbies", hobby)
                .tableVerifyResultAppears("Picture", "im.png")
                .tableVerifyResultAppears("Address", String.valueOf(address))
                .tableVerifyResultAppears("State and City", state + " " + city);

    }
}
