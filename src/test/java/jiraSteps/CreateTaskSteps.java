package jiraSteps;

import io.qameta.allure.Step;

import static jiraPages.CreateTaskPage.*;
import static jiraPages.DashboardPage.*;
import static com.codeborne.selenide.Selenide.switchTo;

public class CreateTaskSteps {
    @Step("Создаем задачу типа {summary} c описанием {description}")
    public static String createTask(String summary, String description, String environment, String priority, String issueType) {
        create.click();
        switchTo().frame(descriptionFrame);


        fieldBody.setValue(description); //описание

        switchTo().parentFrame().switchTo().frame(environmentFrame);
        fieldBody.setValue(environment); //окружение
        switchTo().parentFrame();

        fieldSummary.setValue(summary); //тема

        priorityButton.click();
        priorityField.sendKeys(priority);// приоритет
        priorityField.pressEnter();

        issueTypeButton.click();
        issueTypeField.sendKeys(issueType);// тип задачи
        issueTypeField.pressEnter();

        createSubmit.click();

        String taskNumber = issueKey.getAttribute("data-issue-key");
        return taskNumber;
    }

}
