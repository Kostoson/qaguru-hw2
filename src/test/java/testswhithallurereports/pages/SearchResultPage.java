package testswhithallurereports.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class SearchResultPage {

    @Step("Переход в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
    }
}
