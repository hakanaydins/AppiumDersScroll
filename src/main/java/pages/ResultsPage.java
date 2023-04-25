package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ResultsPage {

    ElementHelper elementHelper;

    By shareIcon = By.id("com.sahibinden:id/action_share");
    By filters = By.id("");
    By order = By.id("");
    By firstOrderPrice = By.id("");


    public ResultsPage(WebDriver driver) {

        this.elementHelper = new ElementHelper(driver);
    }

    public void checkShareIcon() {

        elementHelper.checkElement(shareIcon);
    }

    public void clickFilters() {
        elementHelper.click(filters);


    }
    public void clickOrder() {
        elementHelper.click(order);


    }


    public String getFirstOrderPrice() {
        String price = elementHelper.getText(firstOrderPrice);

        return price;


    }
}
