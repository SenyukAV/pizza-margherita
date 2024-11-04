package by.pizzatempo;

import org.junit.jupiter.api.*;

public class OrderTest extends BasePage {

    @Test
    @DisplayName("Заказ пиццы Маргарита и Квас")
    public void orderPizza() {
        OrderPage orderPage = new OrderPage(webDriver);

        orderPage.toOrderPizza();

        orderPage.toOrderDrink();

        webDriver.get("https://www.pizzatempo.by/menu/order/");

        String expected1 = orderPage.toGetOrder(OrderXpath.BASKET_XPATH).get(0);
        String expected2 = orderPage.toGetOrder(OrderXpath.BASKET_XPATH).get(1);

        if (expected1.contains("Пицца")) {
            Assertions.assertEquals(expected1, OrderExpect.EXPECT_PIZZA_TEXT);
        } else {
            Assertions.assertEquals(expected2, OrderExpect.EXPECT_PIZZA_TEXT);
        }
        if (expected1.contains("Квас")) {
            Assertions.assertEquals(expected1, OrderExpect.EXPECT_DRINK_TEXT);
        } else {
            Assertions.assertEquals(expected2, OrderExpect.EXPECT_DRINK_TEXT);
        }
    }
}




