import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForm {
    @Test
    void successfulSearchTest() {
        Configuration.browserSize = "2160x1440";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Huesos");
        $("#lastName").setValue("Pidor");
        $("#userNumber").setValue("1234567890");
        $("#userEmail").setValue("huesos@gmail.com");
        $("#subjectsInput").setValue("Physics").pressEnter();
        $("#currentAddress").setValue("basileevka");
        $("#uploadPicture").uploadFromClasspath("picure.jpg");
        $("#submit").click();

    }
}
