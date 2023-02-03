package com.choucair.userinterfaces.schedulemeeting;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage {
    public static  final Target MEETING=Target.the("Click in meeting module ").locatedBy("//*[@id='nav_menu1_3']/li[2]/a/span");
    public static  final Target MEETINGS=Target.the("Click in meetings section").located(By.xpath("//*[@id='nav_menu1_3_2']/li[1]/a/span"));
    public static  final Target BUTONNEWMEETING=Target.the("Click in meetings section").located(By.xpath("//*[@id='GridDiv']/div[2]/div[2]/div/div/div[1]/div/span"));
    public static  final Target MEETINGNAME=Target.the("add meeting name").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static  final Target MEETINGTYPE=Target.the("add meeting name").located(By.id("select2-chosen-6"));
    public static  final Target CHOOSEMEETINGTYPE=Target.the("add meeting name").located(By.id("s2id_autogen6_search"));
    public static  final Target CALENDARONE=Target.the("Click in meetings section").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/button/i"));
    public static  final Target DAY=Target.the("").located(By.xpath(""));
    public static  final Target MONTH=Target.the("").located(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/select[1]"));
    public static  final Target SELECTMONTH=Target.the("").located(By.xpath(""));

}
