package com.choucair.questions.schedulemeeting;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.choucair.userinterfaces.QuestionMapping.CONFIRMTEXT;

public class ScheduledMeeting implements Question<Boolean> {
    private String text;

    public ScheduledMeeting(String text) {
        this.text = text;
    }

    public static ScheduledMeeting Text(String text) {
        return new ScheduledMeeting(text);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean res = false;
        String confirmtex = (CONFIRMTEXT.resolveFor(actor).getText());
        if (text.contains(text)) {
            res = true;
        }else{
            res = false;
        }
        return res;

    }
}