package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ManualTest {
    @Test
    @Manual
    @DisplayName("Проверка авторизации через Github")
    public void testAuth(){
        step ("1. Открываем главную страницу");
        step ("2. Авторизуемся как пользователь KDS", () -> {
            step ("2.1. Вводим логин: kds");
            step ("2.2. Вводим пароль: kds_pass");
            step ("2.3. Нажимаем кнопку: Войти");
        });
        step ("4. Шаг 4");
        step ("5. Шаг 5");
        step ("6. Шаг 6");
// по готовности описания со steps:
// 1. выполняем Run manual теста
// 2. выполняем Uploads Results to Allure (ПКМ по builds/allure-results)
//    Project:
//    Launch Name:

    }
}
