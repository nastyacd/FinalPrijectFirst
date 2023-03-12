package jiraPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskListPage {

    public static SelenideElement panelElement = $x("(//a[@class='aui-nav-item '])[1]");
    public static SelenideElement countOfTasks = $x("(//div[contains(text(),'Список задач')]/following-sibling::div)[1]");
    public static SelenideElement searchField = $x("//input[@id='quickSearchInput']");

    public static SelenideElement getTask(String name) {
        return $x("//span[text()='" + name + "']/../..//a");
    }
}
