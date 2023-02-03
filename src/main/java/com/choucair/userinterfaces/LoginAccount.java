package com.choucair.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginAccount {
    public static  final Target USERNAME=Target.the("Enter the username").located(By.id("LoginPanel0_Username"));
    public static  final Target PASSWORD=Target.the("Enter the password").located(By.id("LoginPanel0_Password"));
    public static  final Target ACCESSBUTTON=Target.the("Click on the button to access the platform").located(By.id("LoginPanel0_LoginButton"));
}
