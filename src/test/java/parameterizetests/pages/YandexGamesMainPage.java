package parameterizetests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class YandexGamesMainPage {
    SelenideElement inputSearch = $("input.Textinput-Control");

   public void searchGame(String value) {
        inputSearch.setValue(value).pressEnter();

    }


}
