package jiraSteps;

import jiraPages.AuthorizationPage;
import io.qameta.allure.Step;

public class AuthorizationSteps {

    @Step("Авторизация по логину {username}")
    public static void authorizationStep(String username, String password) {
        AuthorizationPage.username.setValue(username);
        AuthorizationPage.password.setValue(password);
        AuthorizationPage.login.click();
    }

}
