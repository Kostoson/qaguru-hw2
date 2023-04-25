package parameterizetests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsOnDemandPage {
    SelenideElement secondResult = $("ul.grid-list_size_adaptive_recommended_new").$("li.grid-list__game-item ").sibling(0).$("span.game-card__title");

    public void checkSecondResult(String value) {
        secondResult.shouldHave(text(value));
    }

}
