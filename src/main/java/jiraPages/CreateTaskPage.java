package jiraPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreateTaskPage {
    public static SelenideElement descriptionFrame = $x("(//iframe)[2]");
    public static SelenideElement fieldBody = $x("//html/body");
    public static SelenideElement environmentFrame = $x("(//iframe)[3]");
    public static SelenideElement fieldSummary = $x("//input[@id='summary']");

    public static SelenideElement priorityButton = $x("//div[@id='priority-single-select']//span");
    public static SelenideElement priorityField = $x("//input[@id='priority-field']");
    public static SelenideElement issueTypeButton = $x("//div[@id='issuetype-single-select']//span");
    public static SelenideElement issueTypeField = $x("//input[@id='issuetype-field']");

    public static SelenideElement createSubmit = $x("//input[@id='create-issue-submit']");

}
