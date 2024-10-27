package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.text.SimpleDateFormat;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestForm2 {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2160x1440";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void successfulSearchTest() {

        String firstName = "Tapok",
                lastName = "Worker",
                genderWrapper = "Male",
                userNumber = "1234567890",
                userEmail = "tapochek@gmail.com",
                dateOfBirthInput = String.valueOf(new SimpleDateFormat("21/01/1997")),
                subjectsInput = "Physics",
                hobbiesWrapper = "Sports",
                image = "src/test/java/rec/icon.png",
                currentAddress = "basileevka",
                state = "Haryana",
                city = "Karnal";



        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");


        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#genterWrapper").$(byText(genderWrapper)).click();
        $("#userNumber").setValue(userNumber);
        $("#userEmail").setValue(userEmail);
        $("#dateOfBirthInput").setValue(dateOfBirthInput);
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("1997");
        $(".react-datepicker__day--021").click();
        $("#subjectsInput").setValue(subjectsInput).pressEnter();
        $("#hobbiesWrapper").$(byText(hobbiesWrapper)).click();
        $("#uploadPicture").uploadFile(new File(image));
        $("#currentAddress").setValue(currentAddress);
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();
        $("#submit").click();

    }
}
