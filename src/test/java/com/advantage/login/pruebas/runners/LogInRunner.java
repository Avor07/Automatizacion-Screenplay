package com.advantage.login.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\iniciosesion.feature",
        glue = "com.advantage.login.pruebas.stepdefinitions", snippets = SnippetType.CAMELCASE)
public class LogInRunner {
}
