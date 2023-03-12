package jiraSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.Assert;

import java.time.Duration;

import static jiraPages.TaskPage.*;
import static com.codeborne.selenide.Selenide.sleep;

public class TaskSteps {

    @Step("Проверяем информацию в задаче. Сравниваем со значениями статуса {taskStatus} и версии {taskVersion}")
    public static void checkTaskInformation(String taskStatus, String taskVersion) {
        String status = statusTask.getText().trim();
        String version = versionTask.getText().trim();
        Assert.assertEquals("Неверный статус", taskStatus, status);
        Assert.assertEquals("Неправильная привязка затронутой версии", taskVersion, version);
    }

    @Step("Закрываем задачу")
    public static void goToCloseStatus() {
        needToDo.click();
        Assert.assertEquals("Неверный статус", "СДЕЛАТЬ", statusTask.getText());

        inWork.click();
        sleep(2000);
        Assert.assertEquals("Неверный статус", "В РАБОТЕ", statusTask.getText());

        process.click();
        done.shouldBe(Condition.visible, Duration.ofSeconds(3)).click();
        sleep(2000);
        Assert.assertEquals("Неверный статус", "ГОТОВО", statusTask.getText());
    }
}
