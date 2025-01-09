package Pages;

import Pages.comp.CalendarComponent;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private final SelenideElement firstNameInput = $("#firstName");

    private final SelenideElement lastNameInput = $("#lastName");

    private SelenideElement userEmailInput = $("#userEmail");

    private SelenideElement genderWrapper = $("#genterWrapper");

    private SelenideElement userNumberInput = $("#userNumber");

    private SelenideElement calendarInput = $("#dateOfBirthInput");

    private SelenideElement subjectsInput = $("#subjectsInput");

    private SelenideElement hobbiesWrapper = $("#hobbiesWrapper");

    private SelenideElement currentAddress = $("#currentAddress");

    private SelenideElement selectState = $("#react-select-3-input");

    private SelenideElement selectCity = $("#react-select-4-input");

    private SelenideElement uploadPictureSelector = $("#uploadPicture");

    private SelenideElement selectSubmit = $("#submit");



    CalendarComponent calendarComponent = new CalendarComponent();


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);



        return this;
    }

    public RegistrationPage setSubjectInput(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setHobbies(String value) {
        hobbiesWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        currentAddress.setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        selectState.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setCity(String value) {
        selectCity.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setUploadPicture() {
        uploadPictureSelector.uploadFile(new File("src/test/java/rec/icon.png"));
        return this;
    }

    public RegistrationPage setSubmit(String value) {
        selectSubmit.click();

        return this;
    }


}
