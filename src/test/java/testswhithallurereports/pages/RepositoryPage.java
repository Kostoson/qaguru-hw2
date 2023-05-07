package testswhithallurereports.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RepositoryPage {

    private SelenideElement issueTab = $("#issues-tab");

    @Step("Выбор вкладки Issue")
    public RepositoryPage selectIssueTab() {
        issueTab.click();
        return this;
    }

    @Step("Проверка имени Issue {issueNum")
    public RepositoryPage checkIssueName(String issueNum, String issueName) {
        $(String.format("#issue_%s_link", issueNum)).shouldHave(text(issueName));
        return this;
    }
}
