package someTestInGitHub;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.SetValueOptions.withText;


public class OpenEnterprise {

    @Test
    void OpenEnterpriseTest() {
        open("https://github.com");
        $(Selectors.byTagAndText("button", "Solutions")).hover();
        $(Selectors.byTagAndText("a", "Enterprise")).click();
        $("h1.h1-mktg").shouldHave(text("Build like the best"));
    }

}
