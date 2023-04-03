package studentRegistrationForm;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;



public class BaseClassStudentRegistration {
    @BeforeAll

    static void beforeAll(){

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
    }


}
