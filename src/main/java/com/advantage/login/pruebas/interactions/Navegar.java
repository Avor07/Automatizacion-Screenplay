package com.advantage.login.pruebas.interactions;

import com.advantage.login.pruebas.models.LogInModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Interaction {

    private String url;

    public Navegar() {
        LogInModel model = new LogInModel();
        model.setUrl("src\\main\\resources\\Data\\DataProvider.xlsx", "DATOS", 2, 1);
        this.url = model.getUrl();
    }

    public static Performable open() {
        return instrumented(Navegar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }
}
