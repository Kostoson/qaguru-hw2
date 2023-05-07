package testswhithallurereports.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;


@Feature("Issue в репозитории")
@Story("Создание Issue")
@Owner("Konstantin Dubinin")
@Severity(SeverityLevel.CRITICAL)
public class IssueTests extends TestBase {

    private static final String
            REPOSITORY = "Kostoson/qaguru_home_work",
            ISSUE_NUM = "24",
            ISSUE_NAME = "Test";

    @Test
    public void testIssueSearch() {
        $(".header-search-input").setValue(REPOSITORY).pressEnter();
        $(linkText(REPOSITORY)).click();
        $("#issues-tab").click();
        $(String.format("#issue_%s_link", ISSUE_NUM)).shouldHave(text(ISSUE_NAME));
    }
}
