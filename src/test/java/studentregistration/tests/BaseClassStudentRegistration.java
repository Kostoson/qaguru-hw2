package studentregistration.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import studentregistration.pages.components.ResultsModal;


public class BaseClassStudentRegistration {

    StudentRegistrationPage studentRegistrationPage = new StudentRegistrationPage();

    ResultsModal resultsModal = new ResultsModal();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
    }


}
