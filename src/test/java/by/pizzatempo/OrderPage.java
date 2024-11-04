package by.pizzatempo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


public class OrderPage {

    private WebDriver webDriver;

    OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void toClick(String xPath) {
        By byClickXpath = By.xpath(xPath);
        WebElement webElementClick = webDriver.findElement(byClickXpath);
        webElementClick.click();
    }

    public void toOrderPizza() {
        toClick(OrderXpath.CLICK_PIZZA_XPATH);
        toClick(OrderXpath.CLICK_ORDER_PIZZA_XPATH);
        toClick(OrderXpath.CLICK2_ORDER_PIZZA_XPATH);
    }

    public void toOrderDrink() {
        toClick(OrderXpath.CLICK_DRINK_XPATH);
        toClick(OrderXpath.CLICK_ORDER_DRINK_XPATH);
    }

    public ArrayList<String> toGetOrder(String xPath) {
        List<WebElement> elements = webDriver.findElements(By.xpath(xPath));
        ArrayList<String> orderList = new ArrayList<>();
        for (WebElement element : elements) {
            if (!(element.getText().isBlank()))
                orderList.add(element.getText());
        }
        return orderList;
    }
}
