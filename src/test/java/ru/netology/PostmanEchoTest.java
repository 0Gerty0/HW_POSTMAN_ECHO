package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {

    @Test
    void shouldReturnSentData() {
        // Отправляем POST-запрос с телом "some data"
        given()
                .baseUri("https://postman-echo.com") // URL Postman Echo
                .body("some data") // Тело запроса
                .when()
                .post("/post") // Конечная точка POST
                .then()
                .statusCode(200) // Проверяем, что статус ответа 200
                .body("data", equalTo("incorrect data")); // Проверяем, что тело ответа совпадает
    }
}
