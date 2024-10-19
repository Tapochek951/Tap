package test;

import Pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestFormd {

    RegistrationPage registrationPage = new RegistrationPage();


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2160x1440";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void successfulSearchTest() {
        registrationPage.openPage()
                        .setFirstName("Tapok")
                        .setLastName("Worker")
                        .setEmail("tapochek@gmail.com")
                        .setGender("Male")
                        .setUserNumber("1234567890")
                        .setDateOfBirth("21", "January", "1997")
                        .setSubjectInput("Physics")
                        .setHobbies("Sports")
                        .setCurrentAddress("basileevka")
                        .setState("Haryana")
                        .setCity("Karnal")
                        .setSubmit("");



        //$("#uploadPicture").uploadFromClasspath("picure.jpg");
    }
}
