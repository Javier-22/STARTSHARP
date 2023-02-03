package com.choucair.tasks;

import com.choucair.models.DataModelCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.choucair.userinterfaces.LoginAccount.*;

public class Login implements Task {
    private List<DataModelCredentials> credential;

    public Login(List<DataModelCredentials> credential) {
        this.credential = credential;
    }

    public static Login Credentials(List<DataModelCredentials> credential)
    {return Tasks.instrumented(Login.class, credential);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credential.get(0).getStrUserName()).into(USERNAME),
                Enter.theValue(credential.get(0).getStrpassword()).into(PASSWORD),
                Click.on(ACCESSBUTTON)

        );

    }
}
