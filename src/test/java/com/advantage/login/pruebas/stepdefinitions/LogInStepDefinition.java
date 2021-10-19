package com.advantage.login.pruebas.stepdefinitions;

import com.advantage.login.pruebas.interactions.Navegar;
import com.advantage.login.pruebas.questions.LogInQuestion;
import com.advantage.login.pruebas.tasks.LogInTask;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.hasItems;

public class LogInStepDefinition {

    Actor actor;
    @Managed(driver = "chrome")
    WebDriver driver;

    @Given("^The user is on advantage page$")
    public void theUserIsOnAdvantagePage() {
        actor = Actor.named("Angie");
        actor.can(BrowseTheWeb.with(driver));
    }


    @When("^The user type his credentials$")
    public void theUserTypeHisCredentials() {
        actor.attemptsTo(
                Navegar.open(),
                LogInTask.logIn()
        );
    }

    @Then("^The user should see his username on the page$")
    public void theUserShouldSeeHisUsernameOnThePage() {
        actor.should(
                seeThat("Comparacion de textos", LogInQuestion.getText(),Matchers.is("angie"))
        );
    }

}
