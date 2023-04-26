package parameterizetests.alfabank.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    SelenideElement firstElement = $$("a.b-serp-item__title-link").first();

    public void checkFirstElement(String value) {
        firstElement.$("yass-span").shouldHave(Condition.text(value));
    }


}
