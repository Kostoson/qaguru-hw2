package parameterizetests.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import parameterizetests.pages.SearchResultsOnDemandPage;
import parameterizetests.pages.YandexGamesMainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class YandexGamesTest {
    YandexGamesMainPage yandexGamesMainPage = new YandexGamesMainPage();
    SearchResultsOnDemandPage searchResultsOnDemandPage = new SearchResultsOnDemandPage();

    @CsvFileSource(resources = "/successfulYouTubeLogin.csv")
    @ParameterizedTest(name = "Проверка, что при поиске игры {0}, вторая в списке игра: {1}")
     void SearchYandexGameTest(String searchGame, String secondGame) {
        open("https://yandex.com/games/");
        yandexGamesMainPage.searchGame(searchGame);
        searchResultsOnDemandPage.checkSecondResult(secondGame);

    }
}
