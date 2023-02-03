package com.choucair.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/com.choucair/features/add_products.feature"},
        tags = "@AddProduct",
        glue = {"com.choucair.stepDefinitions", "com.choucair.utils"},
        snippets = SnippetType.CAMELCASE
)

public class AddProductsRunner {
}
