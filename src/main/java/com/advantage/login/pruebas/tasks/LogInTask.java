package com.advantage.login.pruebas.tasks;

import com.advantage.login.pruebas.interactions.InicioDeSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogInTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                InicioDeSesion.iniciar()
        );
    }

    public static LogInTask logIn() {
        return instrumented(LogInTask.class);
    }
}
