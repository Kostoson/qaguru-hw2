package parameterizetests.yandexgames.tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import parameterizetests.yandexgames.pages.SearchResultsOnDemandPage;
import parameterizetests.yandexgames.pages.YandexGamesMainPage;
import static com.codeborne.selenide.Selenide.*;

public class YandexGamesTest {
    YandexGamesMainPage yandexGamesMainPage = new YandexGamesMainPage();
    SearchResultsOnDemandPage searchResultsOnDemandPage = new SearchResultsOnDemandPage();

    @CsvFileSource(resources = "/successfulYouTubeLogin.csv")
    @ParameterizedTest(name = "Проверка, что при поиске игры {0}, вторая в списке игра: {1}")
    @Tags({
            @Tag("WEB"),
            @Tag("SMOKE")
    })
     void SearchYandexGameTest(String searchGame, String secondGame) {
        open("https://yandex.com/games/");
        yandexGamesMainPage.searchGame(searchGame);
        searchResultsOnDemandPage.checkSecondResult(secondGame);

    }
}
