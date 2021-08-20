package co.com.choucair.registerutest.tasks;

import co.com.choucair.registerutest.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class RegisterUser implements Task {

    private String strFristName;
    private String strLastName;
    private String strEmail;
    private String strIdiom;
    private String strBrand;
    private String strModel;
    private String strOsVersion;
    private String strPassword;

    private String strCity;
    private String strZip;
    private String strCountry;

    public static RegisterUser onThePage(String strFristName, String strLastName, String strEmail, String strIdiom, String strBrand, String strModel, String strOsVersion, String strPassword, String strCity, String strZip, String strCountry) {
        return Tasks.instrumented(RegisterUser.class,strFristName,strLastName,strEmail,strIdiom,strBrand,strModel,strOsVersion,strPassword, strCity, strZip, strCountry);
    }

    public RegisterUser(String strFristName, String strLastName, String strEmail, String strIdiom, String strBrand, String strModel, String strOsVersion, String strPassword, String strCity, String strZip, String strCountry) {
        this.strFristName = strFristName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strIdiom = strIdiom;
        this.strBrand = strBrand;
        this.strModel = strModel;
        this.strOsVersion = strOsVersion;
        this.strPassword = strPassword;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
            Enter.theValue(strFristName).into(RegisterPage.INPUT_FIRST_NAME),
            Enter.theValue(strLastName).into(RegisterPage.INPUT_LAST_NAME),
            Enter.theValue(strEmail).into(RegisterPage.INPUT_EMAIL_ADDRESS),
            Click.on(RegisterPage.INPUT_BIRTH_MONTH),
            Click.on(RegisterPage.INPUT_BIRTH_DAY),
            Click.on(RegisterPage.INPUT_BIRTH_YEAR),
            Enter.theValue(strIdiom+ Keys.ENTER).into(RegisterPage.INPUT_LANGUAGES),
            Click.on(RegisterPage.NEXT_STEP),
            //Enter.theValue(strCity).into(RegisterPage.INPUT_CITY),
            Enter.theValue(strZip).into(RegisterPage.INPUT_ZIP),
            //Enter.theValue(strCountry+ Keys.ENTER).into(RegisterPage.INPUT_COUNTRY),
            Click.on(RegisterPage.NEXT_STEP_DEVICES),
            Click.on(RegisterPage.SELECT_BRAND),
            Enter.theValue(strBrand+ Keys.ENTER).into(RegisterPage.INSERT_BRAND),
            Click.on(RegisterPage.SELECT_MODEL),
            Enter.theValue(strModel+ Keys.ENTER).into(RegisterPage.INSERT_MODEL),
            Click.on(RegisterPage.SELECT_OS),
            Enter.theValue(strOsVersion+ Keys.ENTER).into(RegisterPage.SELECT_OS_VERSION),
            Click.on(RegisterPage.LAST_STEP),
            Enter.theValue(strPassword).into(RegisterPage.INPUT_PASSWORD),
            Enter.theValue(strPassword).into(RegisterPage.INPUT_CONFIRM_PASSWORD),
            Click.on(RegisterPage.ACCEPT_TERM_USE),
            Click.on(RegisterPage.ACCEPT_PRIVACY_SECURITY_POLICY)
            //Click.on(RegisterPage.COMPLETE_REGISTER_SETUP)
    );
    }
}
