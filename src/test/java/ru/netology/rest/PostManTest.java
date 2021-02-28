package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostManTest {
    @Test
    void shouldTest() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("bar1") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("bar"))
        ;
    }
}
