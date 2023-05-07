package testswhithallurereports.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

  private  SelenideElement inputSearch = $(".header-search-input");

  @Step("Поиск репозитория {value}")
    public void searchGitHub(String value) {
        inputSearch.setValue(value).pressEnter();
    }
}
