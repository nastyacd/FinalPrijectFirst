package jiraPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationPage {
    public static SelenideElement username = $x("//input[@name='os_username']");
    public static SelenideElement password = $x("//input[@name='os_password']");
    public static SelenideElement login = $x("//input[@name='login']");

}
