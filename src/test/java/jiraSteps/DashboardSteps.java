package jiraSteps;

import jiraPages.TaskListPage;
import io.qameta.allure.Step;

import static jiraPages.DashboardPage.*;
import static jiraPages.TaskListPage.*;
import static jiraSteps.TaskListSteps.checkCountOfTasks;

public class DashboardSteps {

    @Step("Находим задачу {nameOfTask}")
    public static String findTask(String nameOfTask) {
        projects.click();
        nameOfProject.click();
        panelElement.click();
        checkCountOfTasks();
        String taskNumber = TaskListPage.getTask(nameOfTask).getAttribute("title");
        return taskNumber;
    }
}
