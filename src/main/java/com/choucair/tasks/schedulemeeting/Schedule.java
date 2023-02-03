package com.choucair.tasks.schedulemeeting;

import com.choucair.models.schedulemeeting.DataModelScheduleMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
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

        actor.attemptsTo(
                Click.on(MEETING),
                Click.on(MEETINGS),
                Click.on(BUTONNEWMEETING),
                Enter.theValue(data.get(0).getStrMeetingName()).into(MEETINGNAME),
                Click.on(MEETINGTYPE),
                Enter.theValue(data.get(0).getStrMeetingType()).into(CHOOSEMEETINGTYPE),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(CHOOSEMEETINGTYPE),
                Click.on(CALENDARONE),
                Click.on(MONTH)







                );


    }
}
