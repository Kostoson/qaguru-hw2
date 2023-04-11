package someTestInGitHub;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WikiSelenide {

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
        $("div.markdown-body div").sibling(8).$("pre span").sibling(9).shouldHave(text("@"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(10).shouldHave(text("Test"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(11).shouldHave(text("public"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(12).shouldHave(text("void"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(13).shouldHave(text("test"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(14).shouldHave(text("Configuration"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(15).shouldHave(text("assertionMode"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(16).shouldHave(text("SOFT"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(17).shouldHave(text("open"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(18).shouldHave(text("page.html"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(19).shouldHave(text("$"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(20).shouldHave(text("#first"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(21).shouldHave(text("should"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(22).shouldHave(text("visible"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(23).shouldHave(text("click"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(24).shouldHave(text("$"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(25).shouldHave(text("#second"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(26).shouldHave(text("should"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(27).shouldHave(text("visible"));
        $("div.markdown-body div").sibling(8).$("pre span").sibling(28).shouldHave(text("click"));

    }

}
