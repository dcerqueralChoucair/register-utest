package co.com.choucair.registerutest.questions;

import co.com.choucair.registerutest.userinterface.SearchFinalTitleStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FinalStep implements Question<Boolean> {

    private String question = "The last step";

    public FinalStep(String question){
        this.question = question;
    }
    public static FinalStep toThe(String question) {
        return new FinalStep(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String titleLastStep = Text.of(SearchFinalTitleStep.TITLE_FINAL_STEP).viewedBy(actor).asString();
        if(question.equals(titleLastStep)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

}
