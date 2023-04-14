package studentRegistrationTest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.StudentRegistrationPage;


public class BaseClassStudentRegistration {

    StudentRegistrationPage studentRegistrationPage = new StudentRegistrationPage();
    @BeforeAll
     static void beforeAll() {


        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
    }


}
