package github;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class IshemReposit {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2160x1440";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
}
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {


        open("https://github.com");
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();

        sleep(5000);

    }
}