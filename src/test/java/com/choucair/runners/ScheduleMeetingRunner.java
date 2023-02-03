package com.choucair.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/com.choucair/features/schedule_meeting.feature"},
        tags = "@Meeting",
        glue = {"com.choucair.stepDefinitions", "com.choucair.utils"},
        snippets = SnippetType.CAMELCASE
)
public class ScheduleMeetingRunner {
}
