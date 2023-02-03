package com.choucair.stepDefinitions;
import com.choucair.models.schedulemeeting.DataModelScheduleMeeting;
import com.choucair.tasks.schedulemeeting.Schedule;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ScheduleMeetingStepdefinition {
    @When("^we schedule the meeting$")
    public void WeScheduleTheMeeting (List<DataModelScheduleMeeting>datamodelScheduleMeeting){
        theActorInTheSpotlight().attemptsTo(Schedule.meeting(datamodelScheduleMeeting));}
    }

