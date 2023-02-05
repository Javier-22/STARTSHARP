package com.choucair.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.targets.Target;

public class ScrollToTarget extends ScrollTo {

    private final Target target;
    public ScrollToTarget(Target target) {
        this.target = target;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        performScrollTo(actor, target.resolveFor(actor));

    }
}

