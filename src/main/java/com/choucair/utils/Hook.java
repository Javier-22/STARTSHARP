package com.choucair.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {
    @Before
    public void hook() {
        OnStage.setTheStage(new OnlineCast());
    }
}
