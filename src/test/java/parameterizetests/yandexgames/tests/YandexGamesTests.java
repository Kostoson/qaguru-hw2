package parameterizetests.yandexgames.tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import parameterizetests.yandexgames.pages.SearchResultsOnDemandPage;
import parameterizetests.yandexgames.pages.YandexGamesMainPage;
import static com.codeborne.selenide.Selenide.*;

public class YandexGamesTests {
    YandexGamesMainPage yandexGamesMainPage = new YandexGamesMainPage();
    SearchResultsOnDemandPage searchResultsOnDemandPage = new SearchResultsOnDemandPage();

    @BeforeEach
    void openYandexGames() {
        open("https://yandex.com/games/");
    }

    @ValueSource(strings = {
            "ball",
            "cat"
    })
    @ParameterizedTest(name = "Проверяем, что при поиске игры {0}, осуществляется переход на страницу результатов поиска")
    @Tags({
            @Tag("WEB"),
            @Tag("SMOKE")
    })
    void goToSearchResultsPage(String searchGame) {
        yandexGamesMainPage.searchGame(searchGame);
        searchResultsOnDemandPage.checkHeaderResultsPage("Результаты поиска по запросу: «"+searchGame+"»");

    }


    @CsvFileSource(resources = "/successfulYouTubeLogin.csv")
    @ParameterizedTest(name = "Проверяем, что при поиске игры {0}, вторая в списке игра: {1}")
    @Tags({
            @Tag("WEB"),
            @Tag("SMOKE")
    })
     void SearchYandexGameTest(String searchGame, String secondGame) {

        yandexGamesMainPage.searchGame(searchGame);
        searchResultsOnDemandPage.checkSecondResult(secondGame);

    }
}
