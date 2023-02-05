package com.choucair.questions.addprodut;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.choucair.userinterfaces.QuestionMapping.*;

public class addedproduct implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resp;
        if (ENABLE.resolveFor(actor).isClickable()) {
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }

    public static addedproduct isAvaliable() { return new addedproduct();
    }
}
