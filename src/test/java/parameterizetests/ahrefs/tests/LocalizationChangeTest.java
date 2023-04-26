package parameterizetests.ahrefs.tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import parameterizetests.ahrefs.data.Local;
import parameterizetests.ahrefs.pages.MainPage;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class LocalizationChangeTest {

    MainPage mainPage = new MainPage();

    static Stream<Arguments> ahrefsLocaleTest() {
        return Stream.of(
                Arguments.of(Local.English, List.of("Dashboard", "Site Explorer", "Keywords Explorer", "Site Audit", "Rank Tracker", "Content Explorer")),
                Arguments.of(Local.Español, List.of("Panel de control", "Site Explorer", "Keywords Explorer", "Site Audit", "Rank Tracker", "Explorador de contenidos"))
        );
    }

    @MethodSource
    @ParameterizedTest(name = "Проверяем, что после изменения языка на {0}, кнопки {1} поменяли язык")
    @Tags({
            @Tag("WEB"),
            @Tag("CRITICAL")
    })
    void ahrefsLocaleTest(Local lang, List<String> expectedButtons) {
        open("https://ahrefs.com");
        mainPage.hoverOverTheLanguageSelectionIcon().
                languageSelection(Local.valueOf(lang.name())).
                hoverOverTheListOfTools().
                toolsLanguageCheck(expectedButtons);
    }
}
