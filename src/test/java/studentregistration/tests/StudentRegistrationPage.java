package studentregistration.pages;

import com.codeborne.selenide.SelenideElement;
import studentregistration.pages.components.CalendarComponent;
import studentregistration.pages.components.ResultsModal;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class StudentRegistrationPage {

    ResultsModal resultsModal = new ResultsModal();

    CalendarComponent calendarComponent = new CalendarComponent();
    SelenideElement firstNameInput = $("input#firstName");  // todo объеденить переменные с одним типом данных
    SelenideElement lastNameInput = $("input#lastName");
    SelenideElement emailInput = $("input#userEmail");
    SelenideElement genderInput = $("#genterWrapper");
    SelenideElement phoneNumberInput = $("input#userNumber");

    SelenideElement subjectInput = $("#subjectsContainer input");
    SelenideElement hobbiesInput = $("#hobbiesWrapper");

    SelenideElement uploadPicture = $("#uploadPicture");

    SelenideElement addressInput = $("#currentAddress");

    SelenideElement stateCityClick = $("#state");
    SelenideElement stateCityInput = $("#stateCity-wrapper");
    SelenideElement cityClick = $("#city");
    SelenideElement cityInput = $("#stateCity-wrapper");
    SelenideElement submitButton = $("#submit");


    public StudentRegistrationPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public StudentRegistrationPage closingBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public StudentRegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public StudentRegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public StudentRegistrationPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public StudentRegistrationPage setGender(String gender) {
        genderInput.$(byText(gender)).click();
        return this;
    }

    public StudentRegistrationPage setPhoneNumber(String phoneNumber) {
        phoneNumberInput.setValue(phoneNumber);
        return this;
    }

    public StudentRegistrationPage setBirthdayDate(String day, String month, String year) {
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public StudentRegistrationPage setSubject(String subject) {
        subjectInput.setValue(subject).pressEnter();
        return this;
    }

    public StudentRegistrationPage setHobby(String hobby) {
        hobbiesInput.$(byText(hobby)).click();
        return this;
    }

    public StudentRegistrationPage uploadPicture(String fileName) {
        uploadPicture.uploadFromClasspath(fileName);
        return this;
    }

    public StudentRegistrationPage setAddress(String address) {
        addressInput.setValue(address);
        return this;
    }

    public StudentRegistrationPage setStateCity(String stateCity) {
        stateCityClick.click();
        stateCityInput.$(byText(stateCity)).click();
        return this;
    }

    public StudentRegistrationPage setCity(String city) {
        cityClick.click();
        cityInput.$(byText(city)).click();
        return this;

    }

    public StudentRegistrationPage submitButtonClick() {
        submitButton.click();
        return this;
    }

    public StudentRegistrationPage verifyRegistrationModalAppear() {
        resultsModal.modalDialogIsVisible();
        return this;
    }

    public StudentRegistrationPage tableVerifyResultAppears (String key, String value) {
        resultsModal.tableVerifyResultAppears(key, value);

        return this;
    }


}
