package tests;

import hooks.Hooks;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

import static jiraSteps.CreateTaskSteps.createTask;
import static jiraSteps.DashboardSteps.findTask;
import static jiraSteps.TaskListSteps.searchTask;
import static jiraSteps.TaskSteps.checkTaskInformation;
import static jiraSteps.TaskSteps.goToCloseStatus;

@Epic("Jira тесты")  // добавлено над классом
public class JiraTests extends Hooks {

    @Feature("Поиск и проверка задачи")
    @Test
    public void checkTaskTest() {
        String taskNumber = findTask(property.getProperty("name.of.task"));
        searchTask(taskNumber);

        checkTaskInformation(property.getProperty("task.status"), property.getProperty("task.version"));
    }

    @Feature("Создание Бага и прогон статуса задачи")
    @Test
    public void createBugTest() {
        String taskNumber = createTask(
                property.getProperty("summary"),
                property.getProperty("description"),
                property.getProperty("environment"),
                property.getProperty("priority"),
                property.getProperty("issue.type")
        );
        searchTask(taskNumber);

        goToCloseStatus();
    }

}
