package dragAndDrop;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {
    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("div#column-a").$("header").shouldHave(Condition.text("A"));
        $("div#column-b").$("header").shouldHave(Condition.text("B"));
        $("div#column-a").dragAndDropTo("div#column-b");
        $("div#column-b").$("header").shouldHave(Condition.text("A"));
        $("div#column-a").$("header").shouldHave(Condition.text("B"));

    }

}
