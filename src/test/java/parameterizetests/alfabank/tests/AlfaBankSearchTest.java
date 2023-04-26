package parameterizetests.alfabank.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import parameterizetests.alfabank.pages.MainPage;
import parameterizetests.alfabank.pages.SearchResultPage;

public class AlfaBankSearchTest {
    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @CsvSource({
            "карта, Кредитная карта",
            "кэшбэк, Платим кэшбэк по-новому: ещё больше | АО Альфа-Банк"
    })
    @ParameterizedTest(name = "Проверяем, что при поиске продукта {0}, первый результат запроса - {1}")
    @Tags({
            @Tag("WEB"),
            @Tag("SMOKE")
    })
    void SearchingTest(String product, String firstResult) {
        mainPage.searchByValue(product);
        searchResultPage.checkFirstElement(firstResult);

    }

}