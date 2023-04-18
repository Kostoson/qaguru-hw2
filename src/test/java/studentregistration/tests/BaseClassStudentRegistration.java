package studentRegistration.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import studentRegistration.pages.StudentRegistrationPage;
import studentRegistration.pages.components.ResultsModal;


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
