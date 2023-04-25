package parameterizetests.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import parameterizetests.pages.YouTubeMainPage;

import static com.codeborne.selenide.Selenide.*;

public class YouTubeLogin {

    @ParameterizedTest(name ="Вход в учетную запись YouTube используя email {0}")
    @Tags({
            @Tag("SMOKE"),
            @Tag("WEB")
    })
    void YouTubeLoginTest() {
        YouTubeMainPage youTubeMainPage = new YouTubeMainPage();

        youTubeMainPage.
                openYouTubeMainPage().
                loginButtonClick();
        $$("input.whsOnd").filter(Condition.visible).first().setValue("test");
        sleep(3000);
    }

}
