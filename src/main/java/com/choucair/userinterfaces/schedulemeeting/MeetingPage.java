package com.choucair.userinterfaces.schedulemeeting;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage {
    public static  final Target MEETING=Target.the("Click in meeting module ").locatedBy("//*[@id='nav_menu1_3']/li[2]/a/span");
    public static  final Target MEETINGS=Target.the("Click in meetings section").located(By.xpath("//*[@id='nav_menu1_3_2']/li[1]/a/span"));
    public static  final Target BUTONNEWMEETING=Target.the("Click in meetings section").located(By.xpath("//*[@id='GridDiv']/div[2]/div[2]/div/div/div[1]/div/span"));

    public static  final Target MEETINGNAME=Target.the("add meeting name").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static  final Target MEETINGNUMBER=Target.the("add meeting name").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static  final Target MEETINGTYPE=Target.the("add meeting name").located(By.id("select2-chosen-6"));
    public static  final Target CHOOSEMEETINGTYPE=Target.the("add meeting name").located(By.id("s2id_autogen6_search"));

    public static  final Target CALENDAR=Target.the("").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/button/i"));
    public static final Target SELECT_MONTH = Target.the("Select month").located(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]"));
    public static final Target SELECT_YEAR = Target.the("Select Year").located(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[2]"));
    public static final Target HOURSTART = Target.the("").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select"));
    public static final Target HOUREND = Target.the("").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/select"));
    public static  final Target CALENDAREND=Target.the("").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/button/i"));
    public static  final Target LOCATION=Target.the("").located(By.id("select2-chosen-7"));
    public static  final Target CHOOSELOCATION=Target.the("").located(By.id("s2id_autogen7_search"));
    public static  final Target UNIT=Target.the("").located(By.id("select2-chosen-8"));
    public static  final Target CHOOSEUNIT=Target.the("").located(By.id("s2id_autogen8_search"));
    public static  final Target ORGANIZE=Target.the("").located(By.id("select2-chosen-9"));
    public static  final Target CHOOSEORGANIZE=Target.the("").located(By.id("s2id_autogen9_search"));
    public static  final Target REPORTER=Target.the("").located(By.id("select2-chosen-10"));
    public static  final Target CHOOSEREPORTER=Target.the("").located(By.id("s2id_autogen10_search"));
    public static  final Target ATTENDEE=Target.the("").located(By.id("select2-chosen-12"));
    public static  final Target CHOOSEATTENDEE=Target.the("").located(By.id("s2id_autogen12_search"));
    public static  final Target BUTTONSAVE=Target.the("").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_Toolbar']/div/div/div/div[1]"));



}
