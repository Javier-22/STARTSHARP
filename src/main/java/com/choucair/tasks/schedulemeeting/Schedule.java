package com.choucair.tasks.schedulemeeting;

import com.choucair.utils.interactions.SelectDay;
import com.choucair.models.schedulemeeting.DataModelScheduleMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.choucair.userinterfaces.schedulemeeting.MeetingPage.*;

public class Schedule implements Task {

    private List<DataModelScheduleMeeting> data;
    public Schedule(List<DataModelScheduleMeeting> data){this.data=data;}

    public static Schedule meeting(List<DataModelScheduleMeeting> data) {return Tasks.instrumented(Schedule.class, data);}

    @Override
    public <T extends Actor> void performAs(T actor) {


        String date = data.get(0).getStrStartDate();
        String[] datesplit = date.split("/");

        String dateend = data.get(0).getStrEndDate();
        String[] datesplitend = date.split("/");


        actor.attemptsTo(
                Click.on(MEETING),
                Click.on(MEETINGS),
                Click.on(BUTONNEWMEETING),
                Enter.theValue(data.get(0).getStrMeetingName()).into(MEETINGNAME),
                Click.on(MEETINGTYPE),
                Enter.theValue(data.get(0).getStrMeetingType()).into(CHOOSEMEETINGTYPE),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(CHOOSEMEETINGTYPE),

                Click.on(CALENDAR),
                SelectFromOptions.byVisibleText(datesplit[1]).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(datesplit[2]).from(SELECT_YEAR),
                SelectDay.datosInteraccion(datesplit[0]),
                SelectFromOptions.byVisibleText(data.get(0).getStrhourStart()).from(HOURSTART),
                Click.on(CALENDAREND),
                SelectFromOptions.byVisibleText(datesplitend[1]).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(datesplitend[2]).from(SELECT_YEAR),
                SelectDay.datosInteraccion(datesplitend[0]),
                SelectFromOptions.byVisibleText(data.get(0).getStrhourEnd()).from(HOUREND),
                Enter.theValue(data.get(0).getStrMeetingNumber()).into(MEETINGNUMBER),
                Click.on(LOCATION),
                Enter.theValue(data.get(0).getStrLocation()).into(CHOOSELOCATION),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(CHOOSELOCATION),
                Click.on(UNIT),
                Enter.theValue(data.get(0).getStrUnit()).into(CHOOSEUNIT),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(CHOOSEUNIT),
                Click.on(ORGANIZE),
                Enter.theValue(data.get(0).getStrOrganizedBy()).into(CHOOSEORGANIZE),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(CHOOSEORGANIZE),
                Click.on(REPORTER),
                Enter.theValue(data.get(0).getStrReporter()).into(CHOOSEREPORTER),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(CHOOSEREPORTER),
                Click.on(ATTENDEE),
                Enter.theValue(data.get(0).getStrAttendeeList()).into(CHOOSEATTENDEE),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(CHOOSEATTENDEE),
                Click.on( BUTTONSAVE),
                Click.on(MEETINGS)

        );
    }
}
