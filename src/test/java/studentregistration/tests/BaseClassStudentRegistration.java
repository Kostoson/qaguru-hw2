package studentregistration.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import studentregistration.components.ResultsModal;
import studentregistration.pages.StudentRegistrationPage;


public class BaseClassStudentRegistration {





    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub"; // адрес селенойда, где запускаются тесты
    }


}
