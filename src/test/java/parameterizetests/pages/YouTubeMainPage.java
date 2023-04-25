package parameterizetests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class YouTubeMainPage {

    SelenideElement loginButton = $$("a.yt-spec-button-shape-next--outline").filter(Condition.visible).first();

    public YouTubeMainPage openYouTubeMainPage() {
        open("https://www.youtube.com");
        return this;
    }

    public YouTubeMainPage loginButtonClick() {
        loginButton.click();
        return this;
    }

}
