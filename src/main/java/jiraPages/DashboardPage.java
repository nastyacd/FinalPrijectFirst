package jiraPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DashboardPage {

    public static SelenideElement projects = $x("//a[@id='browse_link']");
    public static SelenideElement nameOfProject = $x("//a[contains(text(),'Test (TEST)')]");
    public static SelenideElement create = $x("//a[@id='create_link']");
    public static SelenideElement issueKey = $x("//a[@class='issue-created-key issue-link']");

}
