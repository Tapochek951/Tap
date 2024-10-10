import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class solution {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "2160x1440";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void Solution() {

        open("https://github.com");
        $$(".HeaderMenu-link").findBy(text("Solutions")).hover();
        $(byTagAndText("a","Enterprise")).click();
        $(byTagAndText("h1","The AI-powered")).shouldBe(visible);


    }
}
