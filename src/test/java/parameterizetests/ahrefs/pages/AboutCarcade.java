package parameterizetests.ahrefs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AboutCarcade {
    SelenideElement aboutCarcadeWelcomeText = $("h1.about_welcome_text");

    public void checkAboutCarcade() {
        aboutCarcadeWelcomeText.shouldHave(text("Эксперты в автолизинге"));

    }
}
