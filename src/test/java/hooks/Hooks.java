package hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static jiraSteps.AuthorizationSteps.authorizationStep;

public class Hooks {
    public Properties property = new Properties();

    @BeforeEach
    public void beforeEach() {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/application.properties");
            property.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true)); // для отображения в отчете скриншотов и шагов
        Configuration.startMaximized = true;
        open(property.getProperty("url"));
        authorizationStep(property.getProperty("login"), property.getProperty("password"));
    }

    @AfterEach
    public void afterEach() {
        closeWebDriver();
    }
}
