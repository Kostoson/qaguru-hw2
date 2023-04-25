package parameterizetests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class YoutubeLoginPage {
    SelenideElement inputEmail = $$("input.whsOnd").filter(Condition.visible).first();

    public YoutubeLoginPage setEmail(String email) {
        inputEmail.setValue(email);
        return this;
    }
}
