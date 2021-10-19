package com.advantage.login.pruebas.interactions;

import com.advantage.login.pruebas.models.LogInModel;
import com.advantage.login.pruebas.userinterfaces.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class InicioDeSesion implements Interaction {
    private String user;
    private String password;

    public InicioDeSesion() {
        LogInModel model = new LogInModel();
        model.setUser("src\\main\\resources\\Data\\DataProvider.xlsx", "DATOS", 0, 1);
        model.setPassword("src\\main\\resources\\Data\\DataProvider.xlsx", "DATOS", 1, 1);
        this.user = model.getUser();
        this.password = model.getPassword();
    }

    public static Performable iniciar() {
        return instrumented(InicioDeSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(LogInPage.loader),WebElementStateMatchers.isNotVisible()).forNoLongerThan(15).seconds(),
                Click.on(LogInPage.btnUser),
                Wait.until(WebElementQuestion.the(LogInPage.userInput), WebElementStateMatchers.isVisible()).forNoLongerThan(15).seconds(),
                Enter.theValue(user).into(LogInPage.userInput),
                Enter.theValue(password).into(LogInPage.passwordInput),
                Click.on(LogInPage.sigInBtn)
        );
    }
}
