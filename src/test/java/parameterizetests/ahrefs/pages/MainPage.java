package parameterizetests.ahrefs.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import parameterizetests.ahrefs.data.Local;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    SelenideElement langIcon = $("svg.css-2o9aij-languageIcon"),

    toolsIcon = $("div.css-tidgun-label_");
    ElementsCollection listLang = $$("a.css-19n52l5-menuItemLink"),
            listTools = $$("a.css-19n52l5-menuItemLink");


    public MainPage hoverOverTheLanguageSelectionIcon() {
        langIcon.hover();
        return this;
    }

    public MainPage languageSelection(Local lang) {
        listLang.find(text(lang.name())).click();
        return this;
    }
    public MainPage hoverOverTheListOfTools() {
        toolsIcon.hover();
        return this;
    }
    public MainPage toolsLanguageCheck(List<String> expectedButtons) {
        listTools.filter(visible).shouldHave(CollectionCondition.texts(expectedButtons));
        return this;
    }



}
