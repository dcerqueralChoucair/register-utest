package co.com.choucair.registerutest.tasks;

import co.com.choucair.registerutest.userinterface.JoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class JoinToday implements Task{

    public static JoinToday onThePage(){
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(
                JoinTodayPage.REGISTER_BUTTON)
        );
    }
}
