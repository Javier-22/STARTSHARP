package com.choucair.tasks.addproducts;

import com.choucair.utils.ScrollToTarget;
import com.choucair.models.addproduct.DataModelAddProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.choucair.userinterfaces.addprodut.NorthwindProductPage.*;

public class RegisterProduct implements Task {
    private List<DataModelAddProducts>date;
    public RegisterProduct (List<DataModelAddProducts> date){this.date=date;}

    public static RegisterProduct intoForm(List<DataModelAddProducts>date) {return Tasks.instrumented(RegisterProduct.class, date);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MODULE),
                Click.on(SECTION),
                Click.on(NEWPRODUCT),
                Enter.theValue(date.get(0).getStrProductName()).into(NAMEPRODUCT),
                Click.on(SUPPLIER),
                Enter.theValue(date.get(0).getStrSupplier()).into(CHOOSESUPPLIER),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(CHOOSESUPPLIER),
                Click.on(CATEGORY),
                Enter.theValue(date.get(0).getStrCategory()).into(SELECTCATEGORY),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(SELECTCATEGORY),
                Enter.theValue(date.get(0).getStrQuantityPerU()).into(QUENTYPER),
                Enter.theValue(date.get(0).getStrUnitPrice()).into(UNITPRICE),
                Enter.theValue(date.get(0).getStrUnitsInStock()).into(UNITSSTOCK),
                Enter.theValue(date.get(0).getStrUnitsOnOrder()).into( UNITEORDER),
                Enter.theValue(date.get(0).getStrReorderLevel()).into(REORDER),
                new ScrollToTarget(SAVEBUTTONPRODUC),
                Click.on(SAVEBUTTONPRODUC),
                Click.on(SECTION)

        );

    }
}
