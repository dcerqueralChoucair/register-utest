package co.com.choucair.registerutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    /*Frist Step*/
    public static final Target INPUT_FIRST_NAME = Target.the("Where do we write the frist name to user")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Where do we write the last name to user")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("Where do we write the email to user")
            .located(By.id("email"));
    public static final Target INPUT_BIRTH_MONTH = Target.the("Where do we select the month of birth to user")
            .located(By.xpath("//select[@name='birthMonth']/option[text()='June']"));
    public static final Target INPUT_BIRTH_DAY = Target.the("Where do we select the day of birth to user")
            .located(By.xpath("//select[@name='birthDay']/option[text()='7']"));
    public static final Target INPUT_BIRTH_YEAR = Target.the("Where do we select the year of birth to user")
            .located(By.xpath("//select[@name='birthYear']/option[text()='2000']"));
    public static final Target INPUT_LANGUAGES = Target.the("Where do we select the languajes know the user")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));

    public static final Target NEXT_STEP = Target.the("Button to next step in the form to register user")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target NEXT_STEP_DEVICES = Target.the("Button to second step in the form to register user")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    /*Locations*/
    public static final Target INPUT_CITY = Target.the("Where do we select the City")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Where do we select the ZIP Code")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Where do we select the Country")
            .located(By.name("countryId"));

    /*Second Step*/
    public static final Target SELECT_BRAND = Target.the("Select brand movile user")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));

    public static final Target INSERT_BRAND = Target.the("Write")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_MODEL = Target.the("Select brand movile user")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));

    public static final Target INSERT_MODEL = Target.the("Write Model to device ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_OS = Target.the("Select OS movile user")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));

    public static final Target SELECT_OS_VERSION = Target.the("Write OS vertions to device ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target LAST_STEP = Target.the("Button to last step in the form to register user")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password to user")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Where do we write the confirm password to user")
            .located(By.id("confirmPassword"));
    public static final Target ACCEPT_TERM_USE = Target.the("Accept the terms of use")
            .located(By.id("termOfUse"));
    public static final Target ACCEPT_PRIVACY_SECURITY_POLICY = Target.the("Accept the privacy and securiry policy")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_REGISTER_SETUP = Target.the("Button to register the user")
            .located(By.id("laddaBtn"));

}
