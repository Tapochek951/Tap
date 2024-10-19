package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class proverka {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Ekaterina");
        $("#lastName").setValue("Vodolazhskaia");
        $("#userEmail").setValue("testmail@gmail.com");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__day--027").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#subjectsInput").setValue("Physics").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("picture.png");
        $("#currentAddress").setValue("Moscow, Russia");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Gurgaon").pressEnter();
        $("#submit").click();

        $x("//td[contains(text(),'Student Name')]/../td[2]").shouldHave(text("Ekaterina Vodolazhskaia"));
        $x("//td[contains(text(),'Student Email')]/../td[2]").shouldHave(text("testmail@gmail.com"));
        $x("//td[contains(text(),'Gender')]/../td[2]").shouldHave(text("Female"));
        $x("//td[contains(text(),'Mobile')]/../td[2]").shouldHave(text("1234567890"));
        $x("//td[contains(text(),'Date of Birth')]/../td[2]").shouldHave(text("27 June,1993"));
        $x("//td[contains(text(),'Subjects')]/../td[2]").shouldHave(text("Maths, Physics"));
        $x("//td[contains(text(),'Hobbies')]/../td[2]").shouldHave(text("Reading, Music"));
        $x("//td[contains(text(),'Picture')]/../td[2]").shouldHave(text("picture.png"));
        $x("//td[contains(text(),'Address')]/../td[2]").shouldHave(text("Moscow, Russia"));
        $x("//td[contains(text(),'State and City')]/../td[2]").shouldHave(text("NCR Gurgaon"));

    }
}
