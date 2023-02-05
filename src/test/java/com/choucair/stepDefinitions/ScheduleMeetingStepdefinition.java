package com.choucair.stepDefinitions;

import com.choucair.models.schedulemeeting.DataModelScheduleMeeting;
import com.choucair.questions.schedulemeeting.ScheduledMeeting;
import com.choucair.tasks.schedulemeeting.Schedule;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ScheduleMeetingStepdefinition {
    @When("^we schedule the meeting$")
    public void WeScheduleTheMeeting (List<DataModelScheduleMeeting>datamodelScheduleMeeting){
        theActorInTheSpotlight().attemptsTo(Schedule.meeting(datamodelScheduleMeeting));}

    @Then("^then we verify that the meeting has been scheduled(.*)$")
    public void thenWeVerifyThatTheMeetingHasBeenScheduledPlanning(String question){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ScheduledMeeting.Text(question)));
    }
}

