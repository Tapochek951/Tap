package github;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class IshemReposit {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {


        open("https://github.com");

    }
}