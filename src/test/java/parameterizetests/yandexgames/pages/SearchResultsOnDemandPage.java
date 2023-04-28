package parameterizetests.yandexgames.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsOnDemandPage {
    SelenideElement secondResult = $("ul.grid-list_size_adaptive_recommended_new").$("li.grid-list__game-item ").sibling(0).$("span.game-card__title");
    SelenideElement headerResultsPage = $("span.section-header__text");

    public void checkSecondResult(String value) {
        secondResult.shouldHave(text(value));
    }


    public void checkHeaderResultsPage(String value) {
        headerResultsPage.shouldHave(text(value));
    }


}
