package co.com.choucair.registerutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchFinalTitleStep extends PageObject {
    public static final Target TITLE_FINAL_STEP = Target.the("Validate the last Title before to do click in the last button")
            .located(By.className("sub-title"));
}
