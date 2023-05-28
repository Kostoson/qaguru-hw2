package parameterizetests.ahrefs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LesseesPage {
    SelenideElement welcomeText = $("h1.welcome_text");


    public void checkWelcomeText() {
        welcomeText.shouldHave(text("Многолетняя работа — в пользу каждого клиента"));

    }
}
