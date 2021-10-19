package com.advantage.login.pruebas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInPage {
    private LogInPage() {
    }
    public static final Target btnUser =
            Target.the("btn User on the main page").located(By.id("menuUser"));
    public static final Target userInput =
            Target.the("user Input on modal").located(By.name("username"));
    public static final Target passwordInput =
            Target.the("password Input on modal").located(By.name("password"));
    public static final Target sigInBtn =
            Target.the("btn Sign in on modal").located(By.id("sign_in_btnundefined"));
    public static final Target loader =
            Target.the("Loader de la pagina").locatedBy("/html/body/div[2]");
    public static final Target userIn =
            Target.the("User Logueado").locatedBy("//*[@id=\"menuUserLink\"]/span");
}
