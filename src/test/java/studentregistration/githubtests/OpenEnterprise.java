


package studentregistration.githubtests;


import com.codeborne.selenide.Selectors;

import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;



public class OpenEnterprise {

    @Test
    void openEnterpriseTest() {
        open("https://github.com");
        $(Selectors.byTagAndText("button", "Solutions")).hover();
        $(Selectors.byTagAndText("a", "Enterprise")).click();
        $("h1.h1-mktg").shouldHave(text("Build like the best"));
    }

}
