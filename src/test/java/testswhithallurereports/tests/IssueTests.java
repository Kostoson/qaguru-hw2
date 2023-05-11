package testswhithallurereports.tests;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import testswhithallurereports.pages.MainPage;
import testswhithallurereports.pages.RepositoryPage;
import testswhithallurereports.pages.SearchResultPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;


@Feature("Issue в репозитории")
@Story("Создание Issue")
@Owner("Konstantin Dubinin")
@Severity(SeverityLevel.CRITICAL)
public class IssueTests extends TestBase {

    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    RepositoryPage repositoryPage = new RepositoryPage();

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


    @Test
    public void testIssueSearchWhithLamdaSteps() {
        step("Поиск репозитория " + REPOSITORY, () -> {
            $(".header-search-input").setValue(REPOSITORY).pressEnter();
        });
        step("Переход в репозиторий " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Переход в Issue репозитория " + REPOSITORY, () -> {
            $("#issues-tab").click();
        });
        step("Проверка имени Issue", () -> {
            $(String.format("#issue_%s_link", ISSUE_NUM)).shouldHave(text(ISSUE_NAME));
        });

    }

    @Test
    public void testIssueSearchWhithAnnotatedSteps() {
        mainPage.searchGitHub(REPOSITORY);
        searchResultPage.goToRepository(REPOSITORY);
        repositoryPage.selectIssueTab().
                checkIssueName(ISSUE_NUM, ISSUE_NAME);
    }
}
