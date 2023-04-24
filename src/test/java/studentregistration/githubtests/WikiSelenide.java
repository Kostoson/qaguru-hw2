package githubtests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WikiSelenide {

    @Test
    void sampleCodeTest() {

        Configuration.browserSize = "1920x1080";
        // Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейти в раздел Wiki проекта
        $("a#wiki-tab").click();
        // Убедится, что в списке страниц (Pages) есть страница SoftAssertions
        $("button.f6").click();
        $("div.js-wiki-sidebar-toggle-display ul li.wiki-more-pages").sibling(0).$("a").shouldHave(text("SoftAssertions"));
        // Открыть страницу SoftAssertions
        $("div.js-wiki-sidebar-toggle-display ul li.wiki-more-pages").sibling(0).$("a").click();
        // Проверьте что внутри есть пример кода для JUnit5
        $("div#wiki-body a#user-content-3-using-junit5-extend-test-class").closest("h4").sibling(0).shouldHave(text(
                "@Test\n"  +
                "void test() {\n" +
                "Configuration.assertionMode = SOFT;\n" +
                "open(\"page.html\");\n" +
                "$(\"#first\").should(visible).click();\n" +
                "$(\"#second\").should(visible).click();\n" +
                "}\n" +
                "}\n"));
    }
}
