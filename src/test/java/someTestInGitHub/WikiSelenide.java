package someTestInGitHub;

import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.*;

public class TestInGitHub {

    @Test
    void sampleCodeTest() {

        Configuration.browserSize = "1920x1080";
        // Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейти в раздел Wiki проекта
        $("a#wiki-tab").click();
        // Убедится, что в списке страниц (Pages) есть страница SoftAssertions
        $(".Layout-main").$("ul").$("li").sibling(5).shouldHave(text("Soft assertions"));
        // Открыть страницу SoftAssertions
        $(".Layout-main").$("ul").$("li").sibling(5).$("a").click();
        // Проверьте что внутри есть пример кода для JUnit5
        $("div.Layout-main div.markdown-body h4").sibling(5).
                shouldHave(text("3. Using JUnit5 extend test class:"));

    }

}
