package com.choucair.utils.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SelectDay implements Interaction {
    private String option;

    public SelectDay(String option) {
        this.option = option;
    }

    public static SelectDay datosInteraccion (String option){
        return  new SelectDay(option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //List<WebElement> listDays = listaDias.resolveAllFor(actor).get(0).findElements(By.tagName("a"));
        List<WebElement> listDays = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.xpath("//a[@class='ui-state-default']"));
        //List<String> listDays2 = Text.of(listaDias).viewedBy(actor).asList();
        System.out.println(listDays.size());
        for (int i = 0; i<listDays.size(); i++){
            if (listDays.get(i).getText().equals(option)){
                listDays.get(i).click();
                break;
            }
        }
    }
}
