package co.com.choucair.registerutest.stepdefinitions;

import co.com.choucair.registerutest.model.RegisterData;
import co.com.choucair.registerutest.questions.FinalStep;
import co.com.choucair.registerutest.tasks.JoinToday;
import co.com.choucair.registerutest.tasks.OpenUp;
import co.com.choucair.registerutest.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than Daniel want to register in to platform Utest$")
    public void thanDanielWantToRegisterInToPlatformUtest() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(),(JoinToday.onThePage()));
    }

    @When("^He enters the information requested in the Utest registration form$")
    public void heEntersTheInformationRequestedInTheUtestRegistrationForm(List<RegisterData> registerData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser
                .onThePage(registerData.get(0).getStrFristName(),registerData.get(0).getStrLastName(),registerData.get(0).getStrEmail(),registerData.get(0).getStrIdiom(),registerData.get(0).getStrBrand(),registerData.get(0).getStrModel(),registerData.get(0).getStrOsVersion(),registerData.get(0).getStrPassword(), registerData.get(0).getStrCity(),registerData.get(0).getStrZip(),registerData.get(0).getStrCountry()));
    }

    @Then("^Go back to the Utest home page select the login option and enter the access credentials the access credentials validate (.*)$")
    public void goBackToTheUtestHomePageSelectTheLoginOptionAndEnterTheAccessCredentialsTheAccessCredentialsValidateTheLastStep(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FinalStep.toThe(question)));
    }

}
