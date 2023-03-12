package jiraPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskPage {

    public static SelenideElement statusTask = $x("//span[@id='status-val']");
    //специально для формирования ошибки xpath изменен на неверный
    public static SelenideElement versionTask = $x("//span[@id='versions-val1']");
    public static SelenideElement needToDo = $x("//span[contains(text(),'Нужно сделать')]/..");
    public static SelenideElement inWork = $x("//span[contains(text(),'В работе') and @class='trigger-label']/..");
    public static SelenideElement process = $x("//span[contains(text(),'Бизнес-процесс') and @class='dropdown-text']/..");
    public static SelenideElement done = $x("//span[contains(text(),'Выполнено') and @class='trigger-label']/..");

}
