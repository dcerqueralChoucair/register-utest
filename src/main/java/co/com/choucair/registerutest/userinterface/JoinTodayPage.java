package co.com.choucair.registerutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayPage extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("Button that show us the form to register")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
