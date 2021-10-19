package com.advantage.login.pruebas.questions;

import com.advantage.login.pruebas.userinterfaces.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class LogInQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LogInPage.userIn).viewedBy(actor).asString();
    }
    public static Question<String>  getText(){
        return new LogInQuestion();
    }

}
