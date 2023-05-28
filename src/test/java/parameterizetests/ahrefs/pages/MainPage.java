package parameterizetests.ahrefs.pages;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class MainPage {
    LesseesPage lesseesPage = new LesseesPage();
    AboutCarcade aboutCarcade = new AboutCarcade();

    SelenideElement catalogFilter = $("div.home_slider__filter").$("p.home_slider__title");
    SelenideElement tabNew = $("div.home_slider__filter_tab");
    SelenideElement tabWithMileage = $("div.home_slider__filter_tab").sibling(0);
    SelenideElement lessees = $("div.header__column a.header__hover-link");
    SelenideElement aboutCarcade = $("div.header__column a.header__hover-link").sibling(0);






    public MainPage catalogFilterHeader() {
        catalogFilter.shouldHave(text("Каталог автомобилей"));
        return this;
    }

    public MainPage catalogTabCheck() {
        tabNew.shouldHave(text("новые"));
        tabWithMileage.shouldHave(text("с пробегом"));
        return this;
    }

    public MainPage headerPage() {
        lessees.shouldHave(text("Лизингополучателям"));
        aboutCarcade.shouldHave(text("О каркаде"));
        return this;
    }

    public MainPage lesseesTab() {
        lessees.click();
        lesseesPage.checkWelcomeText();
        return this;
    }

    public MainPage aboutCarcadeTab() {
        aboutCarcade.checkAboutCarcade();
        return this;
    }
}
