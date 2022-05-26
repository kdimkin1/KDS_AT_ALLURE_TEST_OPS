package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("admin")
@Feature("Авторизация")
@Story("Внешняя авторизация")
public class GithubTest {

    @Test
    @Tag("web")
    @AllureId("1136")
    @DisplayName("Авторизация через GitHub")
    public void testAuth() {
        step("Открываем главную страницу", () -> {
            // вот здесь логика проверок
        });
        step("Выбираем способ авторизации через Github");
        step("Авторизуемся как пользователь `Random User 10`", () -> {
            step("Вводим логин `random-user-10`");
            step("Вводим пароль `random-pass-10`");
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем что данные из Google обновили информацию о пользователе", () -> {
            step("Имя пользователя `Random User 10`");
            step("Логин пользователя `random-user-10`");
            step("Email пользователя `random-user-10@gmail.com`");
        });
        step("Разлогиниваемся");
    }

}
