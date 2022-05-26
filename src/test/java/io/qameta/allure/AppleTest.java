package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AppleTest {

    @Test
    @AllureId("1137")
    @DisplayName("Авторизация через Apple")
    @Tag("web")
    @Story("Внешняя авторизация")
    @Owner("admin")
    @Feature("Авторизация")
    public void testAuth() {
        step("Открываем главную страницу");
        step("Выбираем способ авторизации через Apple");
        step("Авторизуемся как пользователь `Random User 10`", () -> {
            step("Вводим логин `random-user-10`");
            step("Вводим пароль `random-pass-10`");
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем что данные из Apple обновили информацию о пользователе", () -> {
            step("Имя пользователя `Random User 10`");
            step("Логин пользователя `random-user-10`");
            step("Email пользователя `random-user-10@gmail.com`");
        });
        step("Разлогиниваемся");
    }

}
