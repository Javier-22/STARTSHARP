package com.choucair.stepDefinitions;

import com.choucair.models.DataModelCredentials;
import com.choucair.models.addproduct.DataModelAddProducts;
import com.choucair.questions.addprodut.addedproduct;
import com.choucair.tasks.Login;
import com.choucair.tasks.OpenUp;
import com.choucair.tasks.addproducts.RegisterProduct;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AddproductStepdefinition {
    @Given("the user has been sent to the Test page")
    public void theUserHasBeenSentToTheTestPage(){
        theActorCalled("user").wasAbleTo(OpenUp.theUrl());
    }
    @When("^I find the page I enter my credentials$")
    public void iFindThePageIEnterMyCredentials(List<DataModelCredentials>dataModelsCredentials) {
        theActorInTheSpotlight().attemptsTo(Login.Credentials(dataModelsCredentials));}

    @And("^he user clicks on the Northwind module, register the products$")
    public void heUserClicksOnTheNorthwindModuleRegisterTheProducts(List<DataModelAddProducts>dataModelAddProducts) {
        theActorInTheSpotlight().attemptsTo(RegisterProduct.intoForm(dataModelAddProducts));}

    @Then("^We verify if the product was saved by clicking on the first row of the list$")
    public void weVerifyIfTheProductWasSavedByClickingOnTheFirstRowOfTheList() {
        theActorInTheSpotlight().should(seeThat(addedproduct.isAvaliable()));
    }
}


