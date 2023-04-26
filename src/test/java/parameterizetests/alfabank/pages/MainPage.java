package parameterizetests.alfabank.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SelenideElement inputSearch = $("input.cvc7Z");

    public void searchByValue(String value) {
        open("https://alfabank.ru/");
        inputSearch.setValue(value).pressEnter();
        sleep(3000);

    }
}
